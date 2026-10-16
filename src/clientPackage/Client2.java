
package clientPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 1235);

        System.out.println("Client2 connecté au serveur.");

        Scanner scanner = new Scanner(System.in);

        DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

        DataInputStream dis =
                new DataInputStream(socket.getInputStream());

        int choix;

        do {
            System.out.println("\n===== CALCULATRICE =====");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            dos.writeInt(choix);
            dos.flush();

            if (choix >= 1 && choix <= 4) {

                System.out.print("Entrez le premier nombre x : ");
                double x = scanner.nextDouble();

                System.out.print("Entrez le deuxième nombre y : ");
                double y = scanner.nextDouble();

                dos.writeDouble(x);
                dos.writeDouble(y);
                dos.flush();

                boolean erreur = dis.readBoolean();

                if (erreur) {
                    System.out.println(
                            "Erreur : choix invalide ou division par zéro."
                    );
                } else {
                    double resultat = dis.readDouble();
                    System.out.println("Résultat = " + resultat);
                }

            } else if (choix != 0) {
                System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        System.out.println("Fin de la communication.");

        dis.close();
        dos.close();
        socket.close();
        scanner.close();
    }
}
