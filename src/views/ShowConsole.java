package views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
        inputCode();
    }

    public void showBanner(){
        System.out.println(" *** Metodos de Busqueda ***");
    }
    public int inputCode(){
        System.out.println("Ingrese un codigo");
        int code = scanner.nextInt();
        return code;
    }
    

    
}
