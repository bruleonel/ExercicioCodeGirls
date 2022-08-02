package com.github.bruleonel.gatos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListaGatos {

    public static void main(String[] args) {

        // Criando uma lista de gatos com Java Collections

        List<Gato> meusGatos =new ArrayList<>(){{
            add(new Gato("Joh","18","preto"));
            add(new Gato("Simba","6","tigrado"));
            add(new Gato("Joh","12","amarelo"));
        }};

        System.out.println(meusGatos);

        //As listas sempre serão impressas por ordem de inserção

        //Para imprimir em ordem aleatória
        System.out.println(" ");
        System.out.println("Ordem Aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println(" ");
        System.out.println("Ordem Natural por Nome");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println(" ");
        System.out.println("Ordem Natural por Idade");
        Collections.sort(meusGatos, new Idade());
        //Comparação
        System.out.println(meusGatos);


        System.out.println(" ");
        System.out.println("Ordem Natural por Nome, cor e idade");
        Collections.sort(meusGatos, new NomeCorIdade());
        //ou meusGatos.sort(new NomeCorIdade();
        //Comparação
        System.out.println(meusGatos);



    }



}
