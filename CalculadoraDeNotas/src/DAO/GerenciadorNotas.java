
package DAO;

import DTO.Aluno;



public class GerenciadorNotas {
    
    public String verificarSituacao(double media){
            if(media > 7){
                return "Aprovado";
            }else{
                return "Reprovado";
            }
        }


    
    
        
    }

