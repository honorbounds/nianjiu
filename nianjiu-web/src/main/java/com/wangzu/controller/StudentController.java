package com.wangzu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wangzu.pojo.ResponseEntity;
import com.wangzu.service.StudentService;
import com.wangzu.util.BaseController;
import com.wangzu.vo.StudentVO;

import java.util.List;
public class StudentController extends BaseController{
	@Autowired
    StudentService studentService;

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = "/json/findStudentListByPage")
    public void findStudentListByPage(StudentVO stu){
        ResponseEntity<List<StudentVO>> stuList = studentService.findStudentListByPage(stu);
        writeJson(stuList);
    }

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = "/json/findStudentInfoByStuId")
    public void findStudentInfoByStuId(Integer stuId){
        ResponseEntity<StudentVO> stuList = studentService.findStudentInfoByStuId(stuId);
        writeJson(stuList);
    }

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = "/json/insertStudent")
    public void insertStudent(StudentVO stu){
        ResponseEntity<Object> resObj = studentService.insertStudent(stu);
        writeJson(resObj);
    }

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = "/json/updateStudentByStuId")
    public void updateStudentByStuId(StudentVO stu){
        ResponseEntity<Object> resObj = studentService.updateStudentByStuId(stu);
        writeJson(resObj);
    }

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = "/json/deleteStudentByStuId")
    public void deleteStudentByStuId(Integer stuId){
        ResponseEntity<Object> resObj = studentService.deleteStudentByStuId(stuId);
        writeJson(resObj);
    }
}
