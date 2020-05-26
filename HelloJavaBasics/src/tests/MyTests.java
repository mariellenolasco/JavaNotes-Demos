package tests;

import com.revature.models.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTests {
    @Test
    public void catShouldMeow(){
        Cat test = new Cat("Tom");

        assertEquals("Cats meow","meow", test.meow());
    }
}
