/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CampeonatoController;
import Controller.EquipeCampeonatoController;
import Controller.EquipeController;
import Controller.JogoController;
import Model.Campeonato;
import Model.Equipe;
import Model.Jogo;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hendric
 */
public class CriarJogos extends javax.swing.JPanel {

    /**
     * Creates new form CriarJogos
     */
    
    private final JogoController jogoController;
    private final EquipeController equipeController;
    private final CampeonatoController campeonatoController;
    private final EquipeCampeonatoController equipeCampeonatoController;
    private LinkedList<Campeonato> campeonatos = new LinkedList<>();
    private LinkedList<Equipe> equipesCampeonato = new LinkedList<>();
            
    
    public CriarJogos(JogoController jc, EquipeController ec, CampeonatoController cc, EquipeCampeonatoController ecc) {
        this.jogoController = jc;
        this.equipeController = ec;
        this.campeonatoController = cc;
        this.equipeCampeonatoController = ecc;
               
        initComponents();
        
        listarInfos();
    }

    
    public void listarInfos(){
        
        try {
            campeonatos = campeonatoController.listarTodosCampeonatos();
            
            for(int i = 0; i < campeonatos.size(); i++){
                caixaCampeonato.addItem(campeonatos.get(i).getNome());
            }
                
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caixaMandante = new javax.swing.JComboBox<>();
        caixaCampeonato = new javax.swing.JComboBox<>();
        caixaVisitante = new javax.swing.JComboBox<>();
        botaoSalvar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criar Confronto"));

        jLabel1.setText("Campeonato");

        jLabel2.setText("Equipe Mandante");

        jLabel3.setText("Equipe Visitante");

        caixaMandante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaMandanteActionPerformed(evt);
            }
        });

        caixaCampeonato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCampeonatoActionPerformed(evt);
            }
        });

        caixaVisitante.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaCampeonato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaMandante, 0, 347, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caixaCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(caixaMandante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSalvar)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void caixaCampeonatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCampeonatoActionPerformed
        Campeonato campeonato = new Campeonato();
        caixaMandante.removeAllItems();
        for(int i = 0; i < campeonatos.size(); i++){
            if(campeonatos.get(i).getNome().equals(caixaCampeonato.getSelectedItem().toString())){
                campeonato = campeonatos.get(i);
                System.out.println(campeonato);
                break;
            }           
        }
        
        try {
            if(campeonato != null){
                int i;
                equipesCampeonato = equipeCampeonatoController.listarEquipesCampeonato(campeonato);
                for(i = 0; i < equipesCampeonato.size(); i++){
                    caixaMandante.addItem(equipesCampeonato.get(i).getNome());                   
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_caixaCampeonatoActionPerformed

    private void caixaMandanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaMandanteActionPerformed
        caixaVisitante.removeAllItems();
        
        if(caixaMandante.getItemCount() > 0){
            caixaVisitante.setEnabled(true);
            for(int i = 0; i < equipesCampeonato.size(); i++){
                if(!equipesCampeonato.get(i).getNome().equals(caixaMandante.getSelectedItem().toString()))
                    caixaVisitante.addItem(equipesCampeonato.get(i).getNome());
            }
        }
    }//GEN-LAST:event_caixaMandanteActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            Jogo jogo = new Jogo();
            Campeonato camp = new Campeonato();
            campeonatos = campeonatoController.listarTodosCampeonatos();
            jogo.setTimeMandante(equipeController.procurarEquipeNome(caixaMandante.getSelectedItem().toString()));
            jogo.setTimeVisitante(equipeController.procurarEquipeNome(caixaVisitante.getSelectedItem().toString()));
            for(int i = 0; i < campeonatos.size(); i++){
                if(campeonatos.get(i).getNome().equals(caixaCampeonato.getSelectedItem().toString())){
                    camp = campeonatos.get(i);
                    break;
                }
            }
            if(jogoController.inserirJogo(jogo.getTimeMandante(), jogo.getTimeVisitante(), camp))
                JOptionPane.showMessageDialog(this, "Show de bola");
            else
                JOptionPane.showMessageDialog(this, "Deu ruim");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<String> caixaCampeonato;
    private javax.swing.JComboBox<String> caixaMandante;
    private javax.swing.JComboBox<String> caixaVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}