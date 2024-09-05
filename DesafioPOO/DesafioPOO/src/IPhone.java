

// IPhone.java
public class IPhone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero);
    }

    @Override
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + " com mensagem: " + mensagem);
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url);
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
}