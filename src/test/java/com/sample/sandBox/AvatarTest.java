package com.sample.sandBox;

import com.sample.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.sample.utilities.Driver.driver;

public class AvatarTest {
    @Test

    public void testAvatar(){
        String baseUrl = "https://www.sandbox.game/en/";
       // Driver.get().get("https://www.sandbox.game/en/");
        Driver.get().get(baseUrl);
        WebDriverWait wait = new WebDriverWait(driver,1);

        WebElement createAvatar = driver.findElement(By.xpath("//button[@class='small no-capitalize discover-button']"));
        createAvatar.click();

        WebElement preDesigned = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='4225c590-b060-489f-ae77-c0b7e508fd30']//img[@class='image-bundle']")));
        //WebElement preDesigned1 = driver.findElement(By.xpath("//div[@id='4225c590-b060-489f-ae77-c0b7e508fd30']//img[@class='image-bundle']"));
        //WebElement pre1 = driver.findElement(By.className("//div[@id='4225c590-b060-489f-ae77-c0b7e508fd30']//img[@class='image-bundle']"));
        //pre1.click();
        preDesigned.click();


        WebElement saveButton = driver.findElement(By.xpath("//button[@class='btn-custom is-text-bold']"));
        saveButton.click();

        }



    }


