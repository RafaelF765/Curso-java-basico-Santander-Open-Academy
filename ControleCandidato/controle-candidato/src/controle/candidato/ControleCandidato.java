/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controle.candidato;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rafaelf
 */
public class ControleCandidato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] candidatos = {"Ana Clara", "João Pedro", "Carlos Eduardo", "Luiza Fernanda", "Ricardo Almeida"};
         for(String candidato : candidatos){
             entrandoEmContato(candidato);
         }
        
    }
    
    
    static boolean atender(){
        
        return new Random().nextInt(3)==1;
        
    }
    
    static void selecionarCandidatos(){
          String[] candidatos = {"Ana Clara", "João Pedro", "Carlos Eduardo", "Luiza Fernanda", "Ricardo Almeida", "Sofia Martins", "Gabriel Costa", "Isabela Freitas", "Marcelo Junior", "Fernanda Lima"};
          ArrayList <String> selecionados = new ArrayList();
          int candidatosSelecionados = 0;
          int candidatoAtual = 0;
          double salarioBase = 2000;
          
          while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
              String candidato = candidatos[candidatoAtual];
              double salarioPretendido = valorPretendido();
              System.out.printf("O candidato %s solicitou %.2f\n", candidato, salarioPretendido);
              if (salarioBase >= salarioPretendido) {
                  System.out.printf("O candidato %s foi selecionado para a vaga\n",candidato);
                  selecionados.add(candidato);
                  candidatosSelecionados ++;
              }
              candidatoAtual ++;
          }
          System.out.println("Candidatos Selecionados");
          for (int indice = 0; indice < selecionados.size(); indice ++) {
              
              System.out.println("candidato Nº"+(indice+1)+" "+selecionados.get(indice));
        }
    }
    
    

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR PELO PROXIMO CANDIDATO");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {            
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
            
        } while (continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + "NA" + tentativasRealizadas +"ª tentativa.");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + "NO MAXÍMO DE TENTATIVAS" + tentativasRealizadas +"REALIZADAS.");
        }
    }
    
}
