package br.com.estruturadedados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorImpl {

    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add("Felipe");
        vector.add(88.8);
        vector.add(new ArrayList<>());

        Iterator iterator = vector.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
