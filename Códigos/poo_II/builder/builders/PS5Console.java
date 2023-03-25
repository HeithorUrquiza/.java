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
        return ps5.getPlacaDeVideo() + "\n" + ps5.getCPU() + "\n" +ps5.getArmazenamento()+ "\n" +ps5.getRam();
    }
}
