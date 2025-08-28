package semana3;
public class inversion {

    public static String invertir(String palabra) {
        
        if (palabra.length() <= 1) {
            return palabra;
        } else {
           
            return invertir(palabra.substring(1)) + palabra.charAt(0);
        }
    }

    public static void main(String[] args) {
        String palabra = "hola";
        String resultado = invertir(palabra);
        System.out.println("la palabra invertida de '" + palabra + "' es: " + resultado);
    }
}

