/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Mexame_paciente;
import controller.Cexame;
import controller.Cexame;
import controller.Cmedico;
import controller.Cmedico;
import controller.Cpaciente;
import controller.Cpaciente;
import model.*;

/**
 *
 * @author 631210019
 */
public class Teste {

    
    public static void main(String args[]){
        
        //Cadastro de médico
        Cmedico cmed = new Cmedico();
        Mmedico mmed = new Mmedico();
        
        mmed.setNome("Nelson Jucabala");
        mmed.setCrm("12341234");
        mmed.setCidade("POA");
        mmed.setEndereco("Rua tal de tal,234");
        mmed.setTelefone("51 1234.1234");
        mmed.setEmail("nelson@medico.com");
        mmed.setUf("RS");
        
        cmed.insert(mmed);
        
        //Cadastro de paciente
        Cpaciente cpac = new Cpaciente();
        Mpaciente mpac = new Mpaciente();
        
        mpac.setNome("Fulano de teste");
        mpac.setAltura(100.80);
        mpac.setCidade("POA");
        mpac.setCpf("321654987");
        mpac.setDtNascimento("10/10/2010");
        mpac.setEndereco("Rua qualquer, 2134320");
        mpac.setPeso(80);
        mpac.setUf("RS");
               
        cpac.insert(mpac);
         
        //Cadastro do exame
        Cexame cex = new Cexame();
        Mexame mex = new Mexame();
        
        mex.setDescExame("exame de sangue");
        mex.setValorUnit(234.234);
        
        cex.insert(mex);
        
        //Cadastro de exame X paciente
        Cexame_paciente cep = new Cexame_paciente();
        Mexame_paciente mep = new Mexame_paciente();
        
        mep.setDtexame("12/12/2012");  
        mep.setExame(mex);
        mep.setMedico(mmed);
        mep.setPaciente(mpac);
        mep.setQtdexame(1);
        mep.setValorexame(250.00);
        
        
        
        
        
        
     
    }
    
}
