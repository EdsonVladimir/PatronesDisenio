package patterns.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Ingrese Nombre de Usuario: ");
        String userName = reader.readLine();
        System.out.print("Ingrese contraseña: ");
        String password = reader.readLine();

        // Introduce el mensaje.
        System.out.print("Ingrese mensaje: ");
        String message = reader.readLine();


        System.out.println("\nElija la red social para publicar mensajes\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        //Cree el objeto de red adecuado y envíe el mensaje.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
