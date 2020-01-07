package br.edu.ifal.gestao_festa;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Convidados {
    private static final List<Convidado> Lista_Convidados = new ArrayList<>();

    static{
        Lista_Convidados.add(new Convidado("Mayara", 1)); 
        Lista_Convidados.add(new Convidado("Livia", 2));
        Lista_Convidados.add(new Convidado("Aldenise", 3));
        Lista_Convidados.add(new Convidado("Emanuelly",4));
        Lista_Convidados.add(new Convidado("Thiago",5));
       
    }
    public List<Convidado> todos(){
        return Convidados.Lista_Convidados;
    }
    public void adicionar(Convidado convidado){
        Convidados.Lista_Convidados.add(convidado);
    }
    public void excluir(String nome ){
        
        for(int i = 0; i<Lista_Convidados.size(); i++){
            if(Lista_Convidados.get(i).getNome().equals(nome)){
                Lista_Convidados.remove(i);
            }
        }

    }
    


}