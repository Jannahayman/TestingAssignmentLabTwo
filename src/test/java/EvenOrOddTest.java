import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class EvenOrOddTest {
    @Test
    public void TestSmallEvenPositiveNums() { assertTrue(EvenOrOdd.CheckEven(10));}
    @Test
    public void TestLargeEvenPositiveNums()
    {
        assertFalse(EvenOrOdd.CheckOdd(1200));
    }
    @Test
    public void TestSmallOddPositiveNums()
    {
        assertTrue(EvenOrOdd.CheckOdd(9));
    }
    @Test
    public void TestLargeOddPositiveNums()
    {
        assertTrue(EvenOrOdd.CheckOdd(1203));
    }
    @Test
    public void TestNegativeNums()
    {
        assertFalse(EvenOrOdd.CheckOdd(-10));
    }
    @Test
    public void TestZero()
    {
        assertFalse(EvenOrOdd.CheckOdd(0));
    }
    @Test
    public void TestSmallEvenPositiveNumsOnEven()
    {
        assertTrue(EvenOrOdd.CheckEven(10));
    }
    @Test
    public void TestLargeEvenPositiveNumsOnEven()
    {
        assertTrue(EvenOrOdd.CheckEven(1200));
    }
    @Test
    public void TestSmallOddPositiveNumsOnEven() { assertFalse(EvenOrOdd.CheckEven(9));}
    @Test
    public void TestLargeOddPositiveNumsOnEven()
    {
        assertFalse(EvenOrOdd.CheckEven(1203));
    }
    @Test
    public void TestNegativeNumsOnEven()
    {
        assertFalse(EvenOrOdd.CheckEven(-10));
    }
    @Test
    public void TestZeroOnEven()
    {
        assertTrue(EvenOrOdd.CheckEven(0));
    }
}