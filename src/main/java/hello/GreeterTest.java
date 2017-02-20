package hello;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by fhict on 20/02/2017.
 */
public class GreeterTest {

    @Test
    public void testGreeter(){
        Greeter greeter = new Greeter();
        assertEquals(greeter.Test(),true);
    }

}