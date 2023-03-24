package poo_II.builder.builders;

public class PS5Console implements ConsoleBuilder {
    
    private Console ps5;


    public PS5Console(){
        this.ps5 = new Console();
    }


    @Override
    public void buildPlacaDeVideo(String peca) {
        ps5.setPlacaDeVideo(peca);    
        throw new UnsupportedOperationException("Unimplemented method 'buildPlacaDeVideo'");
    }

    @Override
    public void buildCPU(String peca) {
        ps5.setCPU(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildCPU'");
    }

    @Override
    public void buildArmazenamento(String peca) {
        ps5.setArmazenamento(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildArmazenamento'");
    }

    @Override
    public void buildRam(String peca) {
        ps5.setRam(peca);
        throw new UnsupportedOperationException("Unimplemented method 'buildRam'");
    }

    public Console getPS5(){
        return this.ps5;
    }

    public void reset(){
        this.ps5 = new Console();
    }
}
