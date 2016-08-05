package Model;

/**
 *
 * @author Hendric, Murillo
 * 
 */
import java.util.Date;

public class Comissao extends Pessoa {

    private String cargo;

    public Comissao(){}
    /**
     * 
     * @param nome
     * @param dataNasc
     * @param RG
     * @param CPF
     * @param cargo 
     */
    public Comissao(String nome, Date dataNasc, String RG, String CPF,
                    String cargo){
        super(nome, dataNasc, RG, CPF);
        
        this.cargo = cargo;
    }
    /**
     * 
     * @return retorna o cargo 
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * 
     * @param cargo 
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
