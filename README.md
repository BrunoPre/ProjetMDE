# Projet MDE -- Loueur de véhicules

Modélisation d'une boutique de location de voitures par F. Justine & P. Bruno
## Structure


## Sujet

### Consignes
À rendre par mail au plus tard le 21/01, merci de :
- préfixer le sujet du mail par [MDE FIL]
- indiquez vos (deux, si binome) noms/prénoms dans le corps du mail

#### Format du rendu
Un readme, document PDF avec :
- une rapide présentation du projet et sa structure
- une description précise du système modélisé
- une breve explication de comment utiliser le programme de gestion

Le ou les projets java contenant :
- le méta-modèle
- le code permettant la gestion de modèles
- plusieurs modèles d'exemples à charger

### Points clefs du projet :
- description textuelle d'un système
- modélisation du système au format ecore ou xcore
- implémentation d'un programme de manipulation du système modélisé

## Modèle
### XCore
Le modèle est décrit dans le fichier `model/projetMDE.xcore`,
généré automatiquement à chaque modification,
ou bien via un clic droit sur le fichier ouvert dans Eclipse > `Initialize Ecore Diagram`.

### Description du système modélisé
Une boutique de location de véhicules est composé d'employés et de véhicules. Un directeur gère la boutique et les employés.

Trois types de véhicules peuvent être loués : voiture, camion et pick-up. Ils sont décrits par un identifiant, un nom (marque & modèle) et un volume de contenance.

Des clients sont enregistrés par leur nom et leur date de naissance. 

Quant aux locations, un client ne peut louer un seul et unique véhicule. Un véhicule ne peut être loué que par un seul client à la fois.


