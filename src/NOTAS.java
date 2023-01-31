import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class NOTAS {
    public static void main(String[]argr) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;


      while(true) {
          System.out.print("nome: ");
          nome = scan.next();
          if(nome.equals("0"))break;

          System.out.print("idade: ");
          idade = scan.nextInt();
      }

      System.out.println("Continua aqui...");


    }

}
