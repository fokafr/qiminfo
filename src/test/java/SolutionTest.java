import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void  shouldGivenThreeDigitInteger(){
        //Given
        //When
        //Then

        Assert.assertEquals(972, Solution.solution(512,10));
        Assert.assertEquals(591, Solution.solution(191,4));
        Assert.assertEquals(999, Solution.solution(285,20));
    }
}
