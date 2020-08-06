package com.crowdar.examples.pages;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.crowdar.core.LocatorManager;

public class GoogleHomePage extends PageBaseGoogle{

    private RemoteWebElement googleInput(){return (RemoteWebElement)getWait().until((Function<? super WebDriver, ? extends Object>) ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorManager.getProperty("googleHome.searchInput.xpath"))));}
    private RemoteWebElement googleSearchBtn(){return (RemoteWebElement)getWait().until((Function<? super WebDriver, ? extends Object>) ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorManager.getProperty("googleHome.searchButton.xpath"))));}

    public GoogleHomePage(RemoteWebDriver driver){
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go(){
        getDriver().navigate().to(BASE_URL);
        try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void enterSearchCriteria(String palabra){
    	
        googleInput().clear();
//        getFluentWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorManager.getProperty("googleHome.searchButton.xpath"))));
//        driver.findElement(By.xpath(LocatorManager.getProperty("googleHome.searchButton.xpath")));
        googleInput().sendKeys(palabra);
    }

    public void clickSearchButton(){
        googleInput().sendKeys(Keys.ENTER);
    }

}
