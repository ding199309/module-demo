import com.test.model.Student;
import com.test.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/8/25 16:48
 * @parameter
 * @return
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {

    @Resource
    private StudentService studentService;


    @Test
    public void addTest() throws Exception {
        Student student=new Student();
        student.setName("王同学");
        student.setSex(false);
        student.setAddress("中国钓鱼岛");
        System.out.println(studentService.addStudent(student));
    }
    @Test
    public void deleteTest()throws Exception{
        System.out.println(studentService.deleteStudentById(1));

    }
    @Test
    public void updateTest()throws Exception{
        Student student=new Student();
        student.setId(new Integer("4"));
        student.setAddress("中国");
        System.out.println(studentService.updateStudentById(student));
    }
}
