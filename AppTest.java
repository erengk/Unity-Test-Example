package estu.edu;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int[] testList = new int[]{1, 2, -3, 5, 56, -34, 46,98,-12,103};

        assertEquals( App.findMax(testList),103);
    }
}
