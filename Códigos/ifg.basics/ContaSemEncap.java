class ContaSemEncap {
    
    int numero;
    int saldo;

    ContaSemEncap(int numero, int saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    int retornaSaldo(){
        return saldo;
    }

    public static void main(String[] args) {

        ContaSemEncap c = new ContaSemEncap(145, 2222);
        System.out.println(c.numero);
        System.out.println(c.saldo);
        
    }
}

