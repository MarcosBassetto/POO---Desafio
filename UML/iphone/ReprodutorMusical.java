package UML.iphone;

public interface ReprodutorMusical {

    String musica = null;
    String artista = null;

    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);

}
