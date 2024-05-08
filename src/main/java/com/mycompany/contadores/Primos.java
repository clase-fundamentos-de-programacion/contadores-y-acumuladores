package com.mycompany.contadores;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("EVALUAR SI UN NÚMERO ES PRIMO");
        System.out.println("Ingrese el número");
        int num = lector.nextInt();
        
        int div = 2;
        int coc = 0;
        int divisoresExactos = 0;
        
        while(div < num && divisoresExactos == 0){
          coc = num % div;
          if(coc == 0){
              // PRIMO
              divisoresExactos++;
          }
          div = div + 1;
        }
        if(divisoresExactos == 0){
            System.out.println("PRIMO");
        }
        else{
            System.out.println("NO ES PRIMO");
        }
        
    }
}
