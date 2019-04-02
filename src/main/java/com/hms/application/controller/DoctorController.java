package com.hms.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 医生控制器
 */

@Controller
public class DoctorController {

    @RequestMapping(value = "/admin/doctor_create.html")
    public String doctorCreate() {
        return "admin/doctor_create.html";
    }

    @RequestMapping(value = "/upload")
    public String upload(@RequestParam(value = "file") MultipartFile file) {
        if (! file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            String filePath = "/home/ubuntu/upload/doctor_img";

            fileName = UUID.randomUUID() + suffixName;
            File image = new File(filePath + fileName);
            if (!image.getParentFile().exists()) {
                image.getParentFile().mkdir();
            }
            try {
                file.transferTo(image);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return "admin/doctor_create.html";
    }
}
