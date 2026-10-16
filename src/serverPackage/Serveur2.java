
package serverPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur2 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1235);

        System.out.println("Serveur2 en attente de connexion...");

        Socket socket = serverSocket.accept();

        System.out.println("Client2 connecté.");

        DataInputStream dis =
                new DataInputStream(socket.getInputStream());

        DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

        while (true) {

            int choix = dis.readInt();

            if (choix == 0) {
                System.out.println("Arrêt demandé par le client.");
                break;
            }

            double x = dis.readDouble();
            double y = dis.readDouble();

            double resultat = 0;
            boolean erreur = false;

            switch (choix) {

                case 1:
                    resultat = x + y;
                    System.out.println(x + " + " + y + " = " + resultat);
                    break;

                case 2:
                    resultat = x - y;
                    System.out.println(x + " - " + y + " = " + resultat);
                    break;

                case 3:
                    resultat = x * y;
                    System.out.println(x + " * " + y + " = " + resultat);
                    break;

                case 4:
                    if (y == 0) {
                        erreur = true;
                    } else {
                        resultat = x / y;
                        System.out.println(x + " / " + y + " = " + resultat);
                    }
                    break;

                default:
                    erreur = true;
                    break;
            }

            dos.writeBoolean(erreur);

            if (!erreur) {
                dos.writeDouble(resultat);
            }

            dos.flush();
        }

        dis.close();
        dos.close();
        socket.close();
        serverSocket.close();

        System.out.println("Serveur2 arrêté.");
    }
}
