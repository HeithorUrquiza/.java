package poo.aeroporto.aeronave;

public enum Modelo {
    
    AIRBUS_380(), BOEING_707(), AIRBUS_319(), AIRBUS_319_100(), AIRBUS_320(),
    AIRBUS_320_200(), AIRBUS_321_200(), AIRBUS_330(), AIRBUS_330_200(), ATR_42_500(),
    



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
