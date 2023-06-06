package entities.address;

public class Address {
    private String _cep;
    private String _street;
    private String _city;
    private String _houseNumber;

    //CEP
    public void set_cep(String cep){
        this._cep = cep;
    }
    public String get_cep(){
        return this._cep;
    }

    //STREET
    public void set_street(String street){
        this._street = street;
    }
    public String get_street(){
        return this._street;
    }

    //CITY
    public void set_city(String city){
        this._city = city;
    }
    public String get_city(){
        return this._city;
    }

    // HOUSE NUMBER
    public void set_houseNumber(String houseNumber){
        this._houseNumber = houseNumber;
    }

    public Address(String cep, String street, String city, String houseNumber){
        this.set_cep(cep);
        this.set_street(street);
        this.set_city(city);
        this.set_houseNumber(houseNumber);
    }
}
