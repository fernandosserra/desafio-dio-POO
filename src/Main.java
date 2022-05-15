import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
