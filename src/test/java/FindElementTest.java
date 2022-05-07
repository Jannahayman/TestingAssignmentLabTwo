import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindElementTest {
    @Test
    public void TestZerosMax()
    {
        int array[]= {0,0,0,0,0,0};
        assertEquals(0,FindElement.FindMax(array));
    }
    @Test
    public void TestZerosMin()
    {
        int array[]= {0,0,0,0,0,0};
        assertEquals(0,FindElement.FindMin(array));
    }
    @Test
    public void TestPositivesMin()
    {
        int array[]= {5,22,33,7,9,9};
        assertEquals(5,FindElement.FindMin(array));
    }
    @Test
    public void TestPositivesMax()
    {
        int array[]= {5,22,33,7,9,9};
        assertEquals(33,FindElement.FindMax(array));
    }

    @Test
    public void TestNegativesMin()
    {
        int array[]= {-88,-9,-2,-34,-41,-99};
        assertEquals(-99,FindElement.FindMin(array));
    }
    @Test
    public void TestNegativesMax()
    {
        int array[]= {-88,-9,-2,-34,-41,-99};
        assertEquals(-2,FindElement.FindMax(array));
    }
    @Test
    public void TestMixedNumsMin()
    {
        int array[]= {-88,9,-2,34,-41,99};
        assertEquals(-88,FindElement.FindMin(array));
    }
    @Test
    public void TestMixedNumsMax()
    {
        int array[]= {-88,9,-2,34,-41,99};
        assertEquals(99,FindElement.FindMax(array));
    }
    @Test
    public void TestLargeNumsMin()
    {
        int array[]= {-88993,92911,-2333,34123,-4139,993213};
        assertEquals(-88993,FindElement.FindMin(array));
    }
    @Test
    public void TestLargeNumsMax()
    {
        int array[]= {-88993,92911,-2333,34123,-4139,993213};
        assertEquals(993213,FindElement.FindMax(array));
    }
}