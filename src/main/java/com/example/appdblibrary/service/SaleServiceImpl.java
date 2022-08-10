package com.example.appdblibrary.service;

import com.example.appdblibrary.entity.order.Sale;
import com.example.appdblibrary.exception.RestException;
import com.example.appdblibrary.mapper.SaleMapper;
import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.SaleAddDTO;
import com.example.appdblibrary.payload.SaleInfoDTO;
import com.example.appdblibrary.repository.order.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    private final SaleMapper saleMapper;

    @Override
    public ApiResult<List<SaleInfoDTO>> getAll(int page, int size) {
        List<Sale> saleList = saleRepository.findAll();
        List<SaleInfoDTO> saleInfoDTOList = new ArrayList<>();
        for (Sale sale : saleList) {
            saleInfoDTOList.add(saleMapper.saleResToDoDTO(sale));
        }
        return ApiResult.successResponse(saleInfoDTOList);

    }

    @Override
    public ApiResult<SaleInfoDTO> getOne(Long id) {
        Sale sale = getByIdOrElseThrow(id);
        if (Objects.isNull(sale)) {
            throw RestException.notFound("Sale");
        }
        return ApiResult.successResponse(entityToInfoDTO(sale));
    }

    @Override
    public ApiResult<SaleInfoDTO> add(SaleAddDTO saleAddDTO) {
        Sale sale = new Sale(
                saleAddDTO.getName(),
                saleAddDTO.getDescription(),
                saleAddDTO.getType(),
                saleAddDTO.getAmount()
        );
        Sale save = saleRepository.save(sale);
        return ApiResult.successResponse(saleMapper.saleResToDoDTO(save));
    }

    @Override
    public ApiResult<SaleInfoDTO> update(SaleAddDTO saleAddDTO, Long id) {
        Sale sale = saleRepository.findById(id).orElseThrow(() -> new RestException("Sale", HttpStatus.NOT_FOUND));
        sale.setName(saleAddDTO.getName());
        sale.setSaleType(saleAddDTO.getType());
        sale.setAmount(saleAddDTO.getAmount());
        Sale save = saleRepository.save(sale);

        return ApiResult.successResponse(saleMapper.saleResToDoDTO(save));
    }

    @Override
    public ApiResult<?> delete(Long id) {
        Sale sale = getByIdOrElseThrow(id);
        saleRepository.delete(sale);
        return ApiResult.successResponse("Success");
    }

    private SaleInfoDTO entityToInfoDTO(Sale sale) {
        return saleMapper.entityToInfoDTO(sale);
    }

    public Sale getByIdOrElseThrow(Long id) {
        return saleRepository.findById(id).orElseThrow(()
                -> RestException.notFound("Sale"));
    }
}

