package Model;


import java.util.Date;

public class Comissao extends Pessoa {

    private String cargo;

    public Comissao(){}
    
    public Comissao(String nome, Date dataNasc, String RG, String CPF,
                    String cargo){
        super(nome, dataNasc, RG, CPF);
        
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
