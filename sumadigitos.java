package semana3;

public class sumadigitos {

    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        int numero = 5432;
        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
    }
}
