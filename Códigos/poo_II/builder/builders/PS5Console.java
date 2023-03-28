package poo_II.builder.builders;

public class PS5Console implements ConsoleBuilder {
    
    private Console ps5;


    public PS5Console(){
        this.ps5 = new Console();
    }


    @Override
    public void buildPlacaDeVideo(String peca) {
        ps5.setPlacaDeVideo(peca);    
    }

    @Override
    public void buildCPU(String peca) {
        ps5.setCPU(peca);
    }

    @Override
    public void buildArmazenamento(String peca) {
        ps5.setArmazenamento(peca);
    }

    @Override
    public void buildRam(String peca) {
        ps5.setRam(peca);
    }

    @Override
    public Console getConsole() {
        return this.ps5;
    }

    public void reset(){
        this.ps5 = new Console();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n ----- PS5 -----" + "\n Placa de vídeo:  " + ps5.getPlacaDeVideo());
        sb.append("\n CPU: " + " ".repeat(12) + ps5.getCPU() + "\n Armazenamento:   " + ps5.getArmazenamento() + "\n Ram: " + " ".repeat(12) + ps5.getRam() + "\n");

        return sb.toString();
    }
}
