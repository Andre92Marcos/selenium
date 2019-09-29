**Get Page Html**

    driver = webdriver.Chrome()        
    driver.get("https://www.tradingview.com/symbols/AMEX-AAMC/technicals/")
    html = driver.find_element_by_tag_name('html').get_attribute('innerHTML')


**Run Chrome in Headless Mode**

    from selenium import webdriver
    from selenium.webdriver.common.keys import Keys
    from selenium.webdriver.chrome.options import Options


    chrome_options = Options() 
    chrome_options.add_argument("--headless")
    driver = webdriver.Chrome(chrome_options=chrome_options)