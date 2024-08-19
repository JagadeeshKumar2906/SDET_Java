package August_2024.Ex_110824_Abstraction.Ex_02_Browser;

public class Exercise_036_Browser {
    public static void main(String[] args) {
        ChromeBrowser cr = new ChromeBrowser();
        cr.openBrowser();
        cr.closeBrowser();
        System.out.println("-----------");
        FirefoxBrowser fr = new FirefoxBrowser();
        fr.openBrowser();
        fr.closeBrowser();
    }
}
