/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerem
 */
public class Flight {
    private Airplane airplane;
    private String departureAirportCode;
    private String destinationAirportCode;

    public Flight(Airplane airplane, String departureAirportCode, String destinationAirportCode) {
        this.airplane = airplane;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }
    
    
    public String toString() {
        return this.getAirplane() + " (" + this.getDepartureAirportCode() + "-" + this.getDestinationAirportCode() + ")";
    }
    
    
    
}
