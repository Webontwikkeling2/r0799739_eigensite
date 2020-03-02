package domain.db;

import domain.model.Toestel;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class ToestelDB {
    private ArrayList<Toestel> toestellen = new ArrayList<>();

    public ArrayList<Toestel> getToestellen(){
        return toestellen;
    }

    public void add(Toestel toestel){
        toestellen.add(toestel);
    }

    public Toestel getToestel(String naam) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Deze functie is nog niet beschikbaar.");
    }

    public Toestel getToestelMetMeesteOpslag() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Deze functie is nog niet beschikbaar.");
    }

    public int getTotaalAantalToestellen(){
        int aantal = 0;
        for (Toestel toestel: toestellen) {
            aantal += toestel.getAantal();
        }
        return aantal;
    }
}
