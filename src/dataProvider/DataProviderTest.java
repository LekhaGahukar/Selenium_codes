package dataProvider;
import org.testng.annotations.*;
public class DataProviderTest {
@DataProvider(name = "teacher")
public String[][] myData() {
String data[][] = { { "Yogendra", "Joshi", "9421357890" }, { "Mangesh",

"Reddy", "9999999999" },

{ "Akash", "Patil", "1234567890" } };

return data;
}
@DataProvider(name = "student")
public String[][] myData1() {
String data[][] = { { "Pranay", "Nilawar", "83083161597" }, { "Varsha",

"Gurele", "8888888888" },

{ "Parachi", "Jadhav", "7777777777" } };

return data;
}
}