package com.InarSmartbear.pages;

import com.InarSmartbear.utilities.ConfigurationReader;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class WebOrdersPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    private WebElement checkAllButton;

    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    private WebElement uncheckAllButton;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl02_OrderSelector")
    private WebElement firstCheckButton;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    private WebElement deleteSelectedButton;

    @FindBy(id = "ctl00_MainContent_orderMessage")
    private WebElement mainContentOrderMessage;





    public void clickCheckAllButton() {
      checkAllButton.click();
    }

    public void isSelectedAllCheckBoxes() throws ElementNotVisibleException {

        int rowCount = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr")).size();
        System.out.println(rowCount);

      try {

          for (int i = 1; i < rowCount; i++) {
              boolean text = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']")).findElements(By.tagName("tr")).get(i).findElements(By.tagName("td")).get(0).findElement(By.xpath("//input[@checked='checked']")).isSelected();
              System.out.println(text);
          }
      }catch (Exception e){
          System.out.println("The Boxes are unchecked");
      }

    }

    public void clickUncheckAllButton(){
        uncheckAllButton.click();
    }

    public void clickFirstCheckButton(){
        firstCheckButton.click();
    }

    public void clickDeleteSelectedButton(){
        deleteSelectedButton.click();
    }

    public void isSelectedRowDeleted(int satir){

        String text = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']")).findElements(By.tagName("tr")).get(satir).findElements(By.tagName("td")).get(1).getText();
        if(text.equalsIgnoreCase("Paul Brown")){
            System.out.println("The row is not deleted.");
        }else{
            System.out.println(text);
        }

    }

    public String isTheMessageDisplayed(){
        return mainContentOrderMessage.getText();
           }




}

