package com.wxw.spzx.manager.service;

import io.minio.MinioProperties;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: FileUploadService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/23 15:52
 * @Version 1.0
 */
public interface FileUploadService {

    String fileUpload(MultipartFile multipartFile);
}
