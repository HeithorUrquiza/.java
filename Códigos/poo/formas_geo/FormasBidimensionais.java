package poo.formas_geo;

public class FormasBidimensionais extends Formas {
    private double axisX;
    private double axisY;

    public FormasBidimensionais(String name, double axisX, double axisY){
        super(name);
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public double getAxisX() {
        return axisX;
    }

    public void setAxisX(double axisX) {
        this.axisX = axisX;
    }

    public double getAxisY() {
        return axisY;
    }

    public void setAxisY(double axisY) {
        this.axisY = axisY;
    }
}
