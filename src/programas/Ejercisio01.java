package programas;
import java.util.Scanner;
public class Ejercisio01 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar ingreso mensual, otros ingresos y gastos mensuales al usuario
        System.out.print("Ingrese el ingreso mensual: ");
        double ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        double otrosIngresos = lectura.nextDouble();
        System.out.print("Ingrese los gastos mensuales: ");
        double gastosMensuales = lectura.nextDouble();

        // RegistroFinanciero
        RegistroFinanciero registroFinanciero = new RegistroFinanciero(ingresoMensual, otrosIngresos, gastosMensuales);
        
        // Mostrar Resultados
        registroFinanciero.mostrarResultados();


    }
}

