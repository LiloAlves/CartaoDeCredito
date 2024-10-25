public class CartaoDeCredito {
    private int numero;
    private String nomeTitular;
    private String cpf;
    private double limite;
    private double totalFatura;

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

    public void consultarLimite() {
        System.out.println("Limite disponível: " + getLimite());
    }

    public void consultarTotalFatura() {
        System.out.println("Total da fatura: " + getTotalFatura());
    }

    public void realizarCompra(double valor) {
        if (valor <= this.limite) {
            double limiteAnterior = this.getLimite();
            this.setLimite (limiteAnterior - valor);
            double total = this.getTotalFatura();
            this.setTotalFatura (total + valor);
        } 
        
        else {
            System.out.println("Você não possui limite necessario para essa compra");
        }
        
    }

    public void alterarLimite(double novoLimite) {
        setLimite(novoLimite);
    }
    
}