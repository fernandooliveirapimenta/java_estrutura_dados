package br.com.estruturadedados.comparator;

import java.util.*;

public class ComparadorImpl {

    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("f", 23));
        lista.add(new Pessoa("a", 5));
        lista.add(new Pessoa("c", 52));
        lista.add(new Pessoa("k", 3));


        System.out.println("");
        Collections.sort(lista);
        lista.forEach(System.err::println);

        System.out.println("");
//        Collections.sort(lista, new Pessoa());
        lista.sort(new Pessoa());
        lista.forEach(System.err::println);

        Set<Pessoa> listaOrdenada = new TreeSet<>();
       listaOrdenada.add(new Pessoa("f", 23));
       listaOrdenada.add(new Pessoa("a", 5));
       listaOrdenada.add(new Pessoa("c", 52));
       listaOrdenada.add(new Pessoa("k", 3));
        listaOrdenada.add(new Pessoa("k", 3));

        System.out.println("");
       listaOrdenada.forEach(System.err::println);

    }
}
