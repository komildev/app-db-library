package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.AttachmentDTO;
import com.example.appdblibrary.utils.AppConstant;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@RequestMapping(AppConstant.ATTACHMENT_CONTROLLER_PATH)
public interface AttachmentController {


  //  @PreAuthorize(value = "hasAuthority('UPLOAD_ATTACHMENT')")
    @PostMapping(AppConstant.UPLOAD_PATH)
    ApiResult<AttachmentDTO> upload(MultipartHttpServletRequest request);

   // @PreAuthorize(value = "hasAuthority('DOWNLOAD_ATTACHMENT')")
    @GetMapping(AppConstant.DOWNLOAD_PATH + "/{id}")
    void download(@PathVariable Long id,
                  @RequestParam(defaultValue = "false") boolean inline,
                  HttpServletResponse response);
}
