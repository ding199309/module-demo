package com.test.service.impl;

import com.test.dao.StudentDao;
import com.test.model.Student;
import com.test.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/8/25 16:39
 * @parameter
 * @return
 */

@Service("StudentService")
public class StudentServiceImpl implements StudentService {


    @Resource
    private StudentDao studentDao;

    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean deleteStudentById(Integer id) {
        Student student=new Student();
        student.setId(id);
        return studentDao.delete(student);
    }
    public Boolean updateStudentById(Student student) {
        return studentDao.update(student);
    }


}
