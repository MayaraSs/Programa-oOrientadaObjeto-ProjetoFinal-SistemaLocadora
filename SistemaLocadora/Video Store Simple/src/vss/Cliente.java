package vss;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Cliente implements Comparable<Cliente>, Serializable { /*serializa��o ela vai armazenar o arquivo*/
	
	private static final long serialVersionUID = 1L;
	public static int ID = 0;
	private int idCliente;
	private int idade;
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	private String sexo;
	private String cpf;
	private List<Locacao> listaLocacoes = new ArrayList<Locacao>();/*informa��o sobre a posi��o do elemento em rela��o aos demais membros do grup*/
	
	public Cliente(){
	}
	
	public Cliente(String nome,int idade,String endereco,String email, String telefone, String sexo, String cpf){
		this.setIdCliente();
		this.setNome(nome);
		this.setIdade(idade);
		this.setEmail(email);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setSexo(sexo);
		this.setCpf(cpf);
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente() {
		this.idCliente = ID++;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) { /*Condi��o que verifica a idade que pode locar os filmes*/
		if (idade >= 18 && idade <= 100) 
			this.idade = idade;
		else
			System.out.println("Idade deve estar entre 18 e 100 anos.");/*Se n�o n�o podeeer� locar*/
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {	
		this.cpf = cpf;
	}

	
	public List<Locacao> getListaLocacoes() { 									
		return listaLocacoes;
	}

	public void setListaLocacoes(List<Locacao> locacoes) {
		this.listaLocacoes = locacoes;
	}
//mas tem a implementa��o (implements) do comparable
//, que � uma interface, que obriga a fazer o compare to
//, que faz  a ordena��o conforme o atributo escolhido
//	no nosso caso esta ordenado por id

	public int compareTo(Cliente cliente){
		if(this.getIdCliente() < cliente.getIdCliente()) return -1;
		if(this.getIdCliente() > cliente.getIdCliente()) return 1;
		return 0;
	}
}
