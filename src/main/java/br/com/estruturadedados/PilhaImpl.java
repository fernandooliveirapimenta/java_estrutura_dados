package br.com.estruturadedados;

import java.util.Random;
import java.util.Stack;

public class PilhaImpl {

    public static void main(String[] args) {
        Stack pilha = new Stack();

        Random random = new Random();

        int limite = random.nextInt(20) * 2;

        while (limite > 0) {
            System.out.println(pilha.push(limite));
            limite --;
        }

        System.out.println("");
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
