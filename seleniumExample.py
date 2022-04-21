#pip install selenium
from selenium import webdriver

#Descargar webdriver y dejar en la carpeta del archivo
#https://chromedriver.chromium.org/downloads
driver = webdriver.Chrome()
#webdriver.Chrome(executable_path=PATH)
driver.get("https://www.urjc.es/") # Acceder a la aplicación web
