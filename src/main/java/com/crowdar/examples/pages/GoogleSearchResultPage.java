package com.crowdar.examples.pages;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.LocatorManager;

public class GoogleSearchResultPage extends PageBaseGoogle{

    private RemoteWebElement tabs(){return (RemoteWebElement)getWait().until((Function<? super WebDriver, ? extends Object>) ExpectedConditions.presenceOfElementLocated(By.id(LocatorManager.getProperty("googleSearchResult.tabs.id"))));}

    public GoogleSearchResultPage(SharedDriver driver){
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getTabs(){
        return tabs().getText();
    }

}
