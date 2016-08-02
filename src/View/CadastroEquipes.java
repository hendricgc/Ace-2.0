/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EquipeController;
import Model.Equipe;
import java.sql.SQLException;
import javax.swing.border.Border;

/**
 *
 * @author Hendric
 */
public class CadastroEquipes extends javax.swing.JPanel {

    /**
     * Creates new form CadastroEquipes
     */
    
    private Border bordaPadrao;
    private boolean editando = false;
    private Equipe a;
    private final EquipeController equipeController;
    
    public CadastroEquipes(EquipeController equipeController) {
        this.equipeController = equipeController;
        initComponents();
        labelErro.setVisible(false);
        botaoEditar.setVisible(false);
    }

    public CadastroEquipes(EquipeController equipeController, Equipe a) {
        this.equipeController = equipeController;
        this.a = a;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCor1 = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        labelRG = new javax.swing.JLabel();
        labelErro = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        campoFundacao = new javax.swing.JFormattedTextField();
        campoCor2 = new javax.swing.JTextField();
        botaoEditar = new javax.swing.JButton();
        labelNascimento = new javax.swing.JLabel();
        campoEquipe = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();

        botaoSalvar.setText("Salvar");
        botaoSalvar.setAlignmentY(0.0F);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelRG.setText("Cor 1");

        labelErro.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        labelErro.setForeground(new java.awt.Color(255, 0, 0));
        labelErro.setText("Preencher todos os campos obrigatórios");
        labelErro.setFocusable(false);
        labelErro.setRequestFocusEnabled(false);

        labelCPF.setText("Cor 2");

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        labelNascimento.setText("Ano de Fundação");

        labelNome.setText("Equipe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCor1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCor2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelErro)
                        .addGap(246, 246, 246)
                        .addComponent(botaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvar)))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRG)
                    .addComponent(labelCPF)
                    .addComponent(labelNascimento)
                    .addComponent(campoFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar)
                    .addComponent(botaoSalvar)
                    .addComponent(labelErro))
                .addContainerGap(507, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        a = new Equipe();
        a.setNome(campoEquipe.getText());
        a.setAnoFundacao(Integer.parseInt(campoFundacao.getText()));
        a.setCor1(campoCor1.getText());
        a.setCor2(campoCor2.getText());
        try {
            if(!editando){
                if(equipeController.cadastrarEquipe(a))
                System.out.println("Cadastrado com sucesso");
                else
                System.out.println("Erro ao cadastrar atleta");
            }
            else{
                //if(equipeController))
                //System.out.println("Atualizado com sucesso");
                //else
                //System.out.println("Erro ao atualizar cadastro");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        editando = true;
        campoEquipe.setEnabled(true);
        campoCor2.setEnabled(true);
        campoFundacao.setEnabled(true);
        campoCor1.setEnabled(true);

        botaoSalvar.setEnabled(true);
    }//GEN-LAST:event_botaoEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCor1;
    private javax.swing.JTextField campoCor2;
    private javax.swing.JTextField campoEquipe;
    private javax.swing.JFormattedTextField campoFundacao;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRG;
    // End of variables declaration//GEN-END:variables
}
