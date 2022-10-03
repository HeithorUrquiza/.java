package poo.formas_geo;

public class Quadrado extends FormasBidimensionais {

    private double area, perimeter;

    public Quadrado(String name, double axisX, double axisY) {
        super(name, axisX, axisY);
        this.area = 0.0;
        this.perimeter = 0.0;
    } 

    private double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getPerimeter() {
        return perimeter;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    @Override
    public void calcArea() {
        this.setArea(this.getAxisX() * this.getAxisY());
    }

    @Override
    public void calcPerimeter() {
        this.setPerimeter(4*this.getAxisX());
    }

    public String toString(){
        return "\n---------------" + "\nNome: " + this.getName() + "\nEixo X: " +this.getAxisX() + "\nEixo Y: " + this.getAxisY() +
        String.format("\nÁrea: %.2f m^2 \nPerímetro: %.2f m", this.getArea(), this.getPerimeter()); 
    }
    
}
