import java.time.LocalDate;

public class Livro {

    public String titulo;
    public Autor autor;
    public float preco;
    public LocalDate dataLancamento;

    public void cadastrarLivro(Livro livro){
        if (livro <= 2018){
            return;
        }

    }
}
