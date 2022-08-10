package com.example.appdblibrary.service;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.AttachmentDTO;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public interface AttachmentService {
    ApiResult<AttachmentDTO> uploadDb(MultipartHttpServletRequest request);

    void downloadDb(Long id, boolean inline, HttpServletResponse response);

}
