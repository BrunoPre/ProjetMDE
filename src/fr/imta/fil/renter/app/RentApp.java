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


import fr.imta.fil.renter.Employee;
import fr.imta.fil.renter.Manager;
import fr.imta.fil.renter.Renter;
import fr.imta.fil.renter.RenterFactory;
import fr.imta.fil.renter.RenterPackage;
import fr.imta.fil.renter.Vehicle;

public class RentApp {
	
	public static String getInputString(Scanner sc) {
		try{
            String input = sc.next();
            return input;
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
            return "";
        }
	}
	
	public static int getInputInt(Scanner sc) {
		try{
            int input = sc.nextInt();
            return input;
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
            return -1;
        }
	}
	
	public static float getInputFloat(Scanner sc) {
		try{
			System.out.println("Saisissez un nombre entier ou à virgule (pas de point!).");
            float input = sc.nextFloat();
            return input;
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
            return -1;
        }
	}
	
	@SuppressWarnings({ "deprecation", "finally" }) // OK at this project scale
	public static Date getInputDate(Scanner sc) {
		System.out.println("Année :");
		int year = sc.nextInt();
		System.out.println("Mois : ");
		int month = sc.nextInt();
		System.out.println("Jour : ");
		int day = sc.nextInt();
		try {
			return new Date(year-1900, month-1, day); // check documentation
		} catch (Exception e) {
			System.out.println("Veuillez révérifier votre saisie.");
			return null;
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
		System.out.println("(9) Charger un modèle");
		System.out.println("(10) Sauvegarder la boutique dans un modèle");
		System.out.println("(11) Créer/Remplacer un manager");
		System.out.println("(12) (Re)nommer la boutique");
		System.out.println("(13) Quitter le programme");
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
		String phoneNumber = getInputString(sc);		
		c.setName(name);
		c.setPhoneNumber(phoneNumber);
		c.setBirthDate(new Date());
		c.setIdClient((new Random()).nextInt(Integer.MAX_VALUE));
		return c;
	}
	
	public static Rent initRent(RenterFactory rf, Scanner sc, Date startDate, Date endDate) {
		
		Rent r = rf.createRent();
		r.setStartDate(startDate);
		r.setEndDate(endDate);
		r.setIdRent((new Random()).nextInt(Integer.MAX_VALUE));
		
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
		System.out.println("Nom :");
		String name = getInputString(sc);
		System.out.println("Prénom :");
		String firstName = getInputString(sc);
		boolean isFoundDeleted = renter.getEmployees().removeIf(employee -> (employee.getFirstName().equals(firstName) && employee.getName().equals(name)));
		System.out.println(isFoundDeleted ? "Employé supprimé !" : "Employé non trouvé.");
	}
	
	public static void cliRemoveClient(Renter renter, Scanner sc) {
		System.out.println("Id du client :");
		int id = getInputInt(sc);
		boolean isFoundDeleted = renter.getClients().removeIf(client -> (client.getIdClient() == id));
		System.out.println(isFoundDeleted ? "Client supprimé !" : "Client non trouvé.");
		
	}
	
	public static void cliRemoveVehicle(Renter renter, Scanner sc) {
		System.out.println("Id du véhicule :");
		int id = getInputInt(sc);
		boolean isFoundDeleted = renter.getVehicles().removeIf(vehicle -> (vehicle.getIdVehicle() == id));
		System.out.println(isFoundDeleted ? "Véhicule supprimé !" : "Véhicule non trouvé.");
	}
	
	public static Client findClient(Renter renter, Scanner sc) {		
		System.out.println("Nom :");
		String name = getInputString(sc);
		System.out.println("Numéro de téléphone :");
		String phonenumber = getInputString(sc);
		
		for (Client client : renter.getClients()) {
	        if ((client.getName().equals(name)) && (client.getPhoneNumber().equals(phonenumber))) {
	            return client;
	        }
	    }
	    return null;
	}
	
	
	public static Vehicle findVehicle(Renter renter, Scanner sc) {
		
		System.out.println("Id du véhicule :");
		int id = getInputInt(sc);
		
		for (Vehicle v : renter.getVehicles()) {
	        if ((v.getIdVehicle().equals(id))) {
	            return v;
	        }
	    }
	    return null;
		
	}
	
	
	public static Car cliSetCar(RenterFactory rf, Scanner sc) {
		Car c = rf.createCar();
		System.out.println("Nom :");
		String name = getInputString(sc);
		c.setName(name);
		System.out.println("Capacité :");
		float capa = getInputFloat(sc);
		c.setHoldingCapacity(capa);
		c.setIdVehicle((new Random()).nextInt(Integer.MAX_VALUE));
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
		t.setIdVehicle((new Random()).nextInt(Integer.MAX_VALUE));
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
		p.setIdVehicle((new Random()).nextInt(Integer.MAX_VALUE));
		return p;
	}
	
	public static boolean checkAvailabilityRent(Renter renter, Client clientToAdd, Vehicle vehicleToAdd, Date startDate, Date endDate) {
		
		for (Rent rent: renter.getRents()) {
			// check if the client has (or not) booked a rent
			if (rent.getClient().get(0).equals(clientToAdd)) {
				System.out.println("Vous avez déjà une réservation ! La voici : " + rent.toString() + ", Véhicule : " + rent.getVehicle().toString());
				return false;
			}
			
			// check if the car is being used
			if (rent.getVehicle().get(0).equals(vehicleToAdd)) {
				// in 'main' function, startDate & endDate should be in the right order
				if (!(rent.getEndDate().before(startDate) || rent.getStartDate().after(endDate))) {
					System.out.println("La voiture demandée est indisponible. Voici la réservation pour laquelle elle est empruntée : " +  rent.toString());
					return false;
				}
			}
		}
		return true;

	}

	
	
	public static void main(String[] args) {
		RenterFactory rentFactory = RenterFactory.eINSTANCE;
		Renter renter = rentFactory.createRenter();
		

		/***** Configuration du ResourceSet ****/
		
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
		
		
		/** Scanner **/
		Scanner sc = new Scanner(System.in);
		
		
		boolean arret = false;
		System.out.println("Bienvenue dans le programme de location de véhicules !");
		
		while (!arret) {
			int choice = displayChoicesAndGetNumber(sc);

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
										
				// ajouter un véhicule
				case 3:					
					System.out.println("Type de véhicule (voiture/camion/pickup):");
					String typeVehicle = getInputString(sc);
					if (typeVehicle.equals("voiture")) {
						Car c = cliSetCar(rentFactory, sc);
						renter.getVehicles().add(c);

					} else if (typeVehicle.equals("camion")) {
						Truck t = cliSetTruck(rentFactory, sc);
						renter.getVehicles().add(t);
					} else if (typeVehicle.equals("pickup")) {
						PickUp p = cliSetPickUp(rentFactory, sc);
						renter.getVehicles().add(p);
					} else {
						System.out.println("Saisie incorrecte, veuillez réessayer.");
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
					
					
					System.out.println("Ajout du client existant à la location :");
					Client clientToAdd = findClient(renter, sc);
					
					if (clientToAdd != null) {
						System.out.println("Ajout du véhicule pour la location :");
						Vehicle vehicleToAdd = findVehicle(renter, sc);
						
						if (vehicleToAdd != null) {
							
							System.out.println("Date de début :");
							Date startDate = getInputDate(sc);
							System.out.println("Date de fin :");
							Date endDate = getInputDate(sc);
							
							if (startDate == null || endDate == null) {
								break;
							}

							// a client can rent a car for the day
							if (startDate.compareTo(endDate) > 0) {
								System.out.println("La début de début est après celle de fin : veuillez réessayer.");
								break;
							}
							
							boolean eligibility = checkAvailabilityRent(renter, clientToAdd, vehicleToAdd, startDate, endDate);
							
							// finally add to list of rents
							if (eligibility) {
								Rent rent = initRent(rentFactory, sc, startDate, endDate);
								rent.getClient().add(clientToAdd);
								rent.getVehicle().add(vehicleToAdd);
								renter.getRents().add(rent);
								System.out.println("Location créée !");
							} else {
								System.out.println("Impossible de créer la location : le client loue déjà un véhicule ou le véhicule demandé est indisponible.");

							}
						} else {
							System.out.println("Véhicule non trouvé ! Il faut fournir un véhicule existant pour créer une location.");
						}
					} else {
						System.out.println("Client non trouvé ! Il faut fournir un client existant pour créer une location.");
					}
					
					break;
					
				// afficher la boutique
				case 8:
					System.out.println("Nom : "  +renter.getName());
					System.out.println("Employés : " + renter.getEmployees().toString());
					System.out.println("Véhicules : " + renter.getVehicles().toString());
					System.out.println("Clients : " + renter.getClients().toString());
					System.out.println("Locations : ");
					for(Rent r: renter.getRents()) {
						System.out.println("* " + r.toString() + ", Client : " + r.getClient().toString() + ", Véhicule : " + r.getVehicle().toString());
					}
					break;
					
					
				// charger un modèle existant
				case 9:
					System.out.println("AVERTISSEMENT : Ceci va remplacer le modèle actuellement chargé et les données non sauvegardées seront perdues.");
					System.out.println("Donner le nom du fichier modèle à charger (bien préciser l'extension '.xmi' :");
					String fileNameLoad = getInputString(sc);

					// création d'une resource à partir d'un fichier existant
					try {
					Resource resourceFromExistent = rs.getResource(URI.createFileURI(fileNameLoad), true); // `true` == "load now"
					// true indique que l'on force le chargement de la resource maintenant

					// Je pars du principe que la classe Renter est la racine de notre modèle
					renter = (Renter)(resourceFromExistent.getContents().get(0));
					
					System.out.println("Modèle chargé !");
					} catch (Exception e) {
						System.out.println("erreur : le fichier n'existe pas :" + e.getMessage());
					}
					
					break;
					
				// sauvegarder dans un modèle
				case 10:
					

					// ------ ResourceSet part ----------------- //
					System.out.println("Donner un nom au fichier (extension '.xmi' ajoutée automatiquement) :");
					String fileNameSave = getInputString(sc);
					
					
					// Création de la ressource avec un chemin de fichier où sauvegarder le modèle
					Resource resource = rs.createResource(URI.createFileURI(fileNameSave + ".xmi"));
					// attention, URI -> org.eclipse.emf.common.util.URI
					
					// notre modèle que l'on a créé avec la factory 
					Renter racineModeleRenter = renter;
          
					// on ajoute notre modèle dans la ressource
					resource.getContents().add(racineModeleRenter);

					// la méthode save de la Resource accepte une map contenant les options de sérialisation
					try {
						resource.save(Collections.EMPTY_MAP); // en pratique : passer une map vide
						System.out.println("Modèle sauvegardé.");
					}
					catch (IOException exception) {
						System.out.println("erreur durant la sauvegarde du modèle : " + exception.getMessage());
					}

					break;
					
				// ajouter un manager
				case 11:
					// remove any existing Manager (not the cleanest way; system model should map the Renter to the Manager)
					for(Employee emp : renter.getEmployees()) {
						if (emp instanceof Manager) {
							System.out.println("Le manager précédent a été retiré de la boutique.");
							renter.getEmployees().remove(emp);
							break;
						}
					}
					System.out.println("Qui est le nouveau manager ?");
					Manager manager = cliSetManager(rentFactory, sc);
					renter.getEmployees().add(manager);
					break;
					
				// donner un nom à la boutique
				case 12:
					System.out.println("Donner un nom à la boutique:");
					String input = sc.next();
					renter.setName(input);
					break;
				
				// quitter le programme
				case 13:
					arret = true;
					break;
					
				default:
					System.out.println("Choix invalide, veuillez réessayer.");
					break;
					
			}
			
		}

		System.out.println("Fin du programme.");
		sc.close();
		
	}
}
