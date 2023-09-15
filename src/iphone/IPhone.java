package iphone;

public class IPhone extends MusicPlayer implements Browser, Chamadas {
	boolean energia = false;
	
	public void ligar() {
		energia = true;
		System.out.println("Ligado!");
	}
	
	public void desligar() {
		energia = false;
		System.out.println("Desligado!");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando outra aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void realizarChamada(String contato) {
		System.out.printf("Chamando %s...\n", contato);
	}

	@Override
	public void atenderChamada() {
		System.out.println("Chamada atendida!");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz iniciado");
	}
	
	public static void main(String[] args) {
		IPhone iphone12 = new IPhone();
		
		iphone12.ligar();
		
		iphone12.selecionarMusica("Time Back - Bad Style");
		iphone12.tocar();
		iphone12.pausar();
		
		iphone12.atenderChamada();
		iphone12.iniciarCorreioDeVoz();
		iphone12.realizarChamada("Iglá");
		
		iphone12.exibirPagina();
		iphone12.adicionarNovaAba();
		iphone12.atualizarPagina();
	}
}
