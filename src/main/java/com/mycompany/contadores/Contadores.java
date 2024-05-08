package com.mycompany.contadores;

import java.util.Scanner;

public class Contadores {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num = 0;
        int numerosPares = 0;
        do{

            System.out.println("Ingresa el número");
            num = lector.nextInt();
            if(num >= 0){
                if(num % 2 == 0){
                    //numerosPares = numerosPares + 1;
                    //numerosPares += 1;
                    numerosPares++;
                }
            }

        }while(num >= 0);
        System.out.println("Ingresaste " + numerosPares + " números pares");
    }
}
