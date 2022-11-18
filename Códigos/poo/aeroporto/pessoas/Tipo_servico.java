package poo.aeroporto.pessoas;

public enum Tipo_servico {
    
    FIRST("Primeira Classe"),
    ECONOMIC("Classe Econômica"),
    EXECUTIVE("Classe Executiva");

    private String type;

    Tipo_servico(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
}
