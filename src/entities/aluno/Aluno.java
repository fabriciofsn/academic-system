package entities.aluno;

import entities.address.Address;
import entities.enumerator.Enum;
import entities.pessoa.Pessoa;

import java.time.Year;

public class Aluno extends Pessoa{
    private String _name;
    private Address[] _address;
    private Enum.registrationSituation _registrarionSituation;
    private String _registration;
    public Aluno(String name, String CPF, int age, Address[] address, Enum.registrationSituation registrationSituation){
        super(name, CPF, age);
        this.set_address(address);
        this.set_registrarionSituation(registrationSituation);
    }

    @Override
    protected String registrationRegenrator() {
        Year year = Year.now();
        int currentYear = year.getValue();
        String randomNumber = String.format("%.0f", Math.floor(Math.random() * (9999 - 1000 + 1) + 1000));
        String studentRegistration = String.valueOf(currentYear) + String.valueOf(randomNumber);
        this._registration = studentRegistration;
        return this._registration;
    }

    public String get_registration(){
        return this.registrationRegenrator();
    }

    public void set_name(String name){
        this._name = name;
    }
    public String get_name(){
        return this._name;
    }
    //ADDRESS
    public void set_address(Address[] address){
        this._address = address;
    }
    public Address[] get_address(){
        return this._address;
    }

    public void set_registrarionSituation(Enum.registrationSituation registrationSituation){
        this._registrarionSituation = registrationSituation;
    }
    public Enum.registrationSituation get_registrarionSituation(){
        return this._registrarionSituation;
    }
}

