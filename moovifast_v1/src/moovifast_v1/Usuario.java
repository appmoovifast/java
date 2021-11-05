package moovifast_v1;

public class Usuario {
  public String nome;
  public String email;
  public Integer age;
  public String city;
  public String state;
  
  public void showUser () {
	  System.out.println("Informacoes cadastro\nNome: "+this.nome+"\nE-mail: "+this.email);
  }

}
