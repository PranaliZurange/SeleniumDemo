package org.qsp.pom;

import java.sql.DriverAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome 
{


@FindBy(xpath="//input[@name='search']")
private WebElement search;
public SeleniumHome(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void searchtext(String txt)
{
	search.sendKeys(txt,Keys.ENTER);
}

}
