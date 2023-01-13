import locatorsClasses.LoginPage;
import locatorsClasses.RecoverPasswordPage;
import locatorsClasses.RegistrationPage;
import static org.junit.Assert.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import locatorsClasses.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;
import java.util.concurrent.TimeUnit;

public class TestLogin {
    private WebDriver driver;
    private final String email = RandomStringUtils.randomAlphabetic(9) + "gmail.com";
    private final String password = "01234567";
    @Test
    @Step("Login via Personal Account button")
    public void testLoginPersonalAccountButtonChrome(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via Enter account button")
    public void testLoginEnterAccountButtonChrome(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via registration form")
    public void testLoginRegistrationFormChrome(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.scrollToLoginButton();
        objRegistrationPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via recover password page")
    public void testLoginRecoverPasswordPageChrome(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        RecoverPasswordPage objRecoverPasswordPage = new RecoverPasswordPage(driver);
        objRecoverPasswordPage.scrollToLoginButton();
        objRecoverPasswordPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via Personal Account button")
    public void testLoginPersonalAccountButtonYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via Enter account button")
    public void testLoginEnterAccountButtonYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via registration form")
    public void testLoginRegistrationFormYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.scrollToLoginButton();
        objRegistrationPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via recover password page")
    public void testLoginRecoverPasswordPageYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        RecoverPasswordPage objRecoverPasswordPage = new RecoverPasswordPage(driver);
        objRecoverPasswordPage.scrollToLoginButton();
        objRecoverPasswordPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @After
    @Step("Quit browser")
    public void logOut(){
        driver.quit();
    }
}
