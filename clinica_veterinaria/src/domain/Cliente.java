package domain;

import java.util.List;

public class Cliente extends Pessoa {

    private String esdereco;
    private Atendente cadastradoPor;
    private List<Pet> pets;
    public String getEsdereco() {
        return esdereco;
    }
    public void setEsdereco(String esdereco) {
        this.esdereco = esdereco;
    }
    public Atendente getCadastradoPor() {
        return cadastradoPor;
    }
    public void setCadastradoPor(Atendente cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public Cliente(Integer codigo, String nome, String telefone, String esdereco, Atendente cadastradoPor,
            List<Pet> pets) {
        super(codigo, nome, telefone);
        this.esdereco = esdereco;
        this.cadastradoPor = cadastradoPor;
        this.pets = pets;
    }
    @Override
    public String toString() {
        return "Cliente [esdereco=" + esdereco + ", cadastradoPor=" + cadastradoPor + ", pets=" + pets + "]";
    }

    
}