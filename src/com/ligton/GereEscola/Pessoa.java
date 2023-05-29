package com.ligton.GereEscola;

public class Pessoa {
    protected String nome, nacionalidade, naturalidade;

    public Pessoa(String nome, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }

    public String toString() {
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode())
                + "\n\t- Nome: " + nome + "\n\t- Naturalidade: " + naturalidade;
    }
}