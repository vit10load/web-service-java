/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.teste.ws.imc;

import javax.xml.ws.Endpoint;

/**
 *
 * @author vitcl
 */
public class Servidor {
    
    public static void main(String[] args) {
        
        CalculaImc c = new CalculaImc();
        Endpoint.publish("http://localhost:8080/calculaimc", c);
        System.out.println("Rodando em: http://localhost:8080/calculaimc");
        
    }
    
}
