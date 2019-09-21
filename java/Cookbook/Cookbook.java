public class Cookbook{

    public static void main(String[] args){

        //Simple GET of a web page

        System.setProperty("webdriver.chrome.driver","F:\\programs\\chromedriver_win32\\chromedriver.exe");		
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://in.linkedin.com/");
        driver.quit()


        //Tell Selenium To Wait

        public WebElement fluentWait(final By locator) { 
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class); 
            WebElement foo = wait.until(new Function<WebDriver, WebElement>() { 
                public WebElement apply(WebDriver driver) { 
                    return driver.findElement(locator); 
                } 
            }); 
            return foo; 
        };

        fluentWait(By.className("wrestinfo"));


        //Find All Elements

        List<WebElement> fights = context.getWebDriver().findElements(By.xpath(".//li[@class=\"fight\"]"));


        //Change Window Size

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOptions);


        //Go To Previous Page

        driver.navigate().back();


        //Refresh Page

        driver.navigate().refresh();


        //Execute Javascript

        JavascriptExecutor js=(JavascriptExecutor) driver;			
        js.executeScript("document.getElementById('reviews-dropdown').style.display='inline-block';");


        //Execute Javascript to change styles

        JavascriptExecutor js=(JavascriptExecutor) driver;			
        js.executeScript("document.getElementById('reviews-dropdown').style.display='inline-block';");


        //Find Child Element

        WebElement firstImageElement = allImages.get(0);
        WebElement firstImage = firstImageElement.findElement(By.xpath(".//img"));


        //Get Attribute of HTML Element

        String srcImage = firstImage.getAttribute("src");


    }
}
