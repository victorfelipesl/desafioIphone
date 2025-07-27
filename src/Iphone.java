public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Shape of You");
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }

    public void tocar() { System.out.println("Tocando música");
        System.out.println("\n");}

    public void pausar() { System.out.println("Música pausada");System.out.println("\n"); }

    public void selecionarMusica(String musica) { System.out.println("\n"); }

    public void ligar(String numero) { System.out.println("Ligando para " + numero);System.out.println("\n"); }
    public void atender() { System.out.println("Atendendo ligação"); System.out.println("\n"); }
    public void iniciarCorreioVoz() { System.out.println("Iniciando correio de voz");System.out.println("\n"); }

    public void exibirPagina(String url) { System.out.println("Exibindo: " + url);System.out.println("\n"); }
    public void adicionarNovaAba() { System.out.println("Nova aba aberta"); System.out.println("\n");}
    public void atualizarPagina() { System.out.println("Página atualizada");System.out.println("\n"); }
}
