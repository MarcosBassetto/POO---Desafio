package UML.iphone;
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBIDO A PÁGINA "+url+" NO NAVEGADOR ");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("EXIBINDO UMA NOVA ABA AO NAVEGADOR");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZAR A PÁGINA DO NAVEGADOR");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NÚMERO "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("aTENDENDO LIGAÇÃO");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		
	}

}
