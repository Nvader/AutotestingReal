package com.it.tests;

import com.it.pages.HomePage;
import com.it.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void testMyTest() {
        /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitlana.zavialova\\IdeaProjects\\frame\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.i.ua."); */

        LoginPage loginPage = new LoginPage();
        loginPage.login("ittest2", "337774a");
        HomePage homePage = new HomePage();
        String email = homePage.getLabelUserEmail();

       /* driver.findElement(By.xpath("//input[@name='login']")).sendKeys("ittest2");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("337774a");
        driver.findElement(By.xpath("//form[@name='lform']//input[@type='submit']")).click();
        String text = driver.findElement(By.xpath("//div[@class='section_nav']//li[1]")).getText(); */

        Assert.assertEquals(email, "ittest2@i.ua");
        //driver.quit();
    }

}
