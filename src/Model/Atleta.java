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
     * @param idPessoa id de uma pessoa
     * @param Nome Nome de uma pessoa
     * @param dataNasc data de nascimento de uma pessoa
     * @param RG RG de uma pessoa
     * @param CPF CPF de uma pessoa
     * @param Altura Altura de uma pessoa
     * @param Peso Peso de uma pessoa
     * @param Posicao Posiçao em que o atleta joga
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
     * Metodo para obter o numero da camiseta de um atleta
     * @return numero da camisa do atleta 
     */
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    /**
     * Metodo para definir o numero da camiseta de um atleta
     * @param numeroCamisa Numero da camiseta
     */
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    
    /**
     * Metodo para obter a altura de um atleta
     * @return altura do atleta 
     */
    public double getAltura() {
        return altura;
    }

    /**
    * metodo para definir a altura de um atleta
    * @param Altura altura do atleta
    */
    public void setAltura(double Altura) {
        this.altura = Altura;
    }

    /**
     * metodo para obter o peso de um atleta
     * @return peso do atleta 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * metodo para definir o peso de um atleta
     * @param Peso peso do atleta
     */
    public void setPeso(double Peso) {
        this.peso = Peso;
    }
    
    /**
     * metoro para obter a posiçao em que o atleta joga
     * @return posicao do atleta 
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * metodo para definir a posicao que o atleta joga
     * @param Posicao posicao que o atleta joga
     */    
    public void setPosicao(String Posicao) {
        this.posicao = Posicao;
    }

    /**
     * metodo para conversao para string
     * @return metodo toString 
     */    
    @Override
    public String toString() {
        return String.format("%d - %-20s %-20d %-20f %-20f %-20s", super.getIdPessoa(), super.getNome(), numeroCamisa, altura, peso, posicao);
    }    
}
