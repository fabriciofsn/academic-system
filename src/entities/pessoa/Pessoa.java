package entities.pessoa;

import entities.address.Address;

public abstract class Pessoa {
    private String _name;
    private String _CPF;
    private boolean _brazilian;
    private int _age;
    private Address[] _address;

    public void set_name(String name){
        this._name = name;
    }
    public String get_name(){
        return this._name;
    }

    public void set_CPF(String CPF){
        this._CPF = CPF;
    }
    public String get_CPF(){
        return this._CPF;
    }

    public void set_brazilian(boolean brazilian){
        this._brazilian = brazilian;
    }
    public String get_brazilian(){
        if(this._brazilian) return "Sim.";
        return "Não";
    }

    public void set_age(int age){
        this._age = age;
    }
    public int get_age(){
        return this._age;
    }
    public Address recAddress(int position){
        return this._address[position];
    }
    public void set_address(Address[] address){
        this._address = address;
    }

    protected abstract String registrationRegenrator();

    public Pessoa(String name, String CPF, boolean brazilian, Address[] address, int age){
        this.set_name(name);
        this.set_CPF(CPF);
        this.set_age(age);
        this.set_brazilian(brazilian);
        this.set_address(address);
    }
}
