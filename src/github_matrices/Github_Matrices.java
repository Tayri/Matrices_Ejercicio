/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_matrices;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *autor: Tayri
 * @author Tayri
 */
public class Github_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
         
        //nf = numero de filas
        //nc= numero columnas
        int nf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la matriz"));
        int nc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la matriz"));
        int m[][] = new int[nf][nc];
         
         for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición [" + (i + 1) + "," + (j + 1) + "] de la matriz"));
            }
        }
         String result = "";
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                result += m[i][j];
                result += "    ";
            }
            result += "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
    }
        
