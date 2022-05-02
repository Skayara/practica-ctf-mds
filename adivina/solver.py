from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("http://ctf-vulnerable.numa.host:8080/") # Acceder a la aplicación web

def current_milli_time():
    return round(time.time() * 1000)

driver.find_element(By.ID, "number").send_keys(current_milli_time())

while True:
    driver.find_element(By.CLASS_NAME, "btn btn-outline-primary").click()
