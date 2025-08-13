import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner getData = new Scanner(System.in);

        System.out.println("=============== Bem-vindo(a) Biblioteca Pessoal ===================");
        library.showMenu();
        /*
        * try {
            int option = getData.nextInt();
        }catch (Exception){

        }

        * */


    }

}
