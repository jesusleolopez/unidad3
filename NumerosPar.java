/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospar;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class NumerosPar {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un numero: ");
        int numero = scanner.nextInt();
        if(numero % 2 == 0) {
        System.out.println("es par");
        } 
        else { 
        System.out.println("es impar");   
        }               
    }
}
