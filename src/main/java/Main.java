
import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Yohanne
 */
public class Main {

    public static void main(String[] args) {
	// Testando as classes criadas e interagindo entre elas

	// Conteudos do Bootcamp
	Curso cursoA = new Curso(5);
	cursoA.setTitulo("Introdução a Programação");
	cursoA.setDescricao("Conceitos básicos de programação");

	Curso cursoB = new Curso(10);
	cursoB.setTitulo("Estrutura de Dados");
	cursoB.setDescricao("Primeiro contato com estruturas de dados");

	Mentoria mentoriaA = new Mentoria();
	mentoriaA.setTitulo("Tira-Dúvidas: Início na programação");
	mentoriaA.setDescricao("Bate-papo sobre dúvidas frequências");

	// Criando o Bootcamp
	Bootcamp bootcamp1 = new Bootcamp("Bootcamp Inicial", "Testa das classes");
	bootcamp1.getConteudos().add(cursoA);
	bootcamp1.getConteudos().add(cursoB);
	bootcamp1.getConteudos().add(mentoriaA);

	System.out.println(bootcamp1);

	System.out.println("/----------------------------------------------------------------------------/");

	// Testando classe de Devs
	Dev devA = new Dev("Marcos");
	devA.inscreverBootcamp(bootcamp1);
	System.out.println("Conteúdos Inscritos de Marcos: " + devA.getConteudosInscritos());
	System.out.println("Conteúdos Concluídos de Marcos: " + devA.getConteudosConcluidos());
	System.out.println("XP total:" + devA.calcularTotalXp());

	System.out.println("/----------------------------------------------------------------------------/");

	Dev devB = new Dev("Maria");
	devB.inscreverBootcamp(bootcamp1);
	System.out.println("Conteúdos Inscritos de Maria: " + devB.getConteudosInscritos());
	System.out.println("Conteúdos Concluidos de Maria: " + devB.getConteudosConcluidos());
	System.out.println("XP total: " + devB.calcularTotalXp());


	// Vamos considerar que Maria concluiu 2 conteudos e Marcos 1, então teremos:
	System.out.println("/------------- PROGRESSO DOS DEVS ------------- /");
	devB.progresso();
	devB.progresso();

	System.out.println("Conteúdos Inscritos de Maria: " + devB.getConteudosInscritos());
	System.out.println("Conteúdos Concluidos de Maria: " + devB.getConteudosConcluidos());
	System.out.println("XP total: " + devB.calcularTotalXp());

	System.out.println("/----------------------------------------------------------------------------/");

	devA.progresso();

	System.out.println("Conteúdos Inscritos de Marcos: " + devA.getConteudosInscritos());
	System.out.println("Conteúdos Concluídos de Marcos: " + devA.getConteudosConcluidos());
	System.out.println("XP total:" + devA.calcularTotalXp());
    }

}
