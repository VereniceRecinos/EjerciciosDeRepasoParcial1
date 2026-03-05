package ejercicios;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		
		
		int opcion;
		
		do {
			
			System.out.println("\n===== MENU DE EJERCICIOS =====");
            System.out.println("1. Suma de números divisibles entre 4");
            System.out.println("2. Factorial de un número");
            System.out.println("3. Contar positivos, negativos y ceros");
            System.out.println("4. Promedio de números pares entre 1 y n");
            System.out.println("5. Suma de los dígitos de un número");
            System.out.println("6. Verificar múltiplo de 7 o 11");
            System.out.println("7. Números divisibles entre 3 pero no entre 2");
            System.out.println("8. Determinar momento del día por hora");
            System.out.println("9. Convertir número a romano (switch)");
            System.out.println("10. Calculadora con switch");
            System.out.println("11. Mayor, menor y diferencia");
            System.out.println("12. Tabla de división");
            System.out.println("13. Cantidad de dígitos pares");
            System.out.println("14. Determinar número triangular");
            System.out.println("15. Promedio de números negativos");
            System.out.println("16. Primeros n múltiplos de 6");
            System.out.println("17. Determinar si es potencia de 2");
            System.out.println("18. Número invertido");
            System.out.println("19. Suma de 1..n es par o impar");
            System.out.println("20. Convertir Celsius a Fahrenheit");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
            
            case 1: sumaDivisibles4(); break;
            case 2: factorial(); break;
            case 3: contarNumeros(); break;
            case 4: promedioPares(); break;
            case 5: sumaDigitos(); break;
            case 6: multiplo7o11(); break;
            case 7: divisibles3No2(); break;
            case 8: horaDia(); break;
            case 9: numeroRomano(); break;
            case 10: calculadora(); break;
            case 11: mayorMenor(); break;
            case 12: tablaDivision(); break;
            case 13: digitosPares(); break;
            case 14: numeroTriangular(); break;
            case 15: promedioNegativos(); break;
            case 16: multiplos6(); break;
            case 17: potencia2(); break;
            case 18: numeroInvertido(); break;
            case 19: sumaParImpar(); break;
            case 20: celsiusFahrenheit(); break;

            case 0:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción inválida.");
            }
		}  while (opcion != 0);
	}

	public static void sumaDivisibles4() {
		// TODO Auto-generated method stub
		
	}

	public static void factorial() {
		// TODO Auto-generated method stub
		
	}

	public static void contarNumeros() {
		// TODO Auto-generated method stub
		
	}

	public static void promedioPares() {
		// TODO Auto-generated method stub
		
	}

	public static void sumaDigitos() {
		// TODO Auto-generated method stub
		
	}

	public static void multiplo7o11() {
		// TODO Auto-generated method stub
		
	}

	public static void divisibles3No2() {
		// TODO Auto-generated method stub
		
	}

	public static void horaDia() {
		// TODO Auto-generated method stub
		
	}

	public static void numeroRomano() {
		// TODO Auto-generated method stub
		
	}

	public static void calculadora() {
		// TODO Auto-generated method stub
		
	}

	public static void mayorMenor() {
		// TODO Auto-generated method stub
		
	}

	public static void tablaDivision() {
		// TODO Auto-generated method stub
		
	}

	public static void digitosPares() {
		// TODO Auto-generated method stub
		
	}

	public static void numeroTriangular() {
		// TODO Auto-generated method stub
		
	}

	public static void promedioNegativos() {
		// TODO Auto-generated method stub
		
	}

	public static void multiplos6() {
		// TODO Auto-generated method stub
		
	}

	public static void potencia2() {
		// TODO Auto-generated method stub
		
	}

	public static void numeroInvertido() {
		// TODO Auto-generated method stub
		
	}

	public static void sumaParImpar() {
		// TODO Auto-generated method stub
		
	}

	public static void celsiusFahrenheit() {
		// TODO Auto-generated method stub
		
	}

}
