package com.github.bruleonel.gatos;

public class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, String idade, String cor) {
        this.nome = nome;
        this.idade = Integer.valueOf(idade);
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    @Override
    public String toString() {
        return "\nGATO: " +
                nome  + "," +
                " IDADE: " + idade + "," +
                " COR: " + cor + ".";

    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    //A Interface compareTo retorna um Integer o qual será organizado por ordem
    //Como a comparação é de uma String devemos utilizar o IgnoreCase

}