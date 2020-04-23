package com.br.teste.ws.imc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author vitcl
 */
@WebService
public class CalculaImc {


    public CalculaImc() {
    }
    
    public String getSexo(@WebParam(name="sexo") String sexo){

        return sexo;
    }
    
    @WebMethod
    public double getImc(@WebParam(name="peso") double peso, @WebParam(name="altura") double altura) {
        
        return (peso / Math.pow(altura, 2));
    }
}
