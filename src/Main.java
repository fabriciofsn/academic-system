import entities.address.Address;
import entities.aluno.Aluno;
import entities.enumerator.Enum;

public class Main {
    public static void main(String[] args) {
        Address[] addresses = new Address[2];
        addresses[0] = new Address("49300-000", "Rua 1", "Tobias Barreto", "202");

        Aluno aluno = new Aluno("Fabricio", "000.000.000.00",25, addresses, Enum.registrationSituation.ACTIVE);
        System.out.printf("Nome: %s%n", aluno.get_name());
        System.out.printf("Idade: %s%n", aluno.get_age());
        System.out.printf("Situação do aluno: %s%n", aluno.get_registrarionSituation());
        System.out.printf("CPF: %s%n", aluno.get_CPF());
        System.out.printf("Matrícula: %s%n", aluno.get_registration());
    }
}
