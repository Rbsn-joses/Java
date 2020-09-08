package programa;
public class Conta {
    //declaração de variáveis com modificadores de acesso
    private int numConta;
    private String nome;
    private String tipo;
    private double saldo;
    private boolean status;
    //Construtor
    Conta(){
        this.numConta = 000;
        this.nome = "Indefinido";
        this.tipo = "indefinido";
        this.saldo = 0;
        this.status = false;
    //Métodos Get e Set
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }
    
}
