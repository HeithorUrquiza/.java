package poo.formas_geo;

public class Tetraedro extends FormasTridimensionais{

    private double area, volume;

    public Tetraedro(String name, double axisX, double axisY, double axisZ) {
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
        this.setArea(Math.pow(getAxisX(), 2)*Math.sqrt(3));
    }

    @Override
    public void calcVolume() {
        this.setVolume((Math.pow(getAxisX(), 3)*Math.sqrt(2))/12);
    }

    public String toString(){
        return "\n---------------" + "\nNome: " + this.getName() + "\nEixo X: " +this.getAxisX() + "\nEixo Y: " + this.getAxisY() +
        "\nEixo Z: " + this.getAxisZ() + String.format("\nÁrea: %.2f m^2 \nVolume: %.2f m^3", this.getArea(), this.getVolume()); 
    }
    
}
