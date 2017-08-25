package com.test.dao;

import com.test.dao.base.BaseDao;
import com.test.model.Student;
import org.springframework.stereotype.Repository;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/8/25 16:32
 * @parameter
 * @return
 */
@Repository
public interface  StudentDao extends BaseDao<Student> {
}
