package domain;

import java.util.List;

public class Especie {
    private Integer codigo;

    private String nome;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Especie(Integer codigo, String nome, List<Pet> pets) {
        this.codigo = codigo;
        this.nome = nome;
        this.pets = pets;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    private List<Pet> pets;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Especie{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome=").append(nome);
        sb.append(", pets=").append(pets);
        sb.append('}');
        return sb.toString();
    }

}
