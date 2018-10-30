package com.wangzu.dao;

import java.util.List;

import com.wangzu.vo.StudentVO;

public interface StudentMapper {
	List<StudentVO> findStudentListByPage(StudentVO stu);

	StudentVO findStudentInfoByStuId(Integer stuId);

	int insertStudent(StudentVO stu);

	int updateStudentByStuId(StudentVO stu);

	int deleteStudentByStuId(Integer stuId);
}
