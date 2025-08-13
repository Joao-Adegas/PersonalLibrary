import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> listBooksDisponiveis = new ArrayList<>();
    private List<Book> listBooksIndisponiveis = new ArrayList<>();
    /*
     * 1 - Cadastrar Livros
     *   - O usuário deverá informar o título, autor e ISBN do livro. O livro começa como disponível e ( não emprestado );
     *   - Emprestar Livros: O usuário poderá emprestar um livro informando seu ISBN. O sistema deverá verificar se o livro ja esta emprestado.
     *
     * 2 - Devolver Livro:
     *   - O usuário pode devolver um livro também informando seu ISBN. O sistema deverá verficar se o livro estava emprestado.
     *
     * 3 - Listar Livros:
     *   - O usuário pode buscar por um livro ou por autor. A busca deve ser parcial e insensivel a maiusculas e minusculas.
     *
     *
     * */

    public void showMenu(){
        System.out.println("Digite oque deseja fazer (1,2,3)\n" +
                "1. Adicionar um livro\n2. Emprestar Livro\n3. Devolver Livro\n4. Listar Livros");

    }

    // Cadastrar Livro
    public void addBook(Book b){
            listBooksDisponiveis.add(b);
            System.out.println("Livro " + b.getTitle() + " Adicionado com sucesso!!");
    }

    // Emprestar Livro
    public void lendBool(Book b){
        if(b.isStatus() == false){
            System.out.println("O livro " + b.getTitle() + " não esta disponível para ser emprestado");
        }
        else if(b.isStatus() == true){
            System.out.println("Livro " + b.getTitle() + " emprestado com sucesso!!");
            b.setStatus(false);
            listBooksDisponiveis.remove(b);
            listBooksIndisponiveis.add(b);
        }
    }

    // Devolvere Livro
    public void returnBook(Book b){
        if(b.isStatus() == false){
            System.out.println("Livro devolvido com sucesso!");
            b.setStatus(true);
        }
        else if(b.isStatus() == true){
            System.out.println("Não é possível devolver o livro por conta que ele ja não estava emprestado!!");
        }
    }

    // Listar Livros
    public String listBooks(){
        return "Livros DIsponiveis:\n" + listBooksDisponiveis;
    }
}
