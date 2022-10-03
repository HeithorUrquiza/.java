package poo.jornal_desportivo;

public abstract class Divisao {
    
    protected String division;


    public Divisao(String division) {
        this.division = division;
    }


    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public abstract void promotTeam();
    public abstract void demoteTeam();
}
