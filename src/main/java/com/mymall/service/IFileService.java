package com.mymall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by bestone on 4/24/2018.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
