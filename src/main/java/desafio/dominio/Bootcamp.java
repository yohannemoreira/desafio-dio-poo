/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Yohanne
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);  
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    // Construtor

    public Bootcamp(String nome, String descricao) {
	this.nome = nome;
	this.descricao = descricao;
    }
    

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
	return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
	this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
	return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
	this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 59 * hash + Objects.hashCode(this.nome);
	hash = 59 * hash + Objects.hashCode(this.descricao);
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final Bootcamp other = (Bootcamp) obj;
	if (!Objects.equals(this.nome, other.nome)) {
	    return false;
	}
	return Objects.equals(this.descricao, other.descricao);
    }

    @Override
    public String toString() {
	return "Bootcamp{" + "nome=" + nome + "\n descricao=" + descricao + "\n dataInicio=" + dataInicio + "\n dataFinal=" + dataFinal + "\n devsInscritos=" + devsInscritos + "\n conteudos=" + conteudos + '}';
    }
    
    
}
