package main.java.list.PesquisaList.CatalogoLivros;

import main.java.list.OperacoesBasicasList.ListaTarefas.ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDeLivros;


    public CatalogoLivros() {
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Método para pesquisar livros por autor e retornar uma lista de livros
    public List<Livro> pesquisarPorAutor(String autor){
        // Criando lista para armazenar livros do autor
        List<Livro> livrosDoAutor = new ArrayList<>();

        // Verificando se a lista NÃO está vazia para começar o código
        if(!listaDeLivros.isEmpty()){
            for(Livro livro : listaDeLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    // Método para pesquisar livros por ano de publiação
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        // Criando lista para armazenar livros do autor
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();

        // Verificando se a lista NÃO está vazia para começar o código
        if(!listaDeLivros.isEmpty()){
            for (Livro livro : listaDeLivros){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao()<=anoFinal){
                    livrosPorIntervaloDeAno.add(livro);
                }
            }
        }

        // Retornando lista de livros filtrada
        return livrosPorIntervaloDeAno;
    }

    // Método para pesquisar o 1º livro encontrado pelo título
    public Livro pesquisarPorTitulo(String titulo){
        // Declarando variável para armazenar livro encontrado
        Livro livroEncontrado = null;

        // Verificando se lista de livros não está vazia
        if(!listaDeLivros.isEmpty()){
            // Criando laço para varrer lista de livros
            for(Livro livro : listaDeLivros){
                // Se o titulo do livro atual no laço for igual ao pesquisado, adiciona
                // à variável livroEncontrado e encerra o programa
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = livro;
                    break;
                }
            }
        }

        // Retornando livro encontrado
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Harry Potter 1", "JK", 1990);
        catalogoLivros.adicionarLivro("Harry Potter 2", "JK", 1995);
        catalogoLivros.adicionarLivro("Sherlock 1", "Doyle", 1980);
        catalogoLivros.adicionarLivro("Sherlock 1", "Doyle", 1987);

        System.out.println(catalogoLivros.pesquisarPorAutor("Doyle"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1980, 1984));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Sherlock 1"));


    }

}
