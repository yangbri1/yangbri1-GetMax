
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetMaxTest {
    public static GetMax gm;
    @BeforeClass
    public static void setUp(){
        gm = new GetMax();
    }

    /**
     * the largest value of {0,1,2,3,4} should be 4.
     */
    @Test
    public void getMaxTest1(){
        int[] input = {0,1,2,3,4};
        int expected = 4;
        Assert.assertEquals(expected, gm.max(input));
    }

    /**
     * the largest value of {9,8,10,3,4} should be 10.
     */
    @Test
    public void getMaxTest2(){
        int[] input = {9,8,10,3,4};
        int expected = 10;
        Assert.assertEquals(expected, gm.max(input));
    }

    /**
     * the largest value of {-100, -383, -45, -901, -76} should be -45.
     */
    @Test
    public void getMaxTest3(){
        int[] input = {-100, -383, -45, -901, -76};
        int expected = -45;
        Assert.assertEquals(expected, gm.max(input));
    }
}
