package Model;

/**
 *@author Hendric, Murillo
 */

import java.util.Date;

public class Atleta extends Pessoa {

    private int numeroCamisa;
    private double altura;
    private double peso;
    private String posicao;
    
    /**
     * Define uma Pessoa como um Atleta
     * @param idPessoa
     * @param Nome
     * @param dataNasc
     * @param RG
     * @param CPF
     * @param Altura
     * @param Peso
     * @param Posicao 
     */
    public Atleta(int idPessoa, String Nome, Date dataNasc, String RG, String CPF,
            double Altura, double Peso, String Posicao){
        super(Nome, dataNasc, RG, CPF);
        
        this.altura = Altura;
        this.peso = Peso;
        this.posicao = Posicao;
    }

    public Atleta() {};
    /**
     * 
     * @return numero da camisa do atleta 
     */
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    /**
     * 
     * @param numeroCamisa 
     */
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    
    /**
     * 
     * @return altura do atleta 
     */
    public double getAltura() {
        return altura;
    }

    /**
    * 
    * @param Altura 
    */
    public void setAltura(double Altura) {
        this.altura = Altura;
    }

    /**
     * 
     * @return peso do atleta 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * 
     * @param Peso 
     */
    public void setPeso(double Peso) {
        this.peso = Peso;
    }
    
    /**
     * 
     * @return posicao do atleta 
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * 
     * @param Posicao 
     */    
    public void setPosicao(String Posicao) {
        this.posicao = Posicao;
    }

    /**
     * 
     * @return metodo toString 
     */    
    @Override
    public String toString() {
        return String.format("%d - %-20s %-20d %-20f %-20f %-20s", super.getIdPessoa(), super.getNome(), numeroCamisa, altura, peso, posicao);
    }    
}
