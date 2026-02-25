package Collections;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoking_chrome {

    public static void main(String[] args) {
        
       String s= "i love 'dreams' and 'passwords'";
       
        String[] st=s.trim().split("'");
          System.out.println(st[0]);
 System.out.println(st[1]);
  System.out.println(st[2]);
  System.out.println(st[3]);
    }}


