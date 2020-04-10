import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

    static int count =1;

    @BeforeMethod
    public void beforeM(){
        System.out.println("====================Test: "+ count + "=========================================");
        count++;
    }

    @Test(dataProvider = "SearchProvider",groups = "smoke")
    public void TestDataProvider(String author, String searchKey){

        System.out.println(author);
        System.out.println(searchKey);


    }




    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "Guru99", "India" },
                        { "Krishna", "UK" },
                        { "Bhupesh", "USA" }
                };

    }

}
