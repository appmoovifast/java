package moovifast_v1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MooviFast\n");
		Usuario u1 = new Usuario();
		u1.nome = "Adma";
		u1.email = "adma@adma";
		u1.age = 45;
		u1.city = "Belo Horizonte";
		u1.state = "MG";
		
		Rotas r1 = new Rotas();
		r1.pontoIni = "Avenida Altamiro Avelino Soares, 1020";
		r1.pontoFim = "Rua Dos Tupis, 836";
		r1.tipoTransp = "Uber";
		r1.valor = 21.0;
		
		Publico pu1 = new Publico();
		pu1.rotaPontos = "3301B";
		pu1.lotacaoPub = 60;
		
		
		
		Privado pr1 = new Privado();
		pr1.empresa = "Uber";
		pr1.valorKm = 6.0;
		
		
		
		u1.showUser();
		System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXX");
		r1.showRotas();
		System.out.println("\n==========================");
		pu1.showPublico();
		System.out.println("\n++++++++++++++++++++++++++");
		pr1.showPrivado();

	}

}
