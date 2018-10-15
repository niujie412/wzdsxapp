package com.niu.controller;


import com.niu.VO.ResponseVO;
import com.niu.utils.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@RestController
@RequestMapping(value = "/upload")
@Slf4j
public class UploadController {

    @Value("${web.upload-path}")
    private String path;


    @PostMapping(value = "/uploadimg")
    public String uploadimg(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        if (file.isEmpty()){
            return "上传文件为空";
        }
        //获取上传的文件名称
        String fileName = file.getOriginalFilename();
        log.info("fileName= {}" , fileName);
        String filePath = path;
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        try{
            file.transferTo(dest);
            log.info("path={}",filePath);
            return filePath+fileName;
        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return "上传失败" ;
//        if (!file.isEmpty()){
//            try {
//                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
//                outputStream.write(file.getBytes());
//                outputStream.flush();
//                outputStream.close();
//
//            }catch (FileNotFoundException e){
//                e.printStackTrace();
//                return "上传失败"+e.getMessage();
//            }catch (IOException e){
//                e.printStackTrace();
//                return "上传失败"+ e.getMessage();
//            }
//            log.info("file={}",file.getOriginalFilename());
//            log.info("path={}",request.getServletContext().getContextPath());
////            log.info("realPath={}", WebUtils.getRealPath());
//            try {
//                File path = new File(new File(String.valueOf(ResourceUtils.getURL("classpath"))).getPath());
//                if (!path.exists()){
//                    path= new File("");
//                }
//                log.info("path1={}",path.getAbsoluteFile());
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//
//
//            return "上传成功";
//        }else {
//            return "文件为空";
//        }

    }


    public static void uploadfile(byte[] file, String filepath, String filename) throws Exception {
        File targetFile = new File(filepath);
        if (!targetFile.exists()){
            targetFile.mkdir();
        }
        FileOutputStream out = new FileOutputStream(filepath+filename);
        out.write(file);
        out.flush();
        out.close();
    }
}
