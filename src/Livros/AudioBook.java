package Livros;
public class AudioBook extends LivroDigital{


    public AudioBook(String nome, String id, String autor, int ano, String link, double duracao) {
        super(nome, id, autor, ano, link);
        this.duracao = duracao;
    }

    private double duracao;

    public double getDuracao() {
        return duracao;
    }


    
}
