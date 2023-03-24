package poo_II.builder.builders;

public class XBOXConsole implements ConsoleBuilder {

    private Console xbox;


    public XBOXConsole(){
        this.xbox = new Console();
    }


    @Override
    public void buildPlacaDeVideo(String peca) {
        xbox.setPlacaDeVideo(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildPlacaDeVideo'");
    }

    @Override
    public void buildCPU(String peca) {
        xbox.setCPU(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildCPU'");
    }

    @Override
    public void buildArmazenamento(String peca) {
        xbox.setArmazenamento(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildArmazenamento'");
    }

    @Override
    public void buildRam(String peca) {
        xbox.setRam(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildRam'");
    }

    public Console getXBOX(){
        return this.xbox;
    }
    
    public void reset(){
        this.xbox = new Console();
    }    
}
