import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest {


    @Test (groups = "regression")
    public void testInt4() {
        System.out.println("testInt4...");
    }

    @Test (groups = "smoke")
    public void NameTest() {
        System.out.println("NameTest...");
    }

    @Test (groups = "smoke")
    public void NameTest_1() {
        System.out.println("NameTest_1...");
    }

    @Test (groups = "regression")
    public void waitLongTimeTest() {
        System.out.println("waitLongTimeTest...");
    }

    @Test (groups = "regression")
    public void invocationCountTest() {
        System.out.println("invocationCountTest...");
    }

    @Test (groups = "regression")
    public void exceptionTest_1() {
        System.out.println("exceptionTest_1...");
    }

    @Test (groups = "smoke")
    public void stepb() {
        System.out.println("stepb...");
    }

    @Test (groups = "regression")
    public void astepa2() {
        System.out.println("stepa2...");
    }

    @Test (groups = "regression", dependsOnGroups = "smoke")
    public void stepa11() {
        System.out.println("stepa1...");
    }

    @Test (groups = {"smoke", "regression"})
    public void stepa12() {
        System.out.println("stepa12...");
    }
}