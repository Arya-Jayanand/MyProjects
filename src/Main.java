import org.testng.annotations.Test;

public class Main {

    @Test(priority =2)
    void setup() {
            System.out.println("Hello\nAlexandra Abramov");
    }
    @Test(priority =1)
    void testSteps()
    {
        System.out.println("I am inside testSteps");
    }
    @Test(priority =3)
    void tearDown(){
    System.out.println("I am inside tearDown");
 }
 }