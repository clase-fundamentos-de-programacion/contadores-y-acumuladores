package com.mycompany.contadores;

import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        double num = lector.nextDouble();
        
        double sumatoria = 0;
        
        for(int i = 1; i<=num;i++){
            sumatoria += i;
        }
        System.out.println("La sumatoria es igual a " + sumatoria);
    }
}
