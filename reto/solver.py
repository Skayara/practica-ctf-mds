from selenium import webdriver
from selenium.webdriver.common.by import By


driver = webdriver.Chrome()
driver.get("file:///home/sky/Documentos/content/whack-a-mole/index.html") # Acceder a la aplicación web


while True:
    try:

        mole = driver.find_element(By.CLASS_NAME, "text-display")
        mole.click()

    except Exception:
        pass