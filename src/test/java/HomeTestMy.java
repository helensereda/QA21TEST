import data.StaticProviderTest;
import data.StaticProviderDouble;
import org.testng.Assert;

import org.testng.annotations.Test;

public class HomeTestMy extends BaseTest {

    @Test
    public void testInt() {
        int expectedValue = 1;
        int actualValue = calculator.div(3, 3);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(enabled = false)
    public void testInt1() {
        int expectedValue = 1;
        int actualValue = calculator.div(3, 3);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(enabled = false)
    public void testInt2() {
        double expectedValue = 1;
        double actualValue = calculator.div(6.2, 6.2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(description = "Значения не одинаковые", dependsOnMethods = "testInt")
    public void testInt3() {
        int expectedValue = 1;
        int actualValue = calculator.div(3, 3);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(description = "Значения не одинаковые")
    public void testInt4() {
        double expectedValue = 1;
        double actualValue = calculator.div(6.2, 6.2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(testName = "My test")
    public void NameTest() {
        int expectedValue = 1;
        int actualValue = calculator.div(3, 3);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(testName = "My test")
    public void NameTest_1() {
        double expectedValue = 1;
        double actualValue = calculator.div(6.2, 6.2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(timeOut = 600)
    public void waitLongTimeTest() throws InterruptedException {
        Thread.sleep(500);
        int expectedValue = 1;
        int actualValue = calculator.div(3, 3);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(timeOut = 600)
    public void waitLongTimeTest_1() throws InterruptedException {
        Thread.sleep(500);
        double expectedValue = 1;
        double actualValue = calculator.div(6.2, 6.2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(priority = 1, invocationCount = 3, invocationTimeOut = 900, threadPoolSize = 2)
    public void invocationCountTest() throws InterruptedException {
        Thread.sleep(200);
        int expectedValue = 1;
        int actualValue = calculator.div(3, 3);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationCount = 3, invocationTimeOut = 900, threadPoolSize = 2)
    public void invocationCountTest_1() throws InterruptedException {
        Thread.sleep(200);
        double expectedValue = 1;
        double actualValue = calculator.div(6.2, 6.2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(priority = 1, expectedExceptions = NullPointerException.class)
    public void exceptionTest() {
        try {
            int result = calculator.div(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionTest_1() {
        try {
            double result = calculator.div(6.2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
    @Test (dataProvider = "Data for calculator test", dataProviderClass = StaticProviderTest.class )
    public void DataCalcInt (int a, int b, int expectedValue) {
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Значения не одинаковые");
    }

    @Test (dataProvider = "Data for calculator double test", dataProviderClass = StaticProviderDouble.class )
    public void DataCalcDouble (double  a, double b, int expectedValue) {
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Значения не одинаковые");
    }
}

