package poo.veiculo;

public class Veiculo {
    
    private String tipo;
    private String modelo;
    private String marca;
    private String id;
    private String fonteEnergia;
    private double qtdCombustivel;
    private double totTanque;
    private String cor;
    private double potencia;
    private String locomocao;


    public Veiculo(String tipo, String modelo, String marca, String id, String fonteEnergia, double qtdCombustivel, 
            double totTanque, String cor, double potencia, String locomocao){
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.id = id;
        this.fonteEnergia = fonteEnergia;
        this.qtdCombustivel = qtdCombustivel;
        this.totTanque = totTanque;
        this.cor = cor;
        this.potencia = potencia;
        this.locomocao = locomocao;

    }

    public boolean ligarVcl(double qtdCombustvel){
        if(qtdCombustivel != 0){
            return true;
        }
        return false;
    }

	public boolean checkBateria(int bateria){
		if(bateria != 1){
			return false;
		}
		return true;
	}

    public String getTipo() {
		return tipo;
	}

	public void seTipo(String tipo) {
		this.tipo = tipo;
	}

    public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    public String getFonteEnergia() {
		return fonteEnergia;
	}

	public void setFonteEnergia(String fonteEnergia) {
		this.fonteEnergia = fonteEnergia;
	}

    public double getQtdCombustivel() {
		return qtdCombustivel;
	}

	public void setQtdCombustivel(double qtdCombustivel) {
		this.qtdCombustivel = qtdCombustivel;
	}

    public double getTotTanque() {
		return totTanque;
	}

	public void setTotTanque(double totTanque) {
		this.totTanque = totTanque;
	}

    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

    public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

    public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao= locomocao;
	}


    public String toString(){
        return "--- Veículo --- \n" + "\nTipo: " + tipo + "\nModelo: " + modelo + "\nMarca: " + marca + "\nId: " + id + 
        "\nFonte de Energia: " + fonteEnergia + "\nQuantidade de Combustível: " + qtdCombustivel + "L ou kW" + "\nCapacidade do Tanque: " + 
        totTanque + "L ou kWh" + "\nCor: " + cor + "\nPotencia: " + potencia + "CV" + "\nLocomoçao: " + locomocao + "\n";
    }
}
