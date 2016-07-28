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
public class CadastroEquipe extends javax.swing.JPanel {

    /**
     * Creates new form CadastroEquipe
     */
    
    private final Border bordaPadrao;
    private final EquipeController equipeController;
    
    public CadastroEquipe(EquipeController equipeController) {
        this.equipeController = equipeController;
        initComponents();
        labelErro.setVisible(false);
        bordaPadrao = campoNome.getBorder();
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
        labelCor1 = new javax.swing.JLabel();
        labelErro = new javax.swing.JLabel();
        labelCor2 = new javax.swing.JLabel();
        campoFundacao = new javax.swing.JFormattedTextField();
        campoCor2 = new javax.swing.JTextField();
        labelNascimento = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelCor1.setText("Cor 1");

        labelErro.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        labelErro.setForeground(new java.awt.Color(255, 0, 0));
        labelErro.setText("Preencher todos os campos obrigatórios");
        labelErro.setFocusable(false);
        labelErro.setRequestFocusEnabled(false);

        labelCor2.setText("Cor 2");

        labelNascimento.setText("Ano de Fundação");

        labelNome.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCor1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCor2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSalvar)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCor1)
                    .addComponent(labelCor2)
                    .addComponent(campoCor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNascimento)
                    .addComponent(campoFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelErro)
                    .addComponent(botaoSalvar))
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Equipe a = new Equipe();
        a.setNome(campoNome.getText());
        a.setCor1(campoCor1.getText());
        a.setCor2(campoCor2.getText());
        a.setAnoFundacao(Integer.parseInt(campoFundacao.getText()));
        try {
            if(equipeController.cadastrarEquipe(a))
            System.out.println("Cadastrado com sucesso");
            else
            System.out.println("Erro");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCor1;
    private javax.swing.JTextField campoCor2;
    private javax.swing.JFormattedTextField campoFundacao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel labelCor1;
    private javax.swing.JLabel labelCor2;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    // End of variables declaration//GEN-END:variables
}
