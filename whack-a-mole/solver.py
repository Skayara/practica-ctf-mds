#pip install selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
#Descargar webdriver y dejar en la carpeta del archivo
#https://chromedriver.chromium.org/downloads
driver = webdriver.Chrome()
#webdriver.Chrome(executable_path=PATH)
driver.get("file:///home/sky/Documentos/content/whack-a-mole/index.html") # Acceder a la aplicación web


while True:
    try:

        mole = driver.find_element(By.CLASS_NAME, "mole")
        mole.click()

    except Exception:
        pass