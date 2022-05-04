from selenium import webdriver
from selenium.webdriver.common.by import By
import re
import time

def visita(enlaces, pattern, count, visitadas):
    try:
        enlaces = driver.find_elements(By.CLASS_NAME, 'card-title')

        for i in enlaces:
            enlace = i.find_element(By.CSS_SELECTOR,'a').get_attribute('href')
        
            if enlace not in visitadas and'#' not in enlace and enlace.startswith('http://ctf-vulnerable.numa.host:8040/notice'):
                print("enlace -> " + enlace)
                driver.get(enlace)
                visitadas.add(enlace)
                text = driver.find_element(By.CLASS_NAME, 'article-post').text
                results = re.findall(pattern, text)

                for match in results:
                    count = count + 1
                    print(match)

                print(count)
            else:
                print("Ya visitado")
            return count + visita(enlaces, pattern, count, visitadas)
            
    except Exception:
        pass

driver = webdriver.Chrome()
driver.get("http://ctf-vulnerable.numa.host:8040/") 

pattern = "URJC"
count = 0
visitadas = set()
enlaces = []

print(visita(enlaces, pattern, count, visitadas))