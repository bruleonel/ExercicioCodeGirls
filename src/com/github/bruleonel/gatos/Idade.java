package com.github.bruleonel.gatos;

import java.util.Comparator;

public class Idade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}
