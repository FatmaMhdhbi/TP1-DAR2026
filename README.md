TP1-DAR2026 — Développement d’applications réparties

Étudiant :Fatma Mhadhbi  
Niveau  LSI3  
Année universitaire : 2026–2027

 Activité 1-1 : Première connexion Client/Serveur

 Objectif
Établir une connexion entre un client et un serveur en Java en utilisant les sockets TCP.

 Structure du projet
- "src/clientPackage/Client.java" : application cliente.
- "src/serverPackage/Server.java" : application serveur.

 Fonctionnement
Le serveur utilise un 'ServerSocket' sur le port 1234 et attend la connexion d’un client avec 'accept()'. Le client se connecte au serveur en utilisant 'localhost' et le port 1234.

Captures d’écran
Ajouter ici :
- Capture du serveur en attente d’une connexion.
- Capture du client connecté.
- Capture du serveur après l’établissement de la connexion.

 Activité 1-2 : Service de multiplication

 Objectif
Permettre au client d’envoyer un entier au serveur, qui calcule son produit par 5 et renvoie le résultat.

 Fonctionnement
1. Le client saisit un entier x.
2. Le client envoie x au serveur avec DataOutputStream.
3. Le serveur reçoit le nombre avec DataInputStream.
4. Le serveur calcule x * 5.
5. Le serveur renvoie le résultat au client.
6. Le client affiche le résultat reçu.

 Tests
Ajouter les captures d’écran des tests avec différentes valeurs, notamment une valeur positive, une valeur négative et zéro.

 Captures d’écran
Ajouter ici :
- Capture du serveur pendant le calcul.
- Capture du client affichant le résultat.

 Conclusion
Cette première partie du TP permet de comprendre la communication client/serveur en Java à l’aide des sockets TCP et l’échange de données entières entre les deux applications.
