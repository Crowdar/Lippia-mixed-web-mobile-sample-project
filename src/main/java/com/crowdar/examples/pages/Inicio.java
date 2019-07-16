package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.LocatorManager;

public class Inicio extends PageBaseExamples{

    private WebElement googleInput(){return super.getDriver().findElement(By.xpath(LocatorManager.getProperty("inicio.searchInput.xpath")));}
    private WebElement googleSearchBtn(){return super.getDriver().findElement(By.xpath(LocatorManager.getProperty("inicio.searchButton.xpath")));}

    public Inicio(SharedDriver driver){
        super(driver);
        this.url = "";
    }

    public void navegarAlInicio(){
        navigateToIt();
    }

    public void ingresarPalabra(String palabra){
    	googleInput().click();
        googleInput().clear();
        googleInput().sendKeys(palabra);
    }

    public void presionarBotonDeBusqueda(){
    	googleInput().sendKeys(Keys.ENTER);
    }

}
