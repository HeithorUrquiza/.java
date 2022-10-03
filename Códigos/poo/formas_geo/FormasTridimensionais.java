package poo.formas_geo;

public class FormasTridimensionais extends Formas {
    
    private double axisX, axisY, axisZ;

    public FormasTridimensionais(String name, double axisX, double axisY, double axisZ){
        super(name);
        this.axisX = axisX;
        this.axisY = axisY;
        this.axisZ = axisZ;
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

    public double getAxisZ() {
        return axisZ;
    }

    public void setAxisZ(double axisZ) {
        this.axisZ = axisZ;
    }
 
}
    
