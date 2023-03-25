package poo_II.builder.builders;

public interface ConsoleBuilder {
    public void buildPlacaDeVideo(String peca);
    public void buildCPU(String peca);
    public void buildArmazenamento(String peca);
    public void buildRam(String peca);
    public Console getConsole();
    public void reset();
}

