/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_matrices;
import java.util.Scanner;
/**
 *autor: Tayri
 * @author Tayri
 */
public class Github_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //Creacion de variables
        String menu = "¿Que Matriz quieres utilizar? \n 1: Matriz 3x3 \n 2: Matriz 4x4 \n 3: Matriz 5x5 " ;
        
        int LX3x3 = 3;
        int LX4x4 = 4;
        int LX5x5 = 5;
        
        int LY3x3 = 3;
        int LY4x4 = 4;
        int LY5x5 = 5;
        
        boolean program = true;
        
        Scanner m;
        int s;
        
         System.out.println("Matrices: ");
        
        }
    //Creacion matrices
        public static void Matriz3(int x3, int y3){
            for (int i = 0; i < x3; i++) {
            for (int y = 0; y < y3; y++) {
                if (i == 0 || y == 0 || i == x3 - 1 || y == y3 - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
        
        public static void Matriz4(int x4, int y4){
            for (int i = 0; i < x4; i++) {
            for (int y = 0; y < y4; y++) {
                if (i == 0 || y == 0 || i == x4 - 1 || y == y4 - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
        }
        public static void Matriz5(int x5, int y5){
            for (int i = 0; i < x5; i++) {
            for (int y = 0; y < y5; y++) {
                if (i == 0 || y == 0 || i == x5 - 1 || y == y5 - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
        }
    }

    
    
