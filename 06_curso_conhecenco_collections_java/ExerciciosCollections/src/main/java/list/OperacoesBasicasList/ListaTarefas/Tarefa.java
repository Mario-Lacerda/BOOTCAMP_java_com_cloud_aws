package main.java.list.OperacoesBasicasList.ListaTarefas;

public class Tarefa {
    // Atributo
    private String descricao;

    // Método construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Get para pegar descrição
    public String getDescricao() {
        return descricao;
    }

    @Override
    // Método quando essa classe for chamada na forma de string
    public String toString() {
        return descricao;
    }
}
