/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de iteraciones");
        int iteraciones = scanner.nextInt();
        
        int anterior = 0;
        int anterior2 = 1;
        for (int i = 0; i < iteraciones; i++) {
            if (i == 0) {
                System.out.print(anterior + ", ");
            } else {
                if (i == 1) {
                    System.out.print(anterior2 + ", ");
                } else {
                    int resultado = anterior + anterior2;
                    System.out.print(resultado + ", ");
                    anterior = anterior2;
                    anterior2 = resultado;
                }

            }
        }
    }
    
}
