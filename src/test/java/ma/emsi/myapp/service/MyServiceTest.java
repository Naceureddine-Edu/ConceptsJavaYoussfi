package ma.emsi.myapp.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyServiceTest
{
    @Test
    public void testCompute()
    {
        MyService service = new MyService();
        double a = 12;
        double b = 8;
        double expected = 20;
        double result = service.compute(a, b);
        assertTrue(Math.abs(result-expected)<0.001);
    }
}