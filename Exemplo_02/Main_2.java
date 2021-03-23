//Arquivo para exemplpificar a implementação de uma classse

import java.util.Scanner;

public class Main_2{

  public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Hello World!");    //output
		System.out.print("Whats your name?");
		name = scanner.nextLine();
    System.out.println("Hi " + name + ", good to see you here!!!");
		scanner.close();
  }

}
