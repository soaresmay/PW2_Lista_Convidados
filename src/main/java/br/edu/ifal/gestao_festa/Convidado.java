package br.edu.ifal.gestao_festa;

import java.util.List;

public class Convidado{
public static final List<Convidado> Lista_Convidados = null;
private String nome;
private Integer quantidadeAcompanhantes;

    public Convidado (){

    }
    public Convidado(String nome, Integer quantidadeAcompanhantes){
        this.nome = nome;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
        
}