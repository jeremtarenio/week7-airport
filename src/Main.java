
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Airport naia = new Airport();
        
        TextUserInterface ui = new TextUserInterface(naia);
        ui.start();
    }
}
