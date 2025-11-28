import java.util.Scanner;

public  class NombreSinVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine();

        System.out.println("⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙ PRIMERA PRUEBA ⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙");
        System.out.print("El nombre sin vocales es: ");
        for(int i=0;i<nombre.length();i++){
            if(nombre.toUpperCase().charAt(i) != 'A'
                    && nombre.toUpperCase().charAt(i) != 'E'
                    && nombre.toUpperCase().charAt(i) != 'I'
                    && nombre.toUpperCase().charAt(i) != 'O'
                    && nombre.toUpperCase().charAt(i) != 'U'
                    && nombre.toUpperCase().charAt(i) != 'Á'
                    && nombre.toUpperCase().charAt(i) != 'É'
                    && nombre.toUpperCase().charAt(i) != 'Í'
                    && nombre.toUpperCase().charAt(i) != 'Ó'
                    && nombre.toUpperCase().charAt(i) != 'Ú') {
                System.out.print(nombre.charAt(i));
            }
        }
        System.out.println();

        System.out.println("⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙ SEGUNDA PRUEBA ⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙");
        String vocales = "aáAeéEiíIoóOuúU";
        String resultado = "";
        for(int i = 0; i < nombre.length(); i++){
            char letra = nombre.charAt(i);
            /**
             * If compara, la primera letra de nombre con las vocales,
             * si no la encuentra devuelve un --1,
             * si devuelve -1 guardamos el valor de la letra en resultado.
             */
            if (vocales.indexOf(letra) == -1 ){
                resultado += letra;
            }
        }
        System.out.println("El nombre sin vocales es:" + resultado);

        System.out.println("⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙ TERCERA PRUEBA ⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙⋙");
        resultado = "";
        for(int i = 0; i < nombre.length(); i++){
            char letra = nombre.charAt(i);
            if (!esVocal(letra)){
                resultado += letra;
            }
        }
        System.out.println("El nombre sin vocales es:" + resultado);
    }

    public static boolean esVocal(char c){
        String vocales = "aáAeéEiíIoóOuúU";
            if (vocales.indexOf(c) == -1){
                return false;
            }else {
                return true;
            }
    }
}