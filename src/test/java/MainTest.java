import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTest {

    @Test
    @SuppressWarnings("all")
    public void testMain() {

        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        List<Integer> integerList3 = new ArrayList<>();

        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();

        int one = 1;
        int two = 1;

        while (one == two) {

            integerList1.add(random1.nextInt());
            integerList1.add(random2.nextInt());
            integerList1.add(random3.nextInt());

            integerList2.add(random1.nextInt());
            integerList2.add(random2.nextInt());
            integerList2.add(random3.nextInt());

            integerList3.add(random1.nextInt());
            integerList3.add(random2.nextInt());
            integerList3.add(random3.nextInt());

        }

        Assert.assertTrue("is empty", !integerList1.isEmpty());
        Assert.assertTrue("is empty", !integerList2.isEmpty());
        Assert.assertTrue("is empty", !integerList3.isEmpty());
    }

}
