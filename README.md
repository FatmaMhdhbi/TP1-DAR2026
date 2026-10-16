TP1-DAR2026 — Développement d’applications réparties

Étudiant : Fatma Mhadhbi  
Niveau : LSI3  
Année universitaire : 2026–2027


 Activité 1-1 : Première connexion Client/Serveur

 1. Objectif

L’objectif de cette activité est d’établir une connexion entre un client et un serveur en Java en utilisant les sockets TCP.

 2. Structure du projet

Le projet contient deux packages principaux :

- src/clientPackage/Client.java : application cliente.
- src/serverPackage/Server.java : application serveur.

 3. Fonctionnement

Le serveur utilise un objet ServerSocket sur le port 1234 et attend la connexion d’un client grâce à la méthode accept().

Le client établit une connexion avec le serveur en utilisant l’adresse localhost et le port 1234.

Lorsque la connexion est établie, le serveur et le client affichent des messages de confirmation dans leurs consoles respectives.

 4. Captures d’écran

 4.1. Serveur en attente d’une connexion

![Serveur en attente](captures/serveur1.png)

 4.2. Client connecté

![Client en attente](captures/Client.png)

 4.3. Connexion établie

![Connexion au serveur](captures/serveur2.png)

 Activité 1-2 : Service de multiplication

 1. Objectif

L’objectif de cette activité est d’étendre l’application Client/Serveur développée dans l’Activité 1-1 afin d’ajouter un service de multiplication exécuté côté serveur.

Le serveur reçoit un entier envoyé par le client, calcule son produit par 5 et renvoie le résultat au client.

 2. Fonctionnement

Le traitement s’effectue selon les étapes suivantes :

1. Le client saisit un entier x au clavier.
2. Le client envoie cet entier au serveur à l’aide de DataOutputStream.
3. Le serveur reçoit le nombre à l’aide de DataInputStream.
4. Le serveur calcule le produit x * 5.
5. Le serveur envoie le résultat au client.
6. Le client reçoit et affiche le résultat.

Les classes DataInputStream et DataOutputStream permettent l’échange d’entiers entre les deux applications, y compris les valeurs négatives.

 3. Communication répétée

L’application est améliorée pour permettre au client de saisir plusieurs entiers successivement.

Après chaque saisie, le client envoie le nombre au serveur, reçoit le résultat de la multiplication par 5 et l’affiche.

Le traitement continue tant que le client saisit un entier différent de 0. Lorsque le client saisit 0, la communication s’arrête et les sockets sont fermées des deux côtés.

 4. Captures d’écran

 4.1. Calculs effectués côté serveur

![Calcul de serveur](captures/serveur4.png)

 4.2. Résultats affichés côté client

![Calcul de serveur](captures/client3.png)



 Conclusion générale

Ce TP a permis de découvrir et de mettre en pratique la communication Client/Serveur en Java à l’aide des sockets TCP.

L’Activité 1-1 a permis d’établir une première connexion entre un client et un serveur.

L’Activité 1-2 a permis d’étendre cette communication en ajoutant un service de multiplication exécuté côté serveur. L’utilisation de `DataInputStream` et de `DataOutputStream` a permis d’échanger des entiers entre les deux applications.

Ces activités constituent une première étape dans la compréhension des applications réparties et de la communication entre processus à travers le réseau.
