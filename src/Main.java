import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/Driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("1. Padidino langą.");
        driver.get("https://ibpsapptest.vrm.lt/it-app/loginDev/Prokuroras50");
        System.out.println("2. Atidarė IBPS pradinį langą.");
    }
}