import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones {
	/*
	 * 3. Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un
            bucle, pida cinco valores por teclado y los introduzca en el vector. Tendrás que manejar la/las
            posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
	 * 
	 */
	
		public static void main(String[] args) {
			Scanner reader= new Scanner (System.in);
			
            int a;
            int b;
            int div;
            
			try {
					System.out.println("Escribe un valor entero");
					a = reader.nextInt();
					
					System.out.println("Escribe otro valor entero");
					b = reader.nextInt();
					
					div= a/b;
					
					System.out.println("La división es: "+div);
				}
			//Aquí ponemos el InputMismatchException para los errores de tipos.
				catch (InputMismatchException excepto) {
					System.out.println("Valor introducido incorrecto");
					// printStackTrace es para mostrar la traza de manera controlada.
					//excepto.printStackTrace();
				}
				catch (ArithmeticException excepto) {
					System.out.println("Error de división por cero");
					// printStackTrace es para mostrar la traza de manera controlada.
					//excepto.printStackTrace();
				}
			
				System.out.println("Fin del programa");
			
	        
				reader.close();
				//Comentario añadido en GitHub
			//Comentario añadido en GitHub
		}
}
