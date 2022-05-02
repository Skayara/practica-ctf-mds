import os

# Te recuerda a algun otro reto? https://tenor.com/view/flashbacks-flashback-real-dog-scarred-gif-4565904
SIZE = 10
agenda = [""] * SIZE
flag = "aHR0cHM6Ly93d3cueW91dHViZS5jb20vd2F0Y2g/dj1kUXc0dzlXZ1hjUQ=="


def add_contact():
    print("En que posicion de la agenda quieres almacenar el numero?\n")
    pos = int(input())

    if pos >= SIZE or pos < 0:
        print("Posicion invalida! Quieres hacer un overflow?\n")
        return


    print("Introduce el numero: ")
    agenda[pos] = input()


def show_contact():
    print("Que contacto quieres recuperar? Indica su posicion en la agenda.\n")
    pos = int(input())

    if pos >= SIZE:
        print("Posicion invalida! Que tramas?\n")
        return


    print("El numero de la posicion %s es %s\n" % (pos, agenda[pos]))


def main():

    print("Bienvenido a la agenda. Hay 10 huecos disponibles para almacenar contactos.\nQue deseas hacer?\n1.- Anadir contacto en la agenda\n2.- Leer contacto de la agenda\n3.- Salir\n")
    opcion = int(input())
    while opcion!=1 and opcion!=2 and opcion!=3:
        print("Por favor, introduce una opcion valida.\nQue deseas hacer?\n1.- Anadir contacto en la agenda\n2.- Leer contacto de la agenda\n3.- Salir\n")
        opcion = int(input())


    while opcion!=3:
        if opcion==1:
            add_contact()
            print("Numero anadido!\n")
        elif opcion==2:
            show_contact()

        print("Bienvenido a la agenda. Hay 10 huecos disponibles para almacenar contactos.\nQue deseas hacer?\n1.- Anadir contacto en la agenda\n2.- Leer contacto de la agenda\n3.- Salir\n")
        opcion = int(input())

    print("Adios!\n")


main()
