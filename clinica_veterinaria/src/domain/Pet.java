package domain;

import java.time.LocalDate;

public class Pet {

    private Integer codigo;

    private String nome;

    private LocalDate dataNascimento;

    private GeneroEnum genero;

    private Cliente tutor;

    private Especie especie;

    @Override
    public String toString() {
        return "Pet [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", genero=" + genero
                + ", tutor=" + tutor + ", especie=" + especie + "]";
    }

    public Pet(Integer codigo, LocalDate dataNascimento, Especie especie, GeneroEnum genero, String nome, Cliente tutor) {
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
        this.especie = especie;
        this.genero = genero;
        this.nome = nome;
        this.tutor = tutor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
                                                               
}
                   