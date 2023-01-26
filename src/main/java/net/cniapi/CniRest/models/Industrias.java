package net.cniapi.CniRest.models;

import jakarta.persistence.Id;

import java.sql.Date;
import java.util.List;


import jakarta.persistence.*;

@Entity
public class Industrias {
	
	private Integer id;
	@Column(name = "nome") 
    private String nome;
	@Column(name = "endereco") 
    private String endereco;
	@Column(name = "tipo_atividade") 
    private String tipo_atividade;
	@Column(name = "data_criacao") 
    private Date data_criacao;
	@Column(name = "limite_producao_diaria") 
    private Integer limite_producao_diaria;
	
	
    public Industrias() {}
    


	public Industrias(Integer id, String nome, String endereco, String tipo_atividade, Date data_criacao,
			Integer limite_producao_diaria) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.tipo_atividade = tipo_atividade;
		this.data_criacao = data_criacao;
		this.limite_producao_diaria = limite_producao_diaria;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipo_atividade() {
		return tipo_atividade;
	}

	public void setTipo_atividade(String tipo_atividade) {
		this.tipo_atividade = tipo_atividade;
	}




	public Date getData_criacao() {
		return data_criacao;
	}




	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}




	public Integer getLimite_producao_diaria() {
		return limite_producao_diaria;
	}




	public void setLimite_producao_diaria(Integer limite_producao_diaria) {
		this.limite_producao_diaria = limite_producao_diaria;
	}

	


}
