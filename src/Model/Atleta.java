package Model;


import java.util.Date;

public class Atleta extends Pessoa {

    private int numeroCamisa;
    private double altura;
    private double peso;
    private String posicao;
    

    public Atleta(int idPessoa, String Nome, Date dataNasc, String RG, String CPF,
            double Altura, double Peso, String Posicao){
        super(Nome, dataNasc, RG, CPF);
        
        this.altura = Altura;
        this.peso = Peso;
        this.posicao = Posicao;
    }

    public Atleta() {};
    
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double Altura) {
        this.altura = Altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double Peso) {
        this.peso = Peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String Posicao) {
        this.posicao = Posicao;
    }

    @Override
    public String toString() {
        return String.format("%d - %-20s %-20d %-20f %-20f %-20s", super.getIdPessoa(), super.getNome(), numeroCamisa, altura, peso, posicao);
    }    
}
