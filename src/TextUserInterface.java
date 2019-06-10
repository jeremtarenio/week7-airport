
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jerem
 */
public class TextUserInterface {

    private Scanner reader;
    private Airport airport;

    public TextUserInterface(Airport airport) {
        reader = new Scanner(System.in);
        this.airport = airport;
    }

    public void start() {
        String ans = "";

        while (true) {
            System.out.println("Airport panel\n"
                    + "--------------------\n"
                    + "\n"
                    + "Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            ans = reader.nextLine();

            if (ans.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());

                airport.addAirplane(new Airplane(id, capacity));
                airport.printAirplanes();
            } else if (ans.equals("2")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departureAirportCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationAirportCode = reader.nextLine();

                Flight temp = null;

                for (Airplane airplane : airport.getAirplanes()) {
                    if (airplane.getId().equals(id)) {
                        temp = new Flight(airplane, departureAirportCode, destinationAirportCode);
                        airport.addFlight(temp);
                        airport.printFlights();
                        break;
                    }
                }
                
                if (temp == null) {
                    System.out.println("Plane doesn't exist.");
                }

            } else if (ans.equals("x")) {
                break;
            }
        }
    }
}
