/**
 * POM file representing the homepage of facebook.com website.
 * Create a instance of the class by passing active driver instance.
 * Author: Arghajit Bahttacharya
 *
 */
package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

    private WebDriver driver;

    @FindBy(css="#email")
    private WebElement inputUsername;

    @FindBy(css="#pass")
    private WebElement inputPassword;

    @FindBy(css="#loginbutton input")
    private WebElement btnLogin;



    public homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean login(String username,String password) {

        
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);

        btnLogin.click();

        return true;



    }


}
