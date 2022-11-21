package poo.aeroporto.pessoas;

public class Aeromoca extends Pessoa{
    
    private int id;
    private String office;


    //Construtor
    public Aeromoca(String name, String cpf, String birth, int id) {
        super(name, cpf, birth);
        this.id = id;
        this.office = "Aeromoça";
    }


    //Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
    

    //Métodos
    public String serveSnack(){
        return "\n*{Servindo lanche para os passageiros}*";
    }    

    public String giveInstructions(){
        return "\n*{Repassando intruções de segurança}*";
    }

    @Override
    public String toString() {
        return "ID: " +getId()+ " | Nome: " +getName()+ " | Cargo: " +getOffice();
    } 
}
