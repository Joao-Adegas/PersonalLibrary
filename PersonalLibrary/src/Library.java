import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> listBooksDisponiveis = new ArrayList<>();
    private List<Book> listBooksIndisponiveis = new ArrayList<>();

    Scanner getData = new Scanner(System.in);
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
                "1. Adicionar um livro\n2. Emprestar Livro\n3. Devolver Livro\n4. Listar Livros\n5. Sair\n\n");

    }

    // Cadastrar Livro
    public void addBook(){
            Book b = new Book();

            System.out.println("Digite o titulo do livro:\n");
            String titleBook = getData.nextLine();
            System.out.println("Digite o ISBN do livro:\n");
            String isbn = getData.nextLine();
            System.out.println("Digite o autor do livro:\n");
            String author = getData.nextLine();

            b.setStatus(true);
            b.setTitle(titleBook);
            b.setIsbn(isbn);
            b.setAuthor(author);

            listBooksDisponiveis.add(b);

            System.out.println("Livro " + b.getTitle() + " Adicionado com sucesso!!\n");
    }

    // Emprestar Livro
    public void lendBool(Book b){
        if(b.isStatus() == false){
            System.out.println("O livro " + b.getTitle() + " não esta disponível para ser emprestado\n");
    }
        else if(b.isStatus() == true){
            System.out.println("Livro " + b.getTitle() + " emprestado com sucesso!!\n");
            b.setStatus(false);
            listBooksDisponiveis.remove(b);
            listBooksIndisponiveis.add(b);
        }
    }

    // Devolvere Livro
    public void returnBook(Book b){
        if(b.isStatus() == false){
            System.out.println("Livro devolvido com sucesso!\n");
            b.setStatus(true);
        }
        else if(b.isStatus() == true){
            System.out.println("Não é possível devolver o livro por conta que ele ja não estava emprestado!!\n");
        }
    }

    // Listar Livros
    public String listBooks(){
        return "Livros Disponiveis:\n" + listBooksDisponiveis;
    }
}
