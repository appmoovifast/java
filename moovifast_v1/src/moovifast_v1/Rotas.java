package moovifast_v1;

import java.util.Date;

public class Rotas {
	  public String pontoIni;
	  public String pontoFim;
	  public Boolean assessibilidade;
	  public String tipoTransp;
	  public double valor;
	  public Integer lotacao;
	  public String placa;
	  public Date dataRota;
	  public Boolean rotaPref;
	  
	  
	public void showRotas() {
		
		System.out.println("Informacoes Rota\nPonto inicial: "+this.pontoIni+"\nPonto Final: "+(String) this.pontoFim+"\nTipo Transporte: "+this.tipoTransp+"\nValor: "+this.valor);
	}
	
}
