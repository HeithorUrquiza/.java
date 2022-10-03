class Conta {
    
    private int numero;
    private int saldo;

    Conta(int numero, int saldo){
        this.numero = numero;
        this.saldo = saldo;
    }    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Conta c = new Conta(226, 15000);
        System.out.println("\n" + c.numero);
        System.out.println(c.saldo);

        c.setNumero(123);
        c.setSaldo(3000);

        System.out.println("\nNova conta: " + c.getNumero());
        System.out.println("Novo saldo: " + c.getSaldo());
        
    }
}

