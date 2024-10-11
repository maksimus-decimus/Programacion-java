import java.util.Scanner;

public class SeleccioArea {
	public static void main (String[] args) {
		Scanner	teclado = new Scanner(System.in);

		System.out.println("\nDe las siguientes figuras...¿De cuál desea calcular el área?:");
		System.out.println("Escriba el número de la figura:");
		System.out.println("\n1.Triángulo\n2.Trapecio\n3.Círculo\n4.Rombo\n5.Paralelogramo\n");
		
		//No he encontrado una manera de poner el texto, así que utilizaré un int para que el scanner lo entienda

		int respuesta = teclado.nextInt();

		if (respuesta == 1) {
			System.out.println("Introduce la base del triangulo");
			double btriangulo = teclado.nextDouble();

			System.out.println("Introduce la altura del triangulo");
			double htriangulo = teclado.nextDouble();

			double areatriangulo = (btriangulo * htriangulo) / 2;

			System.out.println("El área del triangulo es: " + areatriangulo);


		} else if (respuesta == 2) {
			System.out.println("Introduzca la base mayor del trapecio:");
			double bmayortrapecio = teclado.nextDouble();

			System.out.println("Introduzca la base menor del trapecio:");
			double bmenortrapecio = teclado.nextDouble();

			System.out.println("Introduzca la altura del trapecio:");
			double alturatrapecio = teclado.nextDouble();

			double areatrapecio = ((bmayortrapecio + bmenortrapecio) * alturatrapecio) / 2;
			System.out.println("El área del trapecio es: " + areatrapecio);

		} else if (respuesta == 3) {
			System.out.println("Introduzca el radio del círculo:");
			double radio = teclado.nextDouble();
			double areacirculo = (3.1416) * (radio*radio);

			System.out.println("El área del círculo es: " + areacirculo);

		}



	}
}

