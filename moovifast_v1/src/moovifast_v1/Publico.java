package moovifast_v1;

public class Publico {
	public String rotaPontos;
	public Boolean assessibilidadePub;
	public Integer lotacaoPub;
	
	public void showPublico () {
		System.out.println("Informacoes Transporte Publico\nOnibus: "+this.rotaPontos+"\nLotacao: "+this.lotacaoPub);
	}

}
