package payment.pages;

import payment.driver.Driver;

import payment.helper.AlertHelper;
import payment.helper.ElementActions;
import payment.helper.FramesHelper;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    //Page Object Pattern
    ElementActions elementActions = new ElementActions();
    AlertHelper alertHelper = new AlertHelper(Driver.getDriver());
    FramesHelper framesHelper = new FramesHelper(Driver.getDriver());
    public BasePage() {           //принимает драйвер   //экземпляр текущей страницы
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //PageFactory - pattern облегчает работу с page object pattern
    // инициализирует веб элементы работая в паре с @FindBy
    //Без использования @FindBy, Page Factory не сможет определить, какие именно элементы инициализировать на странице

}
