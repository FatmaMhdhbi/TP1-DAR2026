
package clientPackage;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 1234);
        System.out.println("Je suis un client connecté");

        Scanner scanner = new Scanner(System.in);

        DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

        DataInputStream dis =
                new DataInputStream(socket.getInputStream());

        int x;

        do {
            System.out.print("Entrez un entier x (0 pour quitter) : ");
            x = scanner.nextInt();

            dos.writeInt(x);

            if (x != 0) {
                int resultat = dis.readInt();
                System.out.println("Résultat reçu du serveur : "
                        + resultat);
            }

        } while (x != 0);

        System.out.println("Fin de la communication.");

        dis.close();
        dos.close();
        socket.close();
        scanner.close();
    }
}
