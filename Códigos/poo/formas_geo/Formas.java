package poo.formas_geo;

public class Formas implements InterfaceFormas {
    
    private String name;
    
    public Formas(String name){
        this.name = name;    
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void calcArea() {
        
    }

    @Override
    public void calcPerimeter() {
        
    }

    @Override
    public void calcVolume() {
        
    }

    
}
