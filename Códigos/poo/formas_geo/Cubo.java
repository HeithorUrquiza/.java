package poo.formas_geo;

public class Cubo extends FormasTridimensionais {

    private double area, volume;

    public Cubo(String name, double axisX, double axisY, double axisZ) {
        super(name, axisX, axisY, axisZ);
        this.area = 0.0;
        this.volume = 0.0;
    }

    private double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getVolume() {
        return volume;
    }

    private void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void calcArea() {
        this.setArea(6*(Math.pow(this.getAxisX(), 2)));
    }

    @Override
    public void calcVolume() {
       this.setVolume(Math.pow(getAxisX(), 3));
    }

    public String toString(){
        return "\n---------------" + "\nNome: " + this.getName() + "\nEixo X: " +this.getAxisX() + "\nEixo Y: " + this.getAxisY() +
        "\nEixo Z: " + this.getAxisZ() + String.format("\nÁrea: %.2f m^2 \nVolume: %.2f m^3", this.getArea(), this.getVolume()); 
    }
        
}
