package poo_II.fabrica_de_notebooks.padrao_normal;

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
    public String getProcessador() {
        return processador;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public String getRam() {
        return ram;
    }
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public String getTeclado() {
        return teclado;
    }
    public String getMarca() {
        return marca;
    }
    public String getSlotDisponivel() {
        return slotDisponivel;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public String getCor() {
        return cor;
    }
    public String getPlacaMae() {
        return placaMae;
    }
    public String getCarcaca() {
        return carcaca;
    }
    public String getWebcam() {
        return webcam;
    }


    @Override
    public String toString() {
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
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Carcaça: " + " ".repeat(13) + "|  " +getCarcaca());
        sb.append("\n" + "-".repeat(25));
        sb.append("\n| Webcam: " + " ".repeat(14) + "|  " +getWebcam());
        sb.append("\n" + "-".repeat(25) + "\n\n");
        
        return sb.toString();
    }
} 

