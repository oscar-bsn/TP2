/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.tp2;

/**
 *
 * @author obesnier
 */
import java.util.Scanner ;
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TP 02 */
        /* Exo 1 */ 
        Scanner mp = new Scanner(System.in);
        System.out.println("Saisir le mot de passe :");
        String a = mp.next();
        if(!a.equals("admin123")){
        while(!a.equals("admin123")){
            System.out.println("Resaisir le mot de passe :");
            a= mp.next();
        }   
    }
    }
}
