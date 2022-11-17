package poo.aeroporto.voos;

public class Assento {
    
    private String id;
    private boolean occupied;
    
    //Construtor
    public Assento(String id, boolean occupied) {
        this.id = id;
        this.occupied = occupied;
    }

    // Get e Set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

}
