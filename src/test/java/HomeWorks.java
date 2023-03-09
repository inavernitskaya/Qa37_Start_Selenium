import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {
       WebDriver wd;
        @BeforeClass
        public void setUp(){
            wd=new ChromeDriver();
            wd.get("https://telranedu.web.app/login");
        }
        @Test
        public void cssLocators(){
            // by tag name
           
            WebElement el= wd.findElement(By.tagName("div"));
            WebElement element = wd.findElement(By.cssSelector("div"));
            List<WebElement> list = wd.findElements(By.tagName("div"));
            List<WebElement> list1 = wd.findElements(By.cssSelector("div"));



            WebElement el1 = wd.findElement(By.tagName("h1"));
            WebElement element1 = wd.findElement(By.cssSelector("h1"));

            WebElement el2 = wd.findElement(By.tagName("a"));
            WebElement element2 = wd.findElement(By.cssSelector("a"));
            List<WebElement> list2 = wd.findElements(By.tagName("a"));
            List<WebElement> list3 = wd.findElements(By.cssSelector("a"));

            WebElement el3 = wd.findElement(By.tagName("form"));
            WebElement element3 = wd.findElement(By.cssSelector("form"));

            WebElement el4 = wd.findElement(By.tagName("input"));
            WebElement element4 = wd.findElement(By.cssSelector("input"));
            List<WebElement> list4= wd.findElements(By.tagName("input"));
            List<WebElement> list5 = wd.findElements(By.cssSelector("input"));

            WebElement el5 = wd.findElement(By.tagName("br"));
            WebElement element5 = wd.findElement(By.cssSelector("br"));

            WebElement el6 = wd.findElement(By.tagName("button"));
            WebElement element6 = wd.findElement(By.cssSelector("button"));
            List<WebElement> lis6= wd.findElements(By.tagName("button"));
            List<WebElement> list7 = wd.findElements(By.cssSelector("button"));
            wd.findElement(By.xpath("//button"));


            // by class
            WebElement divcontainer = wd.findElement(By.className("container"));
            WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));

            WebElement navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
            WebElement navbar1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

            WebElement active = wd.findElement(By.className("active"));
            WebElement active1 = wd.findElement(By.cssSelector(".active"));

            WebElement divlogin = wd.findElement(By.className("login_login__3EHKB"));
            WebElement divlogin1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));


            //By id
            WebElement nav =wd.findElement(By.id("root"));
            WebElement nav1 = wd.findElement(By.cssSelector("#root"));


            // by attribute
            WebElement a1= wd.findElement(By.cssSelector("[href='/home']"));
            WebElement a2= wd.findElement(By.cssSelector("[href='/about']"));
            WebElement a3= wd.findElement(By.cssSelector("[href='/login']"));
            WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
            WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder='Password']"));


            // one of elements find by attribute ==> start & end & contains value
            WebElement inp = wd.findElement(By.cssSelector("[placeholder='Password']"));
             //start
            wd.findElement(By.cssSelector("[placeholder ^='Pas']"));
            // end
            wd.findElement(By.cssSelector("[placeholder $='rd']"));
            // contains
            wd.findElement(By.cssSelector("[placeholder *='swo']"));
        }
    }

