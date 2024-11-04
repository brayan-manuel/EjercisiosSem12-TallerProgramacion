package programas;
import java.util.Scanner;
public class Ejercisio02 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Compras al usuario
        System.out.print("Ingrese la compra 1: ");
        double compra1 = lectura.nextDouble();
        System.out.print("Ingrese la compra 2: ");
        double compra2 = lectura.nextDouble();
        System.out.print("Ingrese la compra 3: ");
        double compra3 = lectura.nextDouble();
        System.out.print("Ingrese la compra 4: ");
        double compra4 = lectura.nextDouble();

        // RegistroCompras
        RegistroCompras registroCompras = new RegistroCompras(compra1, compra2, compra3, compra4);
        
        // Resultados
        registroCompras.mostrarResultados();

    }
}

