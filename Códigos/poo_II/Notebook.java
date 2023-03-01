package poo_II;

public class Notebook {
    
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
    private String carcaca;
    private String webcam;
    
    
    public Notebook(String tela, String processador, String armazenamento, String ram, String placaDeVideo,
            String teclado, String marca, String slotDisponivel, String sistemaOperacional, String cor, String placaMae,
            String carcaca, String webcam) {
        this.tela = tela;
        this.processador = processador;
        this.armazenamento = armazenamento;
        this.ram = ram;
        this.placaDeVideo = placaDeVideo;
        this.teclado = teclado;
        this.marca = marca;
        this.slotDisponivel = slotDisponivel;
        this.sistemaOperacional = sistemaOperacional;
        this.cor = cor;
        this.placaMae = placaMae;
        this.carcaca = carcaca;
        this.webcam = webcam;
    }


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

    public String getCarcaca() {
        return carcaca;
    }

    public void setCarcaca(String carcaca) {
        this.carcaca = carcaca;
    }

    public String getWebcam() {
        return webcam;
    }

    public void setWebcam(String webcam) {
        this.webcam = webcam;
    }
} 
