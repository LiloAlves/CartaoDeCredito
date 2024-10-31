public class CartaoDeCredito {
    private int numero;
    private String nomeTitular;
    private String cpf;
    private double limite;
    private double totalFatura;
    private double taxaCashBack;

public CartaoDeCredito(int numero, String nomeTitular) {
    this.numero = numero;
    this.nomeTitular = nomeTitular;
    this. limite = 1000;
    this.taxaCashBack = 0.0;
}

public CartaoDeCredito(int numero, String nomeTitular, double limite, double taxacashBack) {
    this.numero = numero;
    this.nomeTitular = nomeTitular;
    this.limite = limite;
    this.taxaCashBack = taxaCashBack;
}

       public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    } 

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTotalFatura() {
        return this.totalFatura;
    }

    public void setTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }

    public double getTaxaCashBack() {
        return this.taxaCashBack;
    }

    public void setTaxaCashBack(double taxaCashBack) {
        this.taxaCashBack = taxaCashBack;
    }

    public void consultarLimite() {
        System.out.println("Limite disponível: " + getLimite());
    }

    public void consultarTotalFatura() {
        System.out.println("Total da fatura: " + getTotalFatura());
    }

    public void realizarCompra(double valor) {
        if (valor <= this.limite) {
            this.limite -= valor;
            this.totalFatura += valor;
            System.out.println("Compra realizada com sucesso!");
        } 
        
        else {
            System.out.println("Você não possui limite necessario para essa compra");
        }
        
    }

    public void realizarCompra(double valor, boolean cashBack) {
        if (valor <= this.limite) {
            this.limite -= valor;
            this.totalFatura += valor;
            double cashback = valor * taxaCashBack;
            System.out.println("Compra realizada com sucesso! O valor do seu cashBack foi de: " +cashback);
        } 
        
        else {
            System.out.println("Você não possui limite necessario para essa compra");
        }

    }

    public void alterarLimite(double novoLimite) {
        setLimite(novoLimite);
    }
    
}
