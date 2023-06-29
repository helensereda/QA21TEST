package data;

import org.testng.annotations.DataProvider;

public class StaticProviderDouble {

    @DataProvider (name = "Data for calculator double test", parallel = true)
    public static Object[][] DataCalcDouble() {
        return new Object[][]{
                {6.2, 6.2, 1},
                {4.4, 2.2, 2},
                {-6.2, -6.2, 1}

        };
        }

    }


