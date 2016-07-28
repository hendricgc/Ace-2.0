/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tds.hendric.murillo;

/**
 *
 * @author Hendric
 */

import View.Ace;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
 *
 * @author Murillo Machado
 */
public class Main {

      
    /**
     * @param args the command line arguments
     */
    
 //   private static Banco bd = new Banco();
    
    public static void main(String[] args) {
       
//       Menus menu = new Menus();
//       menu.menuPrincipal();
        
        // MESTRES DO POKÉMON
        JFrame jf = new Ace();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth(),
                GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight());
        jf.setVisible(true);
        
/*      String nomeCampeonato = "Copa CC";
        String nomeEquipe1 = "Flamengo";
        String nomeEquipe2 = "Cruzeiro";
        
        String nomeAtleta1 = "Wallace";
        

        // Criando uma equipe no sistema
        bd.getEquipes().add(new Equipe(bd.getNovoIdEquipe(), nomeEquipe1, "Azul", "Branco", 2006));
        bd.getEquipes().add(new Equipe(bd.getNovoIdEquipe(), nomeEquipe2, "Vermelho", "Preto", 1895));
        
        // Removendo um Equipe por nome       
        System.out.println();
        System.out.println("Lista de Times Cadastrados:");
        System.out.println("ID - Nome               Cor 1               Cor 2               Ano de Fundação");
        for(int i = 0; i < bd.getEquipes().size(); i++)
            System.out.println(bd.getEquipes().get(i));
        
        System.out.println();        
        
        // Criando um atleta
        bd.getAtletas().add(new Atleta(bd.getNovoIdAtleta(), nomeAtleta1, new Date(1988, 19, 02), "1234567-7", "324565436-6", 10, 1.97, 88.2, "Oposto"));   
        
        
        // Removendo um atleta
        //bd.getAtletas().remove(bd.getAtletaPorNome("Wallace"));
        
        // Imprimindo atletas cadastrados
        System.out.println("Lista de Atletas Cadastrados:");
        System.out.println("ID - Nome               Camisa               Altura               Peso               Posição");
        for(int i = 0; i < bd.getAtletas().size(); i++)
            System.out.println(bd.getAtletas().get(i));        
    
        // Criando Campeonato
        bd.getCampeonatos().add(new Campeonato(0, nomeCampeonato, "Menino Douglas", bd.getEquipes()));
        for(int i = 0; i < bd.getEquipes().size(); i++)
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().add(new ClassificacaoEquipe(bd.getEquipes().get(i)));
               
        System.out.println();
        
        // Lista de equipes inscritas em um campeonato
        
        System.out.println("Lista de equipes inscritas no campeonato " + nomeCampeonato + ": ");
        for(int i = 0; i < bd.getCampeonatoPorNome(nomeCampeonato).getEquipes().size(); i++){
            System.out.println(bd.getCampeonatoPorNome(nomeCampeonato).getEquipes().get(i));
        }
        
        System.out.println(); 
        
        // Listando Todos os Campeonatos
        System.out.println("Campeonatos Cadastrados no Sistema:");
        System.out.println("ID - Nome                    Organizador               Em andamento");
        for(int i = 0; i < bd.getCampeonatos().size(); i++){
            System.out.println(bd.getCampeonatos().get(i));
        }
        // Criando um jogo de um campeonato específico
        Jogo jogo = new Jogo(bd.getCampeonatoPorNome(nomeCampeonato).getNovoIdJogo(), bd.getEquipePorNome(nomeEquipe1), bd.getEquipePorNome(nomeEquipe2), bd.getCampeonatoPorNome(nomeCampeonato).getIdCampeonato());
        bd.getCampeonatoPorNome(nomeCampeonato).getJogos().add(jogo);
        
        
        System.out.println(); 
        // Listando jogos de um Campeonato
        System.out.println("Lista de Jogos do Campeonato:");
        System.out.println("ID Jogo - ID Campeonato - Time 1                         Time 2                         Resultado");
        for (int i = 0; i < bd.getCampeonatoPorNome(nomeCampeonato).getJogos().size(); i++) {
            System.out.println(bd.getCampeonatoPorNome(nomeCampeonato).getJogos().get(i));
        }
        
        System.out.println();
        
        // Inserindo resultado de um jogo
            // Colocando o resultado dos sets
            bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getSets().add(new Set(25, 15, 1));
            bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getSets().add(new Set(25, 18, 2));
            bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getSets().add(new Set(25, 21, 3));
        
        // Imprimindo o resultado
        System.out.println(bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getResultado());
        
        System.out.println();
        
        // Imprime a lista de jogos novamente
        System.out.println("Lista de Jogos do Campeonato:");
        for (int i = 0; i < bd.getCampeonatoPorNome(nomeCampeonato).getJogos().size(); i++) {
            System.out.println(bd.getCampeonatoPorNome(nomeCampeonato).getJogos().get(i));
        }
        
        // Set classificação após jogo
        if(bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getPlacarMandante() > 
                bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getPlacarVisitante()){
            
            int indice = bd.getCampeonatoPorNome(nomeCampeonato).getIndiceClassificacao(bd.getEquipePorNome(nomeEquipe1));
            
            System.out.println(bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice));
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).setNumVitorias(
                bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).getNumVitorias() + 1);
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).setNumPontos(
                bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).getNumPontos() + 
                    bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getPlacarMandante());
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).setNumJogos(
                        bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).getNumJogos() + 1);
            
            indice = bd.getCampeonatoPorNome(nomeCampeonato).getIndiceClassificacao(bd.getEquipePorNome(nomeEquipe2));
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).setNumDerrotas(
                bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).getNumDerrotas() + 1);
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).setNumPontos(
                bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).getNumPontos() + 
                    bd.getCampeonatoPorNome(nomeCampeonato).getJogoPorId(0).getPlacarVisitante());
            
            bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).setNumJogos(
                bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao().get(indice).getNumJogos() + 1);          
        }   
        
        System.out.println(bd.getCampeonatoPorNome(nomeCampeonato).getClassificacao());
        
        
        System.out.println();
        // Inserindo um atleta em um time
        bd.getEquipePorNome(nomeEquipe1).getAtletas().add(bd.getAtletaPorNome(nomeAtleta1));
        
        // Listando atletas da equipe "Flamengo"
        System.out.println(bd.getEquipePorNome(nomeEquipe1).getAtletas()); 

        */
    }
}  

