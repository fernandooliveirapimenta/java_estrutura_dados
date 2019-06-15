package br.com.estruturadedados;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FilaImpl {

    public static void main(String[] args) {

        Queue fila = new ArrayBlockingQueue(5);

        fila.add("A");
        fila.add("C");
        fila.add("D");
        fila.add(80.0);
//        fila.add(null);

        for(int i = 0; i<5; i++){

            System.out.println(fila.poll());
        }
    }
}
