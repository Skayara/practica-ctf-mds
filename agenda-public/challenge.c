#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

unsigned char* secret_string = "";
unsigned char* agenda[SIZE];

void add_contact(){
    printf("En que posicion de la agenda quieres almacenar el numero?\n");
    int pos;
    scanf("%d", &pos);

    if(pos >= SIZE || pos < 0){
        printf("Posicion invalida! Que tramas?\n");
        return;
    }
    printf("Introduce el numero (Solo lee 8 chars): ");
    scanf("%8s", agenda[pos]);
}

void show_contact(){
    printf("Que contacto quieres recuperar? Indica su posicion en la agenda.\n");
    int pos;
    scanf("%d", &pos);

    if(pos >= SIZE){
        printf("Posicion invalida! Que tramas?\n");
        return;
    }

    printf("El numero de la posicion %d es %s\n", pos, agenda[pos]);
}

int main(void) {
    // Disable output buffering, ignore this line, it is not part of the challenge
    setvbuf(stdout, NULL, _IONBF, 0);

    // Loads flag from environment, if inside Docker corresponds with flag declared in docker-compose.yml
    secret_string = getenv("CHALLENGE_FLAG");
    for (int i = 0; i < SIZE; ++i) {
        agenda[i] = malloc(9); // 8 bytes del numero + 1 byte del null terminator
    }
    printf("Bienvenido a la agenda. Hay 10 huecos disponibles para almacenar contactos.\nQue deseas hacer?\n1.- Anadir contacto en la agenda\n2.- Leer contacto de la agenda\n3.- Salir\n");
    int opcion;
    scanf("%d", &opcion);
    while(opcion!=1 && opcion!=2 && opcion!=3){
        printf("Por favor, introduce una opcion valida.\nQue deseas hacer?\n1.- Anadir contacto en la agenda\n2.- Leer contacto de la agenda\n3.- Salir\n");
        scanf("%d", &opcion);
    }

    while(opcion!=3){
        if(opcion==1){
            add_contact();
            printf("Numero anadido!\n");
        }else if(opcion==2){
            show_contact();
        }
        printf("Bienvenido a la agenda. Hay 10 huecos disponibles para almacenar contactos.\nQue deseas hacer?\n1.- Anadir contacto en la agenda\n2.- Leer contacto de la agenda\n3.- Salir\n");
        scanf("%d", &opcion);
    }
    printf("Adios!\n");
    return 0;
}
