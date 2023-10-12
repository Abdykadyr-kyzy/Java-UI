import payment.driver.Driver;
import payment.pages.*;
import payment.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public ButtonsPage buttonsPage;
    public LoginPage loginPage;
    public FakeDataProvider fakeDataProvider;

    public WebDriver driver;
    public AlertsPage alertsPage;
    public TextBoxPage textBoxPage;
    public FramesPage framesPage;
    public PracticeFormPage practiceFormPage;
    public RadioButtonPage radioButtonPage;
    public LinksPage linksPage;
    public BrokenLinksImagesPage brokenLinksImagesPage;
    public UploadFilePage uploadFilePage;
    public CheckBoxPage checkBoxPage;
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver=Driver.getDriver();
        textBoxPage= new TextBoxPage();
        practiceFormPage= new PracticeFormPage();
        fakeDataProvider= new FakeDataProvider();
        loginPage= new LoginPage();
        alertsPage = new AlertsPage();
        framesPage= new FramesPage();
        checkBoxPage= new CheckBoxPage();
        radioButtonPage = new RadioButtonPage();
        buttonsPage= new ButtonsPage();
        linksPage= new LinksPage();
        brokenLinksImagesPage=  new BrokenLinksImagesPage();
        uploadFilePage = new UploadFilePage();
    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        Driver.closeDriver();
//    }

}
