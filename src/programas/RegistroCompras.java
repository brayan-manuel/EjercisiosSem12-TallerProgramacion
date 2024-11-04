package programas;
public class RegistroCompras {
    // Clase RegistroCompras
    private final double compra1;
    private final double compra2;
    private final double compra3;
    private final double compra4;
    // Constructor
    public RegistroCompras(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }    // Calcular el total de compras
    public double calcularTotal() {
        return compra1 + compra2 + compra3 + compra4;
    }    // calcular el promedio de compras
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }    //Compra mayor
    public double encontrarCompraMayor() {
        double mayor = compra1;
        if (compra2 > mayor) mayor = compra2;
        if (compra3 > mayor) mayor = compra3;
        if (compra4 > mayor) mayor = compra4;
        return mayor;
    }    // Compra menor
    public double encontrarCompraMenor() {
        double menor = compra1;
        if (compra2 < menor) menor = compra2;
        if (compra3 < menor) menor = compra3;
        if (compra4 < menor) menor = compra4;
        return menor;
    }    // Resultados
    public void mostrarResultados() {
        System.out.printf("Total de compras: %.2f%n", calcularTotal());
        System.out.printf("Promedio de compras: %.2f%n", calcularPromedio());
        System.out.printf("Compra mayor: %.2f%n", encontrarCompraMayor());
        System.out.printf("Compra menor: %.2f%n", encontrarCompraMenor());
    }
}

