package iPhone;

import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;
import internet.NavegadorInternet;

public class iPhone implements  ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	// Reprodutor musical
	public void tocar() {
		System.out.println("Reproduzindo música");
	}
	public void pausar() {
		System.out.println("Música pausada");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: "+ musica);
	}
	
	// Aparelho telefonico
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	public void atender() {
		System.out.println("Atendendo chamada");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
	// Navegador de internet
	public void exibirPagina(String url){
		System.out.println("Exibindo página: " + url);
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando a página");
	}
	
	public static void main(String[] args) {
		iPhone meuIphone = new iPhone();
		
		// Reprodutor musical
		meuIphone.tocar();
		meuIphone.pausar();
		meuIphone.selecionarMusica("Supernatural - Ariana Grande");
		
		// Aparelho telefonico
		meuIphone.ligar("(11)93406-5774");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		// Navegador de internet
		meuIphone.exibirPagina("web.dio.me");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
	}
}
