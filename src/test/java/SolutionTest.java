import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void sortArrayByParityTest1(){
        int[] nums = {3,1,2,4};
        int[] expected = {4,2, 1,4};

        int[] actual = new Solution().sortArrayByParity(nums);

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void sortArrayByParityTest2(){
        int[] nums = {0};
        int[] expected = {0};

        int[] actual = new Solution().sortArrayByParity(nums);

        Assert.assertArrayEquals(expected, actual);
    }
}
