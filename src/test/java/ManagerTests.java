import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTests {

    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Entertainment", "Bob", 124123, 40000);
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Entertainment", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals( 45000 , manager.raiseSalary(5000), 00);
    }

    @Test
    public void canCheckPayBonus(){
        assertEquals( 400 , manager.payBonus());
    }
}
