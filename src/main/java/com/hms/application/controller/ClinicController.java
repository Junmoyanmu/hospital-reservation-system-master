package com.hms.application.controller;

import com.hms.application.entity.Clinic;
import com.hms.application.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * 诊所控制器
 */

@Controller
public class ClinicController {
    @Autowired
    ClinicService clinicService;

    @RequestMapping(value = "/admin/clinic.html")
    public String clinic(Model model) {
        List<Clinic> clinicList = clinicService.findAll();

        model.addAttribute("clinics", clinicList);

        return "admin/clinic";
    }


//    新增分诊所
    @PostMapping(value = "/admin/clinic/add_submit")
    public String clinicAddSubmit(@RequestParam String clinicNumber,
                                  @RequestParam String clinicName,
                                  @RequestParam String clinicAddress,
                                  Model model) {
        Clinic clinic = new Clinic();
        clinic.setClinicNumber(clinicNumber);
        clinic.setDocClinic(clinicName);
        clinic.setClinicAddress(clinicAddress);
        Date date = new Date();
        clinic.setClinicTime(date);
        clinicService.saveAndFlush(clinic);

//        刷新列表
        List<Clinic> clinicList = clinicService.findAll();
        model.addAttribute("clinics", clinicList);

        model.addAttribute("add_success", "分诊所新增成功！");

        return "admin/clinic";
    }


    @PostMapping(value = "/admin/clinic/modify_submit")
    public String clinicModifySubmit(@RequestParam String preNumber,
                                     @RequestParam String clinicNumber2,
                                     @RequestParam String clinicName2,
                                     @RequestParam String clinicAddress2,
                                     Model model) {
//        根据修改前的诊所编号查找记录，然后修改
        Clinic clinic = clinicService.findOneByClinicNumber(preNumber);
        clinic.setClinicNumber(clinicNumber2);
        clinic.setDocClinic(clinicName2);
        clinic.setClinicAddress(clinicAddress2);

        clinicService.saveAndFlush(clinic);

//        刷新列表
        List<Clinic> clinicList = clinicService.findAll();
        model.addAttribute("clinics", clinicList);

        model.addAttribute("modify_success", "分诊所信息修改成功！");

        return "admin/clinic";
    }
}
