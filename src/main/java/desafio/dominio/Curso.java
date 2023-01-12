/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dominio;

/**
 *
 * @author Yohanne
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
    }
    
     @Override
    public double calcularXp() {
	return XP_PADRAO * cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
	return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "\n "+ "Titulo= " + getTitulo() + "\n " +  "Descricao= " + getDescricao() + "\n " + "Carga Horaria=" + cargaHoraria + '}';
    }
   
    
}
