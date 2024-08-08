package dataProviders;

import org.testng.annotations.DataProvider;

public class NewDataProviders {
    @DataProvider(name = "test1")
    public static Object[][] createData1() {
        return new Object[][] {
                { "Cedric", 36 },
                { "Anne", 37},
        };
    }

    @DataProvider(name = "test2")
    public static Object[][] createData2() {
        return new Object[][] {
                { "Chris", 36 },{ "Emman", 37}

        };
    }

    @DataProvider(name = "test3")
    public Object[][] createData3() {
        return new Object[][] { { "Apple", "grapes" }, { "Mango", "orange"} };
    }

}
