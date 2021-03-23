//Arquivo para exemplpificar a implementação de uma classse

public class Main_2{

  public static void main(String [] args){
    // Operações algébricas com variáveis inteiras
    System.out.println("Declaração de Variáveis.");
		int a;			// declarando uma variável de tipo inteiro
		a = 1;			// inicializando a variável
		// Outros tipos Inteiros
		long b = 1234567L;
		byte c, d = (byte) 8;
		short e = (short) 32124 ;
		System.out.println("Declaração de Variáveis");
		c = 4;
		System.out.println("Variáveis int: " + a + ", " + b + ", " + c);
		System.out.println("Variáveis int: " + d + ", " + e);
		System.out.println("________________________________________");
		//Operadores com int
		System.out.println("Operadores con int");
		System.out.println("________________________________________");
		a = 5; 						// Operador de atribuição
		int a1, a2, a3, a4, a5;
		//atribuições múltiplas em um único comando
		a1 = a2 = a3 = a4 = a5 = a; 
		System.out.println("a = " + a + " a1 = " + a1 + " a2 = " + a2);
		System.out.println("a3 = " + a3 + " a4 = " + a4 + " a5 = " + a5);
		System.out.println("________________________________________");
		//Operadores Aritméticos
		System.out.println("Operadores binarios");
		// Operadores binários
		a = a1 + a2; //adição
		System.out.println(a1 + " + " + a2 + " = " + a);
		a3 = a2 - a4; //substração
		System.out.println(a2 + " - " + a4 + " = " + a3);
		a4 = -a5; // utilizado como operador unario
		System.out.println("-" + a5 + " = " +  a4);
		a2 = a1 * a3; //multiplicação
		System.out.println(a1 + " * " + a3 + " = " + a2);
		a = 4 / 2; //Divisão inteira
		System.out.println("4 / 2 = " + a);
		a = 5 / 2; //Divisão inteira (truncada)
		System.out.println("5 / 2 = " + a);
		a = 5 % 2; //Resto da divisão
		System.out.println("5 % 2 = " + a);
		System.out.println("________________________________________");
		// Operadores de incremento e decremento
		System.out.println("Operadores de Incremento e decremento");
		System.out.println("a = " + a);
		//++a; // a = a + 1
		System.out.println("++a = " + ++a);
		System.out.println("a++ = " + a++);
		System.out.println("a = " + a);
		//--a;
		System.out.println("--a = " + --a);
		System.out.println("a-- = " + a--);
		System.out.println("a = " + a);
		System.out.println("________________________________________");
		//Operadores compostos
		System.out.println("Operadores de Compostos");
		System.out.println("a = " +  a);
		a += 5; //a = a + 5
		System.out.println("a += 5 -> a = " + a);
		System.out.println(a1 + a);
		a -= 3; //a = a - 3
		System.out.println("a -= 3 -> a = " + a);
		a *= 4; //a = a*4
		System.out.println("a *= 4 -> a = " + a);
		a /= 2; //a = a/2
		System.out.println("a /= 2 -> a = " + a);
		a %= 3; //a = a%3
		System.out.println("a %= 3 -> a = " + a);
		System.out.println("________________________________________");
		//Operadores Relacionais
		System.out.println("Operadores de Relacionais");
		System.out.println(a1 + " > " + a2 + " = " + (a1 > a2));
		System.out.println(a2 + " >= " + a3 + " = " + (a2 >= a3));
		System.out.println(a3 + " < " + a4 + " = " + (a3 < a4));
		System.out.println(a4 + " <= " + a5 + " = " + (a4 >= a5));
		System.out.println(a5 + " == " + a1 + " = " + (a5 == a1));
		System.out.println(a5 + " != " + a1 + " = " + (a5 != a1));
		System.out.println("________________________________________");
		System.out.println("Operadores de Lógicos\n");
		boolean v_ = true, f_ = false;
		System.out.println("Tabela da Verdade");
		System.out.println("a \t\t b \t\t a&&b \t a||b \t !a");
		System.out.println(f_ +"\t "+ f_ +"\t"+ (f_&&f_) +"\t"+ (f_||f_) +"\t"+ (!f_));
		System.out.println(f_ +"\t "+ v_ +"\t"+ (f_&&v_) +"\t"+ (f_||v_) +"\t"+ (!f_));
		System.out.println(v_ +"\t "+ v_ +"\t"+ (v_&&v_) +"\t"+ (v_||v_) +"\t"+ (!v_));
		System.out.println(v_ +"\t "+ f_ +"\t"+ (v_&&f_) +"\t"+ (v_||f_) +"\t"+ (!v_));
		System.out.println("________________________________________");
  }

}