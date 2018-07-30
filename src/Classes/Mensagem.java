/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Mensagem {
    private String mensagem = "";

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String arquivo) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(arquivo+".txt"));
            while (scanner.hasNextLine()) {
            this.mensagem = this.mensagem.concat(scanner.nextLine());
        }
        } catch (FileNotFoundException ex) {
            try{
                PrintStream writer = new PrintStream(new File(arquivo+".txt"));
                writer.print("");  
            }catch(FileNotFoundException e){
            }
            
        }
    }

    public Mensagem(){
        setMensagem("Mensagem 1");
    }
    
    public Mensagem(String arquivo){
        setMensagem(arquivo);
    }
    
    public void cadastraMensagem(String msg, String arquivo){
        PrintStream writer;
        try {
            writer = new PrintStream(new File(arquivo+".txt"));
            writer.print(msg);
            this.mensagem = msg;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String geraMensagem(String cliente){
        if(cliente == null)
            cliente = "";
        cliente = cliente.replaceFirst(Character.toString(cliente.charAt(0)), Character.toString(Character.toUpperCase(cliente.charAt(0))));
        this.mensagem = this.mensagem.replace("cliente", cliente);
        this.mensagem = this.mensagem.replace("saudação", new Horario().momento());
        return this.mensagem;
    }
}
