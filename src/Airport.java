
import java.util.ArrayList;
import java.util.HashMap;
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
public class Airport {

    public ArrayList<Airplane> airplanes;
    public ArrayList<Flight> flights;

    public Airport() {
        airplanes = new ArrayList<Airplane>();
        flights = new ArrayList<Flight>();
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void printAirplanes() {
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

}
