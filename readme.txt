Projet avec seulement une interface dao dans le projet DAO
Projet avec une interface dao et une couche service dans le projet SERVICE

une Interface DAO et des injections de bean
Composé de :

- db.propertie
- log4j.xml
- spring-data.xml

Et permet de créer des tables dans la base de donnée ( demospringjpa , qui faut créer au préalable)
et permettant de faire quelques tests dessus.

Méthodologie :

1-	Création projet maven quickstart
2-	Ajouter la dependance spring framework
3-	Création une interface DAO (hérite jpa repository) 
4-	Créer le fichier conteneur (ajouter les différents bin, datasource,
entitylanagerfactory, transaction manager, jpa repo)
5-	Tester notre DAO  dans une classe de  test et tester create findby
6-	Coder le service ,mettre en propriété l’interface springdata , et ajouter getter et setter
7-	Déclarer le service dans le conteneur et faire un auto cablage
8-	Créer une classe principal
9-	Dans la classe principal, approche dynamique en trois étapes :
	o	Chargement du conteneur
	o	Récupération du bin service
	o	Manipulation du bin service (lecture d’un élève dont id = 1)
