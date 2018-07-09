import models.Randomiser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomiserTest {

    Randomiser rand;

    @Before
    public void setUp() throws Exception {
        rand = new Randomiser();
    }

    @Test
    public void hasNames() {
        assertEquals(rand.getNames().size(), 19);
    }

    @Test
    public void randomName(){
        System.out.println(rand.oneRandoName());
    }

    @Test
    public void randomList(){
        System.out.println(rand.twoRandoNames());
    }
}
