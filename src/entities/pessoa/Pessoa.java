package entities.pessoa;

public abstract class Pessoa {
    private String _name;
    private String _CPF;
    private boolean _brazilian;
    private int _age;

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
    public boolean get_brazilian(){
        return this._brazilian;
    }

    public void set_age(int age){
        this._age = age;
    }
    public int get_age(){
        return this._age;
    }

    public void registrationGenerator(){

    };

    public Pessoa(String name, String CPF, int age){
        this.set_name(name);
        this.set_CPF(CPF);
        this.set_age(age);
    }
};
