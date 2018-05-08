package com.mymall.service.impl;

import com.google.common.collect.Lists;
import com.mymall.service.IFileService;
import com.mymall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by bestone on 4/24/2018.
 */

@Service("iFileService")
public class FileServiceImpl implements IFileService{

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file,String path){
        String fileName = file.getOriginalFilename();                                //获取原始文件名
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".")+1);  //获取文件扩展名，从后往前数第一个小数点
        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;
        logger.info("开始上传文件，上传文件的文件名:{},上传路径:{},新文件名:{}",fileName,path,uploadFileName);

        File fileDir = new File(path);       //
        if(!fileDir.exists()){
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }

        File targetFile = new File(path,uploadFileName);

        try {
            file.transferTo(targetFile);
            //文件已经上传成功
            FTPUtil.uploadFile(Lists.newArrayList(targetFile));  //将targetFile上传到FTP服务器
            targetFile.delete();    //上传完之后，删除upload下的文件
        } catch (IOException e) {
            logger.error("上传文件异常",e);
            return null;
        }
        return targetFile.getName();
    }













}
