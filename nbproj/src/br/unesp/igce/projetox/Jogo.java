/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.projetox;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Jogo {
    private String titulo;
    private String ano;
    
    Jogo (String titulo){
        this.titulo = titulo;
        this.ano = "";
    }
    
    public static void main(String []args){
        Jogo x = new Jogo("Tomb Raider");
    }
}

