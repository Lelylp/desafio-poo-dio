import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Curso curso3 = new Curso();
        curso3.setTitulo("curso python");
        curso3.setDescricao("descrição curso python");
        curso3.setCargaHoraria(8);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso angular");
        curso4.setDescricao("descrição curso angular");
        curso4.setCargaHoraria(4);

        Curso curso5 = new Curso();
        curso5.setTitulo("curso SQL");
        curso5.setDescricao("descrição curso SQL");
        curso5.setCargaHoraria(8);

        Curso curso6 = new Curso();
        curso6.setTitulo("curso NOSQL");
        curso6.setDescricao("descrição curso NOSQL");
        curso6.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Full-Stack");
        mentoria.setDescricao("descrição mentoria Full-Stack");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp DIO");
        bootcamp.setDescricao("Descrição Bootcamp Full-Stack Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(curso6);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("-------");

        Dev devWeslley = new Dev();
        devWeslley.setNome("Joao");
        devWeslley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devWeslley.getConteudosInscritos());
        devWeslley.progredir();
        devWeslley.progredir();
        devWeslley.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devWeslley.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devWeslley.getConteudosConcluidos());
        System.out.println("XP:" + devWeslley.calcularTotalXp());

    }

}
