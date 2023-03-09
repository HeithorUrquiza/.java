package poo_II.fabrica_de_notebooks.padrao_AbstractFactory.notebooks;

public class GigabyteNotebook implements Notebook{

    private String tela;
    private String processador;
    private String armazenamento;
    private String ram;
    private String placaDeVideo;
    private String teclado;
    private String marca;
    private String slotDisponivel;
    private String sistemaOperacional;
    private String cor;
    private String placaMae;


    public GigabyteNotebook(){}


    public String getTela() {
        return tela;
    }
    public void setTela(String tela) {
        this.tela = tela;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
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
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    public String getTeclado() {
        return teclado;
    }
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSlotDisponivel() {
        return slotDisponivel;
    }
    public void setSlotDisponivel(String slotDisponivel) {
        this.slotDisponivel = slotDisponivel;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlacaMae() {
        return placaMae;
    }
    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }


    @Override
    public String exibirNotebook() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n| Tela: " + " ".repeat(16) + "|  " +getTela());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Processador: " + " ".repeat(9) + "|  " +getProcessador());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Armazenamento: " + " ".repeat(7) + "|  " +getArmazenamento());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Ram: " + " ".repeat(17) + "|  " +getRam());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Placa de Vídeo: " + " ".repeat(6) + "|  " +getPlacaDeVideo());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Teclado: " + " ".repeat(13) + "|  " +getTeclado());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Marca: " + " ".repeat(15) + "|  " +getMarca());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Slot(s) de Memória: " + " ".repeat(2) + "|  " +getSlotDisponivel());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Sistema Operacional: " + " ".repeat(1) + "|  " +getSistemaOperacional());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Cor: " + " ".repeat(17) + "|  " +getCor());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Placa Mãe: " + " ".repeat(11) + "|  " +getPlacaMae());
        sb.append("\n" + "-".repeat(25) + "\n\n");
        
        return sb.toString();
    }
}
