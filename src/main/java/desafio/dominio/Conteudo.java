/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dominio;

/**
 *
 * @author Yohanne
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 15;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();
    
    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }
    
}
