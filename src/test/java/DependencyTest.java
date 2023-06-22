import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void stepb() {
        System.out.println("stepb...");
    }

    @Test (dependsOnMethods = "stepb")
    public void astepa2() {
        System.out.println("stepa2...");
        Assert.assertTrue(false); // пропустить шаг
    }

    @Test (dependsOnMethods = "astepa2", alwaysRun = true) // все равно выполнился шаг, даже если предыдущий повалился
    public void stepa11() {
        System.out.println("stepa11...");
    }

    @Test (dependsOnMethods = {"stepb", "astepa2"})  // а этот шаг не выполнился потому-что было assertTrue в astepa2
    public void stepa12() {
        System.out.println("stepa11...");
    }
}