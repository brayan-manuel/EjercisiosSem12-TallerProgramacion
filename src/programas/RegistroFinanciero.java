package programas;
public class RegistroFinanciero {
// Clase RegistroFinanciero
  private final double ingresoMensual;
    private final double otrosIngresos;
    private final double gastosMensuales;
    // Constructor
    public RegistroFinanciero(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }
    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    // Método para calcular el ahorro semestral
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }
    // Método para calcular el ahorro anual
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
    // Método para mostrar los resultados
    public void mostrarResultados() {
        System.out.printf("Ahorro mensual: %.2f%n", calcularAhorroMensual());
        System.out.printf("Ahorro semestral: %.2f%n", calcularAhorroSemestral());
        System.out.printf("Ahorro anual: %.2f%n", calcularAhorroAnual());
    }
}
