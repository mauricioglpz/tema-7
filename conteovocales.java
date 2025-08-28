package semana3;

public class conteovocales {

    public static int contarVocales(String texto) {
        // Caso base: cadena vacía
        if (texto.isEmpty()) {
            return 0;
        } else {
            // Tomo el primer caracter en minúscula
            char c = Character.toLowerCase(texto.charAt(0));
            // Verifico si es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return 1 + contarVocales(texto.substring(1));
            } else {
                return contarVocales(texto.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        int totalVocales = contarVocales(cadena);
        System.out.println("La cadena \"" + cadena + "\" tiene " + totalVocales + " vocales.");
    }
}

