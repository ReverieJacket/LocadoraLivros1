package Livros;

public abstract class Livro {

    public Livro(String nome, String id, String autor, int ano){
        this.nome = nome;
        this.id = id;
        this.autor = autor;
        this.ano = ano;
    }
    private String nome;
    private String id;
    private String autor;
    private int ano;

    public String getNome() {
        return nome;
    }
  
    public String getId() {
        return id;
    }
   
    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
 
    


    
}
