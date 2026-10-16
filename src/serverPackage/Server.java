
package serverPackage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1234);

        System.out.println(
                "Je suis un serveur en attente de connexion..."
        );

        Socket socket = serverSocket.accept();

        System.out.println("Un client est connecté.");

        DataInputStream dis =
                new DataInputStream(socket.getInputStream());

        DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

        int nb;

        while (true) {
            nb = dis.readInt();

            if (nb == 0) {
                System.out.println(
                        "Le client a demandé l'arrêt."
                );
                break;
            }

            int resultat = nb * 5;

            System.out.println(
                    "Calcul : " + nb + " * 5 = " + resultat
            );

            dos.writeInt(resultat);
        }

        dis.close();
        dos.close();
        socket.close();
        serverSocket.close();

        System.out.println("Serveur arrêté.");
    }
}
