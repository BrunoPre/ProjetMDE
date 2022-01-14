package fr.imta.fil.renter.impl;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.imta.fil.renter.Employee;
import fr.imta.fil.renter.Renter;
import fr.imta.fil.renter.RenterFactory;

public class RentApp {
	
	public static String getInputString(Scanner sc) {
		try{
            String input = sc.nextLine();
            return input;
        } catch(InputMismatchException e){
            System.out.println("Erreur : " + e.getMessage());
            return "";
        }
	}
	
	public static int getInputInt(Scanner sc) {
		try{
            int input = sc.nextInt();
            return input;
        } catch(InputMismatchException e){
            System.out.println("Erreur : " + e.getMessage());
            return -1;
        }
	}
	
	public static int displayChoicesAndGetNumber(Scanner sc) {
		System.out.println("---- Que souhaitez-vous faire ? ----");
		System.out.println("(1) Ajouter un employé");
		System.out.println("(2) Supprimer un employé");
		System.out.println("(3) Ajouter un brassin");
		System.out.println("(4) Ajouter une bière");
		System.out.println("(5) Afficher la brasserie");

		System.out.println("------------------------------------");
		System.out.println("Faites votre choix :");
		return getInputInt(sc);
	}
	
	public static Employee cliSetEmployee(RenterFactory rf, Scanner sc) {
		Employee e = rf.createEmployee();
		System.out.println("Nom :");
		e.setName(getInputString(sc));
		System.out.println("Prénom :");
		e.setFirstName(getInputString(sc));
		e.setBirthDate(new Date());
		return e;
	}
	
	// Returns `true` if the Employee is deleted
	public static boolean cliRemoveEmployee(Renter renter, Scanner sc) {
		System.out.println("Prénom :");
		String firstName = getInputString(sc);
		System.out.println("Nom :");
		String name = getInputString(sc);
		boolean isFoundDeleted = false;
		for (Employee employee : renter.getEmployees()) {
			if (employee.getFirstName() == firstName && employee.getName() == name) {
				renter.getEmployees().remove(employee);
				isFoundDeleted = true;
				System.out.println("Employé supprimé !");
			}
		}
		if (isFoundDeleted)
			System.out.println("Employé non trouvé.");
		return isFoundDeleted;
	}
	
	
	public static void main(String[] args) {
		RenterFactory rentFactory = RenterFactory.eINSTANCE;
		Renter renter = rentFactory.createRenter();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner un nom à la boutique:");
		String input = sc.nextLine();
		renter.setName(input);
		
		System.out.println("Qui est le nouveau manager ?");
		
		boolean arret = false;
		Random random = new Random();
		
		List<String> listBeers = Arrays.asList("IPA", "Heineken", "Chouffe");
		while (!arret) {
			int choice = displayChoicesAndGetNumber(sc);
			switch (choice) {
				// ajt un employé, suppr un employé, ajt un brassin, ajt une biere, afficher la brasserie
				case 1:
					Employee employee = cliSetEmployee(rentFactory, sc);
					break;
				case 2:
					boolean isRemoved = cliRemoveEmployee(renter, sc);
					break;
					
					/// CONTINUE HERE ////
				case 3:
					Brew brew = brFactory.createBrew();
					brew.setBrewDate(new Date());
					brew.setIdBrew(random.nextInt(100));
					System.out.println("Quantité : ");
					brew.setProdQuantity(sc.nextFloat());
					System.out.println("Choisir parmi les " + listBeers.size() + " bières suivantes : " + listBeers.toString());
					int i = sc.nextInt();
					brew.setRecipe(listBeers.get(i%listBeers.size()));
					break;
				case 4:
					Beer beer = brFactory.createBeer();
					System.out.println("Nom de bière :");
					beer.setName(sc.nextLine());
					System.out.println("Description : ");
					beer.setDescription(sc.nextLine());
					System.out.println("Degré d'alcool :");
					beer.setDegreeAlcohol(sc.nextFloat());
					break;
				case 5:
					System.out.println(br.toString());
					break;
					
				case 9:
					arret = true;
					// put the following in a constructor?
					// ------ ResourceSet part ----------------- //
					ResourceSet rs = new ResourceSetImpl();
					
					
					// Mapping entre l'extension du fichier du modèle et le format de sérialisation (xmi)
					rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
					    "xmi",
					    new XMIResourceFactoryImpl()
					);
					// Enregistrement de notre métamodèle dans la liste des métamodèles connus
					rs.getPackageRegistry().put(
					    BreweryPackage.eNS_URI,
					    BreweryPackage.eINSTANCE
					);
					
					// Création de la ressource avec un chemin de fichier où sauvegarder le modèle
					Resource resource = rs.createResource(URI.createFileURI("modele_brewery.xmi"));
					// attention, URI -> org.eclipse.emf.common.util.URI
					
					// notre modèle que l'on a créé avec la factory 
					Brewery racineModeleBrewery = (Brewery)(resource.getContents().get(0));
					
					// on ajoute notre modèle dans la ressource
					resource.getContents().add(racineModeleBrewery);

					// la méthode save de la Resource accepte une map contenant les options de sérialisation
					try {
						resource.save(Collections.EMPTY_MAP); // en pratique : passer une map vide
					}
					catch (IOException exception) {
						System.out.println("erreur durant la sauvegarde du modèle : " + exception.getMessage());
					}
					
					// création d'une resource à partir d'un fichier existant
					Resource resourceFromExistent = rs.getResource(URI.createFileURI("modele_brewery.xmi"), true); // `true` == "load now"
					// true indique que l'on force le chargement de la resource maintenant

					// Je pars du principe que la classe Brewery est la racine de notre modèle
					Brewery racineBrewery = (Brewery)(resource.getContents().get(0));
					
					break;
					
			}
			
		}
		sc.close();
		
	}
}
