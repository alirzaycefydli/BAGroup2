package WWSIS.BAGroup2;

import WWSIS.BAGroup2.dao.Impl.StudentDaoImpl;
import WWSIS.BAGroup2.entity.StudentEntity;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testMain(){
        StudentDaoImpl impl = new StudentDaoImpl();
        impl.getStudentById(1);
        assertTrue("",true);
    }
}
