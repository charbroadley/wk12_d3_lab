import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class DirectorTests {

        Director director;
        @Before
        public void before(){
            director = new Director( 100000, "Fun Things","Bob", 124123, 60000);
        }

        @Test
        public void canRaiseSalary(){
            assertEquals( 65000 , director.raiseSalary(5000), 00);
        }

        @Test
        public void canCheckPayBonus(){
            assertEquals( 1200 , director.payBonus());
        }

        @Test
        public void canGetBudget(){
            assertEquals(100000, director.getBudget(), 00);
        }
    }
