package br.com.apisnativas.annotation;

public class Teste {

    public static void main(String[] args) {
       Class<Postagem> p = Postagem.class;
        final Meme annotation = p.getAnnotation(Meme.class);
        System.out.println(annotation.nome());

        Class<Msn> msn = Msn.class;
        System.out.println(msn.getAnnotation(Meme.class).nome());
    }
}
