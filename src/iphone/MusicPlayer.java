package iphone;

public class MusicPlayer {
	private String musicName;
	
	public void tocar() {
		System.out.printf("Tocando %s\n", musicName);
	}
	
	public void pausar() {
		System.out.printf("Música %s pausada\n", musicName);
	}
	
	public void selecionarMusica(String musicName) {
		this.musicName = musicName;
		System.out.printf("Musica %s selecionada!\n", musicName);
	}
}
