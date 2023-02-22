import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTests {

    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){

        databaseAdmin = new DatabaseAdmin( "Bob", 124123, 40000);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals( 45000 , databaseAdmin.raiseSalary(5000), 00);
    }

    @Test
    public void canCheckPayBonus(){
        assertEquals( 400 , databaseAdmin.payBonus());
    }
}
