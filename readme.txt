Projet avec une Interface DAO et des injections de bean
Composé de :

- db.propertie
- log4j.xml
- spring-data.xml

Et permet de créer des tables dans la base de donnée ( demospringjpa , qui faut créer au préalable)
et permettant de faire quelque test dessus.

Méthodologie :

1-	Création projet maven quickstart
2-	Ajouter la dependance spring framework
3-	Création une interface DAO (hérite jpa repository) 
4-	Créer le fichier conteneur (ajouter les différents bin, datasource,
entitylanagerfactory, transaction manager, jpa repo)
5-	Tester notre DAO  dans une classe de  test et tester create findby