package Livros;

public class LivroDigital extends Livro {
    public LivroDigital(String nome, String id, String autor, int ano, String link) {
        super(nome, id, autor, ano);
        this.link = link;
    }

    private String link;

    public String getLink() {
        return link;
    }

  
     
}
