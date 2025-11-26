// Raphaël Desjardins
// 2025-11-26
// Examen pratique 2

package Pratique;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Exame {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter("question1.txt");
        boolean valid = false;
        int Min;
        int Max;
        int[] Somme = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // demande de valeur
        do {
            System.out.print("Veuillez saisir une valeur minimal enière : ");
            Min = sc.nextInt();

            if (Min < 0) {
                System.out.println("vous devez entrer une valeur positive");
            } else {
                valid = true;
            }

        } while (!valid);
        valid = false;
        do {
            System.out.print("Veuillez saisir une valeur maximal enière : ");
            Max = sc.nextInt();

            if (Max < 0) {
                System.out.println("vous devez entrer une valeur positive");
            } else {
                if (Max < Min) {
                    System.out.println("valeur max ne peux pas etre plus petite que le minimum");
                } else {
                    valid = true;
                }

            }
        } while (!valid);

        // écrire dans le fichier
        int Random = Min + (int) (Math.random() * (Max - Min + 1));
        Somme[0 - 9] = Random;
        try (BufferedWriter Value = new BufferedWriter(new FileWriter("question1.txt"))) {
            Value.write("Faut que je mette le tableau ici");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
        sc.close();
    }
}
