import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria com a Camila");
        mentoria1.setDescricao("Aprofundando o paradigma de orientacao a objetos");
        mentoria1.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Basico");
        curso1.setDescricao("Curso de principios no Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript Basico");
        curso2.setDescricao("Curso de principios no JavaScript");
        curso2.setCargaHoraria(8);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Philips You Are You");
        bootcamp1.setDescricao("Full Stack Development patrocinado pela Philips");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Brigido");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Brigido" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Inscritos Brigido" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Brigido" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        System.out.println("====================");

        Dev dev2 = new Dev();
        dev2.setNome("Fernando");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Fernando" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos Inscritos Fernando" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fernando" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
