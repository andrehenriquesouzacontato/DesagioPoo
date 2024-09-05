// App.java
public class App {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.fazerChamada("1234567890");
        iphone.receberChamada("9876543210");
        iphone.enviarSMS("1234567890", "Olá, tudo bem?");
        iphone.navegar("https://www.google.com");
        iphone.tocarMusica("Uma música qualquer");
    }
}