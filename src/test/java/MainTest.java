import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTest {

    @Test
    @SuppressWarnings("all")
    public void testMain() {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        int one = 1;
        int two = 1;
        while (one == two) {
            integerList.add(random.nextInt());
        }

        Assert.assertTrue("is empty", !integerList.isEmpty());
    }

}
