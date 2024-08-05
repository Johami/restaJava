package com.mycompany.multiplicacionnumeros;

import java.util.Scanner;

public class MultiplicacionNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int resultado = multiplicar(x, y);
        
        System.out.println(resultado);
    }
    
    public static int multiplicar(int a, int b) {
        return  a * b;
    }
}