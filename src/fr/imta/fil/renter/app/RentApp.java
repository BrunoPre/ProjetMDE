package fr.imta.fil.renter.app;


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

import fr.imta.fil.renter.Car;
import fr.imta.fil.renter.Client;
import fr.imta.fil.renter.Employee;
import fr.imta.fil.renter.Manager;
import fr.imta.fil.renter.PickUp;
import fr.imta.fil.renter.Rent;
import fr.imta.fil.renter.Renter;
import fr.imta.fil.renter.RenterFactory;
import fr.imta.fil.renter.RenterPackage;
import fr.imta.fil.renter.Truck;
import fr.imta.fil.renter.Vehicle;


public class RentApp {
	
	public static String getInputString(Scanner sc) {
		try{
            String input = sc.next();
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
	
	public static float getInputFloat(Scanner sc) {
		try{
			System.out.println("Saisissez un nombre à virgule.");
            float input = sc.nextFloat();
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
		System.out.println("(3) Ajouter un véhicule");
		System.out.println("(4) Supprimer un véhicule");
		System.out.println("(5) Ajouter un client");
		System.out.println("(6) Supprimer un client");
		System.out.println("(7) Créer une location");
		System.out.println("(8) Afficher la boutique de location");

		System.out.println("------------------------------------");
		System.out.println("Faites votre choix :");
		return getInputInt(sc);
	}
	
	public static Employee cliSetEmployee(RenterFactory rf, Scanner sc) {
		Employee e = rf.createEmployee();
		System.out.println("Nom :");
		String name = getInputString(sc);
		e.setName(name);
		System.out.println("Prénom :");
		String firstName = getInputString(sc);
		e.setFirstName(firstName);
		e.setBirthDate(new Date());
		return e;
	}
	
	
	
	public static Client cliSetClient(RenterFactory rf, Scanner sc) {
		Client c = rf.createClient();
		System.out.println("Nom :");
		String name = getInputString(sc);		
		System.out.println("Numéro de téléphone :");
		int phoneNumber = getInputInt(sc);		
		c.setName(name);
		c.setPhoneNumber(phoneNumber);
		c.setBirthDate(new Date());
		c.setIdClient((new Random()).nextInt());
		return c;
	}
	
	public static Rent cliSetRent(RenterFactory rf, Scanner sc) {
		
		Rent r = rf.createRent();
		r.setStartDate(null);
		r.setEndDate(null);
		r.setIdRent((new Random()).nextInt());
		
		return r;
	}
	
	public static Manager cliSetManager(RenterFactory rf, Scanner sc) {
		Manager e = rf.createManager();
		System.out.println("Nom :");
		e.setName(getInputString(sc));
		System.out.println("Prénom :");
		e.setFirstName(getInputString(sc));
		e.setBirthDate(new Date());
		return e;
	}
	
	
	public static void cliRemoveEmployee(Renter renter, Scanner sc) {
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
	}
	
	public static void cliRemoveClient(Renter renter, Scanner sc) {

		System.out.println("Nom :");
		String name = getInputString(sc);
		boolean isFoundDeleted = false;
		for (Client client : renter.getClients()) {
			if (client.getName() == name) {
				System.out.println(client.getName());
				renter.getClients().remove(client);
				isFoundDeleted = true;
				System.out.println("Client supprimé !");
			}
		}
		if (!isFoundDeleted)
			System.out.println("Client non trouvé.");
	}
	
	public static void cliRemoveVehicle(Renter renter, Scanner sc) {
		System.out.println("Id du véhicule :");
		int id = getInputInt(sc);
		boolean isFoundDeleted = false;
		for (Vehicle vehicle : renter.getVehicles()) {
			if (vehicle.getIdVehicle() == id) {
				renter.getVehicles().remove(vehicle);
				isFoundDeleted = true;
				System.out.println("Véhicule supprimé !");
			}
		}
		if (!isFoundDeleted)
			System.out.println("Véhicule non trouvé.");
	}
	
	public static Client findClient(Renter renter, Scanner sc) {
		Client cli = null ;
		System.out.println("Nom :");
		String name = getInputString(sc);
		System.out.println("Numéro de téléphone :");
		int phonenumber = getInputInt(sc);
		boolean isFoundDeleted = false;
		for (Client client : renter.getClients()) {
			if (client.getName() == name && client.getPhoneNumber() == phonenumber) {
				cli = client ;
				isFoundDeleted = true;
			}
		}
		if (!isFoundDeleted) {
			System.out.println("Client non trouvé. Veuillez enregistrer un client.");		
		}
		return cli ;
	}
	
	
	public static Vehicle findVehicle(Renter renter, Scanner sc) {
		Vehicle v = null ;
		System.out.println("Id du véhicule :");
		int id = getInputInt(sc);
		boolean isFoundDeleted = false;
		for (Vehicle vehicle : renter.getVehicles()) {
			if (vehicle.getIdVehicle() == id) {
				v = vehicle ;
				isFoundDeleted = true;
			}
		}
		if (!isFoundDeleted)
			System.out.println("Véhicule non trouvé. Veuillez ajouter un véhicule");
		return v ;
	}
	
	
	public static Car cliSetCar(RenterFactory rf, Scanner sc) {
		Car c = rf.createCar();
		System.out.println("Nom :");
		String name = getInputString(sc);
		c.setName(name);
		System.out.println("Capacité :");
		float capa = getInputFloat(sc);
		c.setHoldingCapacity(capa);
		c.setIdVehicle((new Random()).nextInt());
		System.out.println(c.toString());
		c.toString();
		return c;
	}
	
	public static Truck cliSetTruck(RenterFactory rf, Scanner sc) {
		System.out.println("Nom :");
		String name = getInputString(sc);
		System.out.println("Capacité :");
		float capa = getInputFloat(sc);
		Truck t = rf.createTruck();
		t.setName(name);
		t.setHoldingCapacity(capa);
		t.setIdVehicle((new Random()).nextInt());
		t.toString();
		return t;
	}
	
	public static PickUp cliSetPickUp(RenterFactory rf, Scanner sc) {
		System.out.println("Nom :");
		String name = getInputString(sc);
		System.out.println("Capacité :");
		float capa = getInputFloat(sc);
		PickUp p = rf.createPickUp();
		p.setName(name);
		p.setHoldingCapacity(capa);
		p.setIdVehicle((new Random()).nextInt());
		p.toString();
		return p;
	}
	
	
	
	public static void main(String[] args) {
		RenterFactory rentFactory = RenterFactory.eINSTANCE;
		Renter renter = rentFactory.createRenter();
		
		
		Scanner sc = new Scanner(System.in);
		
		// set name of the shop
		System.out.println("Donner un nom à la boutique:");
		//String input = sc.next();
		String input = "LocAuto";
		renter.setName(input);
		
		// set new manager
		System.out.println("Qui est le nouveau manager ?");
		Manager manager = cliSetManager(rentFactory, sc);
		renter.getEmployees().add(manager);
		
		boolean arret = false;
		
		while (!arret) {
			int choice = displayChoicesAndGetNumber(sc);
			
			/* FEATURES to be implemented:
			 * ajt un employé
			 * suppr un employé
			 * ajt un véhicule
			 * suppr un véhicule
			 * ajouter un client
			 * supprimer un client
			 * créer une location
			 */
			switch (choice) {
				// ajouter un employé
				case 1:
					Employee employee = cliSetEmployee(rentFactory, sc);
					renter.getEmployees().add(employee);
					break;
				
				// supprimer un employé
				case 2:
					cliRemoveEmployee(renter, sc);
					break;
					
				/**** CONTINUE HERE ****/
					
				// ajouter un véhicule
				case 3:					
					System.out.println("Type de véhicule (voiture/camion/pickup):");
					String typeVehicle = getInputString(sc);
					if (typeVehicle.equals("voiture")) {
						Car c = cliSetCar(rentFactory, sc);
						renter.getVehicles().add(c);

					}	
					if (typeVehicle.equals("camion")) {
						Truck t = cliSetTruck(rentFactory, sc);
						renter.getVehicles().add(t);
					}	
					if (typeVehicle.equals("pickup")) {
						PickUp p = cliSetPickUp(rentFactory, sc);
						renter.getVehicles().add(p);
					} 
					
					break;
				
				// Supprimer un véhicule avec l'id
				case 4:					
					cliRemoveVehicle(renter, sc);						
					break;
						
					
				// ajouter un client
				case 5:
					Client client = cliSetClient(rentFactory, sc);
					renter.getClients().add(client);
					break;
				
				// supprimer un client
				case 6:					
					cliRemoveClient(renter, sc);					
					break;
					
					
				// créer une location
				case 7:
					Rent rent = cliSetRent(rentFactory, sc);
					renter.getRents().add(rent);
					
					System.out.println("Ajout d'un client pour la location !");
					Client clientToAdd = findClient(renter, sc);
					
					if (clientToAdd != null) {
						rent.getClient().add(clientToAdd);
					} else {
						
					}
					System.out.println("Ajout d'une voiture pour la location !");
					Vehicle vehicleToAdd = findVehicle(renter, sc);
					if (vehicleToAdd != null) {
						rent.getVehicle().add(vehicleToAdd);
					}
					break;
					
				// afficher la boutique
				case 8:
					System.out.println("Nom : "  +renter.getName());
					System.out.println("Employés : " + renter.getEmployees());
					System.out.println("Véhicules : " + renter.getVehicles());
					System.out.println("Clients : " + renter.getClients());
					System.out.println("Locations : " + renter.getRents());
					break;
					
				case 9:
					/*
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
					    RenterPackage.eNS_URI,
					    RenterPackage.eINSTANCE
					);
					
					// Création de la ressource avec un chemin de fichier où sauvegarder le modèle
					Resource resource = rs.createResource(URI.createFileURI("modele_brewery.xmi"));
					// attention, URI -> org.eclipse.emf.common.util.URI
					
					// notre modèle que l'on a créé avec la factory 
					Renter racineModeleRenter = (Renter)(resource.getContents().get(0));
					
					// on ajoute notre modèle dans la ressource
					resource.getContents().add(racineModeleRenter);

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
					Renter racineRenter = (Renter)(resource.getContents().get(0));
					
					break;
					*/
					
			}
			
		}
		sc.close();
		
	}
}
