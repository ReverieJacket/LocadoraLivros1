package Livros;
public class EBook extends LivroDigital {

   

    public EBook(String nome, String id, String autor, int ano, String link, int totalDePag) {
        super(nome, id, autor, ano, link);
        this.totalDePag = totalDePag;
    }

    private int totalDePag;

    public int getTotalDePag() {
        return totalDePag;
    }

    

    
}
