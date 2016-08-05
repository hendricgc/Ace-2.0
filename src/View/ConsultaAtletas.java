/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AtletaController;
import Converter.DateToString;
import Model.Atleta;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hendric
 */
public class ConsultaAtletas extends javax.swing.JPanel {

    private final AtletaController atletaController;
    private final int TELA_WIDTH = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
    private final int TELA_HEIGHT = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
    private Atleta a;
    private LinkedList<Atleta> atletas;
    
    /**
     * Creates new form ConsultaAtletas
     * @param atletaController Controlador do objeto Atleta
     */
    public ConsultaAtletas(AtletaController atletaController) {
        this.atletaController = atletaController;
        initComponents();
        radioMaiorAltura.setSelected(true);
        listarTodosAtletas();
        
    }
    
    public void listarTodosAtletas(){
        try{
            atletas = atletaController.consultarTodosAtletas();
            DefaultTableModel dtm = (DefaultTableModel) tabelaAtletas.getModel();
            DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
            dtcr.setHorizontalAlignment(JLabel.LEFT);
            tabelaAtletas.getColumnModel().getColumn(0).setCellRenderer(dtcr);
            
            atualizarTabela(atletas);
            
            tabelaAtletas.setAlignmentY(TOP_ALIGNMENT);
            tabelaAtletas.updateUI();
            
            tabelaAtletas.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int row = tabelaAtletas.rowAtPoint(evt.getPoint());
                    
                    int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
                    atletaSelecionado(id);
                }
            }); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void atletaSelecionado(int id){
        a = atletaController.buscarAtletaID(id);
        CadastroAtletas telaCadastroAtletas = new CadastroAtletas(atletaController, a);
        telaCadastroAtletas.setSize(TELA_WIDTH, TELA_HEIGHT);
        this.removeAll();
        this.add(telaCadastroAtletas);
        this.updateUI();
    }
    
    public void atualizarTabela(LinkedList<Atleta> atletas){
        DefaultTableModel dtm = (DefaultTableModel) tabelaAtletas.getModel();
        dtm.setRowCount(0);
       
        for(int i = 0; i < atletas.size(); i++){
                String dataNascAtleta = DateToString.dateToString(atletas.get(i).getDataNasc());
                String dataFinal = dataNascAtleta.substring(0, 2) + "/" + dataNascAtleta.substring(2, 4) + "/" + dataNascAtleta.substring(4, 8);
                dtm.addRow(new Object[] { atletas.get(i).getIdPessoa(),
                                            atletas.get(i).getNome(),
                                            atletas.get(i).getPosicao(),
                                            dataFinal
                                        });
            }
    
    }
    
    public void atualizarFiltros(){
        LinkedList<Atleta> atletaAux = new LinkedList<>();
        for(int i = 0; i < atletas.size(); i++){
            Atleta aux = atletas.get(i);
            if(buscarPosicao.getItemAt(buscarPosicao.getSelectedIndex()).equals("Todas")){
                if(aux.getNome().startsWith(buscarNome.getText()) && aux.getCPF().startsWith(buscarCPF.getText()) &&
                            tratarFiltroData(aux) && tratarFiltroAltura(aux))
                        atletaAux.add(aux);
            }
            else{
                if(aux.getNome().startsWith(buscarNome.getText()) && aux.getCPF().startsWith(buscarCPF.getText()) &&
                        aux.getPosicao().equals(buscarPosicao.getItemAt(buscarPosicao.getSelectedIndex())) &&
                        tratarFiltroData(aux) && tratarFiltroAltura(aux))
                            
                    atletaAux.add(aux);
            }
                
                
        }
            atualizarTabela(atletaAux);
    }
    
    public boolean tratarFiltroData(Atleta a){
        
        if(buscarNasc.getText().isEmpty()) return true;
        else                               return (a.getDataNasc().getYear()+1900) <= Integer.parseInt(buscarNasc.getText());
    }
    
    public boolean tratarFiltroAltura(Atleta a){
        if(buscarAltura.getText().isEmpty())    return true;
        else{
            if(radioMaiorAltura.isSelected()){
                return a.getAltura() >= Double.parseDouble(buscarAltura.getText());
            }
            else{
                return a.getAltura() <= Double.parseDouble(buscarAltura.getText());
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAtletas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        buscarNome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        buscarCPF = new javax.swing.JTextField();
        labelAltura = new javax.swing.JLabel();
        buscarAltura = new javax.swing.JTextField();
        radioMenorAltura = new javax.swing.JRadioButton();
        radioMaiorAltura = new javax.swing.JRadioButton();
        labelNascidoAte = new javax.swing.JLabel();
        buscarNasc = new javax.swing.JTextField();
        labelPosicao = new javax.swing.JLabel();
        buscarPosicao = new javax.swing.JComboBox<>();

        tabelaAtletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Posição", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaAtletas);
        if (tabelaAtletas.getColumnModel().getColumnCount() > 0) {
            tabelaAtletas.getColumnModel().getColumn(0).setResizable(false);
            tabelaAtletas.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelaAtletas.getColumnModel().getColumn(1).setResizable(false);
            tabelaAtletas.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaAtletas.getColumnModel().getColumn(2).setResizable(false);
            tabelaAtletas.getColumnModel().getColumn(3).setResizable(false);
            tabelaAtletas.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        labelNome.setText("Nome");

        buscarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarNomeKeyReleased(evt);
            }
        });

        labelCPF.setText("CPF");

        buscarCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarCPFKeyReleased(evt);
            }
        });

        labelAltura.setText("Altura");

        buscarAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarAlturaKeyReleased(evt);
            }
        });

        radioMenorAltura.setText("Menor");
        radioMenorAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMenorAlturaActionPerformed(evt);
            }
        });

        radioMaiorAltura.setText("Maior");
        radioMaiorAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaiorAlturaActionPerformed(evt);
            }
        });

        labelNascidoAte.setText("Nascido até");

        buscarNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarNascKeyReleased(evt);
            }
        });

        labelPosicao.setText("Posição");

        buscarPosicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Ponteiro", "Oposto", "Levantador", "Central", "Líbero" }));
        buscarPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPosicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCPF)
                            .addComponent(labelNascidoAte)
                            .addComponent(labelAltura)
                            .addComponent(labelPosicao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buscarAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(buscarNasc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioMaiorAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioMenorAltura))
                            .addComponent(buscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 377, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarNome)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(buscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(buscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(buscarAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMenorAltura)
                    .addComponent(radioMaiorAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNascidoAte)
                    .addComponent(buscarNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPosicao)
                    .addComponent(buscarPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void buscarNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarNomeKeyReleased
        atualizarFiltros();
    }//GEN-LAST:event_buscarNomeKeyReleased

    private void buscarCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCPFKeyReleased
        atualizarFiltros();  
    }//GEN-LAST:event_buscarCPFKeyReleased

    private void buscarPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPosicaoActionPerformed
        atualizarFiltros();
    }//GEN-LAST:event_buscarPosicaoActionPerformed

    private void buscarAlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarAlturaKeyReleased
        atualizarFiltros();
    }//GEN-LAST:event_buscarAlturaKeyReleased

    private void buscarNascKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarNascKeyReleased
        atualizarFiltros();
    }//GEN-LAST:event_buscarNascKeyReleased

    private void radioMaiorAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaiorAlturaActionPerformed
        radioMenorAltura.setSelected(false);
        radioMaiorAltura.setSelected(true);
        atualizarFiltros();
    }//GEN-LAST:event_radioMaiorAlturaActionPerformed

    private void radioMenorAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMenorAlturaActionPerformed
        radioMaiorAltura.setSelected(false);
        radioMenorAltura.setSelected(true);
        atualizarFiltros();
    }//GEN-LAST:event_radioMenorAlturaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarAltura;
    private javax.swing.JTextField buscarCPF;
    private javax.swing.JTextField buscarNasc;
    private javax.swing.JTextField buscarNome;
    private javax.swing.JComboBox<String> buscarPosicao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelNascidoAte;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPosicao;
    private javax.swing.JRadioButton radioMaiorAltura;
    private javax.swing.JRadioButton radioMenorAltura;
    private javax.swing.JTable tabelaAtletas;
    // End of variables declaration//GEN-END:variables
}
