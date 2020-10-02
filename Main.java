import java.util.Scanner;
/**
 * while loops
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Beginning to count!");
  int count = 1; 
  while (count <= 5){
    System.out.println(count);
    //count = count + 1;
  }
  System.out.println("That's all for now");

  }
}
