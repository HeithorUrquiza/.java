package poo_II.builder.builders;

public class XBOXConsole implements ConsoleBuilder {

    private Console xbox;


    public XBOXConsole(){
        this.xbox = new Console();
    }


    @Override
    public void buildPlacaDeVideo(String peca) {
        xbox.setPlacaDeVideo(peca);
    }

    @Override
    public void buildCPU(String peca) {
        xbox.setCPU(peca);
    }

    @Override
    public void buildArmazenamento(String peca) {
        xbox.setArmazenamento(peca);
    }

    @Override
    public void buildRam(String peca) {
        xbox.setRam(peca);
    }

    @Override
    public Console getConsole(){
        return this.xbox;
    }
    
    public void reset(){
        this.xbox = new Console();
    }    

    @Override
    public String toString() {
        return xbox.getPlacaDeVideo() + "\n" + xbox.getCPU() + "\n" +xbox.getArmazenamento()+ "\n" +xbox.getRam();
    }
}
