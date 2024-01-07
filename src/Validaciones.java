public class Validaciones {

    /**
     * Método para comprobar que una cadena sólo contiene números entero
     *
     * @param num String sobre el que se realiza la comprobación
     * @return Devuelve un dato booleano (Si está compuesto por números: 'true'. Si no, 'false')
     */
    public static boolean esNum(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para comprobar que una cadena sólo contiene letras (incluye tildes, diéresis y ç)
     *
     * @param texto String sobre el que se realiza la comprobación
     * @return Devuelve un dato booleano (Si está compuesto por letras: 'true'. Si no, 'false')
     */
    static boolean esTexto(String texto) {
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) < 'a' || texto.charAt(i) > 'z') && (texto.charAt(i) < 'á' || texto.charAt(i) > 'ú') && (texto.charAt(i) != 'ü' || texto.charAt(i) != 'ï') && (texto.charAt(i) !='ç')) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para comprobar que una contiene un número de teléfono válido
     *
     * @param telefono String sobre el que se realiza la comprobación
     * @return Devuelve un dato booleano (Si es válido: 'true'. Si no: 'false')
     */
    static boolean esTlf(String telefono) {
        telefono = telefono.replace(" ", "");
        telefono = telefono.replace("-", "");
        telefono = telefono.replace("+", "00");

        if (esNum(telefono)) {
            if (telefono.startsWith("00")) {
                if (telefono.length() != 13) {
                    System.out.println("Número de caracteres incorrecto. Introduce el número de teléfono:");
                    return false;
                } else if (telefono.charAt(4) != '6' && telefono.charAt(4) != '7' && telefono.charAt(4) != '9') {
                    System.out.println("El número de teléfono debe empezar por 6, 7 o 9. Introduce el número de teléfono:");
                    return false;
                }
            } else if (telefono.length() != 9) {
                System.out.println("Número de caracteres incorrecto. Introduce el número de teléfono:");
                return false;

                //EL TELÉFONO DEBE EMPEZAR POR 6, 7 o 9
            } else if (telefono.charAt(0) != '6' && telefono.charAt(0) != '7' && telefono.charAt(0) != '9') {
                System.out.println("El número de teléfono debe empezar por 6, 7 o 9. Introduce el número de teléfono:");
                return false;
            }
        } else {
            System.out.println("El número de teléfono solo puede contener números (0-9). Introduce el número de teléfono:");
            return false;
        }
        return true;
    }

    /**
     * Método para comprobar que una contiene un email válido
     *
     * @param email String sobre el que se realiza la comprobación
     * @return Devuelve un dato booleano (Si es válido: 'true'. Si no: 'false')
     */

    static boolean esMail(String email) {
        email = email.toLowerCase();
        int num_arroba = 0;
        if (email.length() > 8) {
            //COMPROBAR QUE NO EMPIECE POR ARROBA NI PUNTO
            if (email.charAt(0) == '@' || email.charAt(0) == '.') {
                System.out.println("El email no puede empezar por arroba (@) ni por punto (.). Introduce el email:");
                return false;
            } else {
                for (int i = 0; i < email.length(); i++) {

                    //COMPROBAR QUE TENGA CARACTERES ENTRE 0-9, a-z o PUNTO (No se usa la función esTexto porque no puede contener tildes)
                    if ((email.charAt(i) < '0' || email.charAt(i) > '9') && (email.charAt(i) < 'a' || email.charAt(i) > 'z') && (email.charAt(i) != '.')) {

                        //CONTAR EL NÚMERO DE ARROBAS QUE CONTIENE EL EMAIL
                        if (email.charAt(i) == '@') {
                            num_arroba++;
                        } else {
                            System.out.println("El email solo puede contener letras (a-z), números (0-9) y puntos (.). Vuelve a introducir el email:");
                            return false;
                        }
                    }
                }
            }
        } else {
            System.out.println("La dirección de correo electrónico debe contener al menos 8 caracteres.");
            return false;
        }

        //COMPROBAR QUE TENGA UN SOLO ARROBA
        if (num_arroba != 1) {
            System.out.println("El email debe contener un único arroba (@)");
            return false;

            //COMPROBAR QUE EXISTE UN PUNTO DESPUÉS DE ARROBA
        } else if (email.indexOf('@') > email.lastIndexOf('.')) {
            System.out.println("Error. Email no válido. Vuelve a introducir el email:");
            return false;
        } else if (email.lastIndexOf('@') - email.lastIndexOf('.') >= -1) {
            System.out.println("Error. Se debe introducir un dominio después del arroba. Vuelve a introducir el email:");
            return false;
        }

        return true;
    }
}
