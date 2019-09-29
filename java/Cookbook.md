**Maven Selenium Dependency**

    <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.6.0</version>
    </dependency>


**Simple GET**

    System.setProperty("webdriver.chrome.driver","F:\\programs\\chromedriver_win32\\chromedriver.exe");		
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("headless");

    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.get("https://in.linkedin.com/");
    driver.quit();


**Tell selenium to Wait**

    Well, there are two types of wait: explicit and implicit wait. The idea of explicit wait is
    WebDriverWait.until(condition-that-finds-the-element);
    The concept of implicit wait is
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    In such situations I'd prefer using explicit wait (fluentWait in particular):
    public WebElement fluentWait(final By locator) { Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30, TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS) .ignoring(NoSuchElementException.class); WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public WebElement apply(WebDriver driver) { return driver.findElement(locator); } }); return foo; };

    fluentWait(By.className("wrestinfo"));



**Find All Elements**

    List<WebElement> fights = context.getWebDriver().findElements(By.xpath(".//li[@class=\"fight\"]"));


**Change Window Size**

    chromeOptions.addArguments("--window-size=1920,1080");


**Go To Previous Page**

    driver.navigate().back();

**Refresh Page**

    driver.navigate().refresh();

**Execute Javascript**

    JavascriptExecutor js=(JavascriptExecutor) driver;			js.executeScript("document.getElementById('reviews-dropdown').style.display='inline-block';");

**Execute Javascript to change styles**

    JavascriptExecutor js=(JavascriptExecutor) driver;			js.executeScript("document.getElementById('reviews-dropdown').style.display='inline-block';");


**Find Child Element**

    WebElement firstImageElement = allImages.get(0);
    WebElement firstImage = firstImageElement.findElement(By.xpath(".//img"));


**Get Attribute of HTML Element**

    String srcImage = firstImage.getAttribute("src");
