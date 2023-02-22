import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTests {

    Developer developer;
    @Before
    public void before(){
        developer = new Developer( "Bob", 124123, 40000);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals( 45000 , developer.raiseSalary(5000), 00);
    }

    @Test
    public void canCheckPayBonus(){
        assertEquals( 400 , developer.payBonus());
    }

    @Test
    public void canComplainAboutJavaScript(){
        assertEquals("I haaaate JavaScript!", developer.complain());
    }

    @Test
    public void canChangeName(){
        assertEquals("Dave", developer.changeName("Dave"));
    }
}