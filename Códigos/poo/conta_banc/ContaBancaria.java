package poo.conta_banc;

public class ContaBancaria{
    
    public int numConta;
    protected String tipoConta;
    private double saldo;
    private String dono;
    private boolean status;

    public ContaBancaria(){
        this.saldo = 0.00;
        this.status = false;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipoConta(){
        return tipoConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void showStatus(){
        System.out.println("\nConta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipoConta());
        System.out.println("Saldo: R$" +this.getSaldo());
        System.out.println("Dono: " +this.getDono());
        System.out.println("Status: " +this.getStatus());
    }

    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if (tipoConta.equals("CC")){
            this.setSaldo(50.00);
        } else if (tipoConta.equals("CP")){
            this.setSaldo(150.00);
        }
    }

    public void fecharConta(){
        if (status == true){
            if(saldo > 0){
                System.out.println("Conta com dinheiro");
            } else if (saldo < 0){
                System.out.println("Conta em débito");
            } else {
                this.setStatus(false);
            }
        } else {
            System.out.println("É necessário que haja uma conta antes");
        }
    }

    public void sacar(double valor){
        if (status == true){
            if (saldo >= valor){
                this.setSaldo(this.getSaldo() - valor);
            } else if (saldo < valor){
                System.out.println("Saldo insuficiente: " +this.getSaldo());
            }
        } else {
            System.out.println("É necessário ter uma conta aberta para sacar");
        }
    }

    public void depositar(double valor){
        if(status == true){
            this.setSaldo(this.getSaldo() + valor);;
        } else {
            System.out.println("Não há conta para realizar o depósito");
        }
    }

    public void pgMensal(){
        double valor = 0;
        if (tipoConta.equals("CC")){
            valor = 12.00;
        } else if (tipoConta.equals("CP")){
            valor = 20.00;
        }
        
        if(status == true){
            this.setSaldo(this.getSaldo() - valor);
        }
    }

 
}