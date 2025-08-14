import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner getData = new Scanner(System.in);

        System.out.println("=============== Bem-vindo(a) Biblioteca Pessoal ===================\n");


        int option = 0;
        do{
            library.showMenu();
            try {
                option = getData.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Erro: Você deve digitar um numero de 1 a 5!!\n");
                break;
            }

            switch (option){
                case 1:
                    System.out.printf("Voce digitou " + option + ":\n");
                    library.addBook();
                break;
            }

        }while(option != 5);

        System.out.println("============ Até mais =============");





    }

}
