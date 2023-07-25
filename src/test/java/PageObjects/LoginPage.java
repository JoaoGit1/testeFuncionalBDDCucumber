package PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utils.Utils.getMaxWaitTime;

public class LoginPage {

    private final WebDriver driver;

    WebDriverWait wait;

    public LoginPage() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, getMaxWaitTime());
        PageFactory.initElements(driver, this);

    }

    public void acessarTelaInicial() {
        driver.get("https://www.amazon.com.br");
    }

    public void clicobotaofaçaseulogin() {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

    }

    public void digitoEmail() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("ap_email")).sendKeys("estudoconta1234@gmail.com");

    }

    public void clicobotaoContinue() {
        driver.findElement(By.id("continue")).click();

    }

    public void digitoSenha() {
        driver.findElement(By.id("ap_password")).sendKeys("estudoconta123456");

    }

    public void clicobotaoFazerlogin() {
        driver.findElement(By.id("auth-signin-button")).click();

    }

    public void digitoEmailIncorreto() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("ap_email")).sendKeys("estudoconta0000@gmail.com");
    }

    public void digitoSenhaIncorreta() {
        driver.findElement(By.id("ap_password")).sendKeys("studoconta123456");

    }

    public void exiboNaTelaMensagemErro() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(true, driver.findElement(By.id("auth-error-message-box")).isDisplayed());
    }

    public void verificoSeEstouLogado() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Olá, estudoconta", driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
    }

    public void desconectoPerfilDoUsuario() {
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        //encontra segundo menu e acessa o menu<br>
        driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();

    }

    public void facoBuscaPorProduto() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smartphone");
    }

    public void clicobotaoPesquisarProduto() {
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    public void verificoOProduto() {
        Assert.assertEquals("smartphone", driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]")).isDisplayed());

    }
    // public void encerra() {
    //   driver.quit();
    // }
}

