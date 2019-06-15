package br.com.estruturadedados.comparator;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>, Comparator<Pessoa> {

    private String nome;
    private Integer idade;

    public Pessoa() {

    }
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public int compareTo(Pessoa o) {
        return o.getIdade().compareTo(this.getIdade());
    }

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
