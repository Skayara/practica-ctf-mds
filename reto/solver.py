from selenium import webdriver
from selenium.webdriver.common.by import By


driver = webdriver.Chrome()
driver.get("file:///home/sky/Documentos/content/practica-ctf-mds/reto/index.html") # Acceder a la aplicación web


try:
    elements = driver.find_elements(By.CLASS_NAME, "text-display")
    print("p3")
    cuadro = driver.find_element(By.CLASS_NAME,"text-input")
    print("p")
    for i in elements:
        print("Prueba")
        cuadro.send_keys(i.text)
        print(i.text)

except Exception:
    pass