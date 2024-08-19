package August_2024.Ex_110824_Abstraction.Ex_02_Browser;

public class FirefoxBrowser extends BaseClass{
    @Override
    void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
