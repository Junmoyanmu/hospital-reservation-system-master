package com.hms.application.controller;

import com.hms.application.entity.Department;
import com.hms.application.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 科室管理控制器
 */

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

//    进入科室管理页面，显示数据
    @RequestMapping(value = "admin/department.html")
    public String department(Model model) {
        List<Department> departmentList = departmentService.findAll();

        model.addAttribute("departments", departmentList);

        return "admin/department";
    }

//    新增科室
    @PostMapping(value = "/admin/department/add_submit")
    public String departmentAddSubmit(@RequestParam String departmentNumber,
                                      @RequestParam String departmentName,
                                      Model model) {
        Department department = new Department();
        department.setDepartmentNumber(departmentNumber);
        department.setDepartmentName(departmentName);

        departmentService.saveAndFlush(department);
//        刷新数据
        List<Department> departmentList = departmentService.findAll();

        model.addAttribute("departments", departmentList);
        model.addAttribute("add_success", "新增科室成功！");

        return "admin/department";
    }

    @PostMapping(value = "/admin/department/modify_submit")
    public String departmentModifySubmit(@RequestParam String preNumber,
                                        @RequestParam String departmentNumber2,
                                        @RequestParam String departmentName2,
                                        Model model) {
        /**
         * 前端校验不修改数据的情况
         **/
        Department department = departmentService.findOneByDepartmentNumber(preNumber);
        System.out.println(department == null);
        if (department != null) {
            department.setDepartmentNumber(departmentNumber2);
            department.setDepartmentName(departmentName2);

            departmentService.saveAndFlush(department);

            List<Department> departmentList = departmentService.findAll();

            model.addAttribute("departments", departmentList);
            model.addAttribute("modify_success", "修改科室成功！");
        }

        return "admin/department";
    }
}
