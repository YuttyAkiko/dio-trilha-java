import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Js");
		curso2.setDescricao("descrição curso Js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devYutty = new Dev();
		devYutty.setNome("Yutty");
		System.out.println("Dev: " + devYutty.getNome());
		devYutty.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devYutty.getConteudosInscritos());
		devYutty.progredir();
		devYutty.progredir();
		System.out.println("Conteúdos Inscritos" + devYutty.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devYutty.getConteudosConcluidos());
		System.out.println("XP: " + devYutty.calcularTotalXP());
		
		System.out.println("*-------------------*");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		System.out.println("Dev: " + devMaria.getNome());
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devMaria.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("Conteúdos Inscritos" + devMaria.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXP());
		
	}
}
