package net.cniapi.CniRest.models;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Industrias {
	
	private Integer id;
	@Column(name = "nome") 
    private String nome;
	@Column(name = "endereco") 
    private String endereco;
	@Column(name = "tipo_atividade") 
    private String tipo_atividade;
    
    public Industrias() {}
    
    public Industrias(Integer id, String nome, String endereco,String tipoAtividade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.tipo_atividade = tipoAtividade;
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
    
    

}
