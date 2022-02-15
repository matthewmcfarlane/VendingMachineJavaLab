import org.junit.Before;
import org.junit.Test;
import products.Sweets;

import static org.junit.Assert.assertEquals;

public class SweetsTest {

    private Sweets sweet;

    @Before
    public void before(){
        sweet = new Sweets("Starbar");
    }

    @Test
    public void hasName() {
        assertEquals("Starbar", sweet.getName());
    }


}
