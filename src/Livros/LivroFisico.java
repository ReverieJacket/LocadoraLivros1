package Livros;

public class LivroFisico extends Livro {
    public LivroFisico(String nome, String id, String autor, int ano, int edicao, int totalDePag, String isbn) {
        super(nome, id, autor, ano);
        this.isbn = isbn;
        this.totalDePag = totalDePag;
        this.edicao = edicao;
    }
    private int totalDePag;
    public int getTotalDePag() {
        return totalDePag;
    }
    
    public int getEdicao() {
        return edicao;
    }
   
    public String getIsbn() {
        return isbn;
    }
   
    private int edicao;
    private String isbn;
}
