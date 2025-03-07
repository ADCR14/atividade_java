
// import java.util.Scanner;

// public class Exercicio {

// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner (System.in);
		
// 		System.out.print("digite um numero: ");
// 		int numero = scanner.nextInt();

// 		if(numero > 100) {
// 			System.out.println("O numero e maior que 100");
// 		} else {
// 			System.out.println("O numero nao e maior que 100");
// 		}

// 		scanner.close();
		
// 	}
// }	

import java.util.Scanner; 

	public class Exercicio {

		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);

			System.out.print("Digite um numero: ");
			int numero = scanner.nextInt();

			if (numero % 5 == 0){
				System.out.println(numero + " e multiplo de 5.");
			} else {
			 	System.out.println(numero + "nao e multiplo de 5.");
			}
			scanner.close();
	}
}



/**
	import java.util.Scanner;

public class VerificaLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (Character.isLetter(caractere)) {
            System.out.println(caractere + " é uma letra do alfabeto.");
        } else {
            System.out.println(caractere + " não é uma letra do alfabeto.");
        }

        scanner.close();
    }
}
 */