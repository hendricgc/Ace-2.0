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
     * metodo para criação de um membro da comissao
     * @param nome nome do membro da comissao
     * @param dataNasc data de nscimento
     * @param RG RG do membro da comissao
     * @param CPF CPF do membro da comissao
     * @param cargo cargo na comissao 
     */
    public Comissao(String nome, Date dataNasc, String RG, String CPF,
                    String cargo){
        super(nome, dataNasc, RG, CPF);
        
        this.cargo = cargo;
    }
    /**
     * metodo para obter o cargo
     * @return retorna o cargo 
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * metodo para definir o cargo
     * @param cargo cargo do membro da comissao
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
