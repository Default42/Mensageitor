/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;
/**
 *
 * @author Thiago
 */
public class GeraMensagem {
      //Objeto hora
        Horario hora = new Horario();
        
        TelaMensageitor tela = new TelaMensageitor();
        //Objeto gera numero randomico
        Random ale = new Random();
        
        //Variaveis para seleção de mensagens aleatorias 
        int na1 = ale.nextInt(3) + 1;
        int na2 = ale.nextInt(3) + 1;  
        int na3 = ale.nextInt(2) + 1;  
        

    /**
     * metodo que retorna a mensagem de ocupado
     * @return 
     */
    public String msgOcupado(String cliente){

        String combMensagemOcupado = "";
        
        //Mensagens de ocupado pre definidas
        String msgMO1 = ", no momento estou em atendimento";
        String msgMO2 = ", não posso te atender no momento";
        String msgMO3 = ", estou em um atendimento agora";
        String msgFO1 = ", me fale sua solicitação que vou te colocar na fila e assim que possivel entraremos em contato ok? ";
        String msgFO2 = ", mas me fale sua solicitação que vou te colocar na fila e um tecnico vai entrar em contato o mais rapido possivel.";
        String msgFO3 = ", mas me fale sua solicitação que vou te colocar na fila de espera e um tecnico vai entrar em contato o mais rapido possivel.";
        
        //Selecionando parte central da mensagem
        switch(na1){
            case 1:
                combMensagemOcupado = msgMO1;
                break;
            case 2:
                combMensagemOcupado = msgMO2;
                break;
            case 3:
                combMensagemOcupado = msgMO3;
        }
        
        //Selecionando parte final da mensagem
        switch(na2) {
            case 1:
                combMensagemOcupado += msgFO1;
                break;
            case 2:
                combMensagemOcupado += msgFO2;
                break;
            case 3: 
                combMensagemOcupado += msgFO3;
                break;
        }
        String mensagemOcupado = String.format( "%s%s%s", hora.momento() , cliente, combMensagemOcupado);
        return mensagemOcupado;
    }
    
    public String msgDisponivel(String cliente){
        String msgD1 = ", Como posso ajudar?";
        String mensagemDisponivel = String.format( "%s%s%s", hora.momento() , cliente, msgD1);
            return mensagemDisponivel;
        
    }
    
    public String msgConexao(String cliente){
        
        //Mensagens pré definidas
        String msgC1 = ", pode me passar seu ammy ou anydesk ?";
        String msgC2 = ", me passa seu ammy ou anydesk por favor";
        
        String combMensagemConexao = "";
        
        switch(na3){
            case 1:
                combMensagemConexao = msgC1;
                break;
            case 2:
                combMensagemConexao = msgC2;
                break;
        }
        String mensagemConexao = String.format( "%s%s", cliente, combMensagemConexao);     
            return mensagemConexao;
    }

}
