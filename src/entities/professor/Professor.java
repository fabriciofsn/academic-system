package entities.professor;
import entities.address.Address;
import entities.pessoa.Pessoa;
public class Professor extends Pessoa{
    private String _registration;
    @Override
    protected String registrationRegenrator() {
        String registration = String.format("%.0f", Math.floor(Math.random() * (99999 - 10000 + 1) + 10000));
        this._registration = registration;
        return _registration;
    }

    public Professor(String name, String CPF, boolean brazilian, Address[] address, int age){
        super(name,CPF,brazilian, address, age);
    }

    public String get_registration() {
        return this.registrationRegenrator();
    }
}
