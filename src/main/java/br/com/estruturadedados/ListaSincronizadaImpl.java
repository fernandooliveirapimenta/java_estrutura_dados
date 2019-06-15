package br.com.estruturadedados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListaSincronizadaImpl {

    public static void main(String[] args) {

        List<Integer> lista = new CopyOnWriteArrayList<>();

        lista.add(5);
        lista.add(6);
        lista.add(7);

        final Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> modoAntigo = Collections.synchronizedList(new ArrayList<>());
        modoAntigo.add(5);
        modoAntigo.add(6);
        modoAntigo.add(7);
        synchronized (modoAntigo) {
            modoAntigo.forEach(System.out::println);
        }
    }
}
