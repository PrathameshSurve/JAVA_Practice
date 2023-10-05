package Testing;

import org.junit.Assert;
import org.junit.Test;

import TestCodes.Testcode1;

public class Test1 {
    Testcode1 code1 = new Testcode1();

    // public void test() {
    // int n = 2;

    // }

    @Test
    public void evenTest() {
        int e = 4;
        Assert.assertTrue(code1.Even(e));
    }

    // @Test
    // public void oddTest() {
    // int e = 5;
    // Assert.assertTrue(code1.Odd(e));
    // }

}
