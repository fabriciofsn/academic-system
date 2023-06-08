import entities.address.Address;
import entities.aluno.Aluno;
import entities.enumerator.Enum;
import entities.professor.Professor;

public class Main {
    public static void main(String[] args) {
        Address[] addressesAluno = new Address[2];
        addressesAluno[0] = new Address("49300-000", "Rua 1", "Tobias Barreto", "202");

        Aluno aluno = new Aluno("Fabricio", "000.000.000.00",true,25, addressesAluno, Enum.registrationSituation.ACTIVE);
        System.out.printf("Nome: %s%n", aluno.get_name());
        System.out.printf("Idade: %s%n", aluno.get_age());
        System.out.printf("Situação do aluno: %s%n", aluno.get_registrarionSituation());
        System.out.printf("CPF: %s%n", aluno.get_CPF());
        System.out.printf("Matrícula: %s%n", aluno.get_registration());
        System.out.printf("Brasileiro? %s%n", aluno.get_brazilian());
        System.out.println("Endereço:" + aluno.recAddress(0));

        System.out.println("Dados professor:");

        Address[] addressesProfessor = new Address[2];
        addressesAluno[0] = new Address("49000-001", "Rua 2", "Aracajú", "120");

        Professor professor = new Professor("Davis","000.000.000-00",true,addressesProfessor,35);
        System.out.printf("Nome: %s%n", professor.get_name());
        System.out.printf("Idade: %s%n", professor.get_age());
        System.out.printf("CPF: %s%n", professor.get_CPF());
        System.out.printf("Matrícula: %s%n", professor.get_registration());
        System.out.printf("Brasileiro? %s%n", professor.get_brazilian());
    }
}
