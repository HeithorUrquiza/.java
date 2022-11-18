package poo.aeroporto.aeronave;

public enum Modelo {
    
    AIRBUS_380("airbus 380"), BOEING_707("boeing 707"), AIRBUS_319("airbus 319"), AIRBUS_319_100("airbus 319-100"), 
    AIRBUS_320("airbus 320"), AIRBUS_320_200("airbus 320-200"), AIRBUS_321_200("airbus 321-200"), AIRBUS_330("airbus 330"), 
    AIRBUS_330_200("airbus 330-200"), ATR_42_500("ATR 42-500"), ATR_72_500("ATR 72-500"), EMBRAER_175("embraer 175"), 
    EMBRAER_190("embraer 190"), EMBRAER_195("embraer 190"), BOEING_727("boeing 727"), BOEING_767("boeing 767"), 
    BOEING_767_300ER("boeing 767-300ER"), BOEING_757("boeing 757"), BOEING_787("boeing 787"), BOEING_737("boeing 737"), BOEING_777("boeing 777");

    private String type;

    Modelo(String type){
        this.type = type;
    }

    public String getModel(){
        return this.type;
    }

    public void setModel(String type){
        this.type = type;
    }

}
