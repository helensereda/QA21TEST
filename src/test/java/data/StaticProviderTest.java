package data;

import org.testng.annotations.DataProvider;

public class StaticProviderTest {


    @DataProvider (name = "Data for calculator test", parallel = true)
    public static Object[][] DataCalcInt() {
        return new Object[][]{
                {3, 1, 3},
                {3, 0, 0},
                {0, 0, 0},
                {-4,-1, 4},

        };
    }

}