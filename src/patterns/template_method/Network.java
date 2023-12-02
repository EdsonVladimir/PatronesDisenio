package patterns.template_method;

public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * Clase base de red social.
     */
    public boolean post(String message) {
        // Autenticar antes de publicar. Cada red utiliza un diferente
        // método de autentificación.
        if (logIn(this.userName, this.password)) {
            //Envía los datos de la publicación.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
