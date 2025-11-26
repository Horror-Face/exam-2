package Pratique;

import java.util.Scanner;

public class Exame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean valid = false;
        do {
            System.out
                    .println(
                            "1. Compter les lignes\n2. Afficher un tableau\n3. Quantité de valeur impaires / 7\n4. Quitter");
            System.out.print("Votre choix : ");
            choice = sc.nextInt();
            if (choice < 0) {
                System.out.println("entrer un choix valide");
            }else{
                if (choice > 4) {
                    System.out.println("entrer un choix valide");
                }else{
                   valid = true;
                }
            }
        } while (!valid);
        
    }
}
