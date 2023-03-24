package poo_II.builder.builders;

public class Console {
    
    private String placaDeVideo;
    private String CPU;
    private String armazenamento;
    private String ram;
    
    
    public Console() {
    
    }


    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    
    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }
    
    public String getArmazenamento() {
        return armazenamento;
    }
    
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    public String getRam() {
        return ram;
    }
    
    public void setRam(String ram) {
        this.ram = ram;
    }    
}
