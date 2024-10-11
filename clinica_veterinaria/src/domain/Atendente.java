package domain;

import java.util.List;

public class Atendente extends Pessoa {

    private Double salario;

    private List<Cliente> clientesCadastros;

    public Atendente(Integer codigo, String nome, String telefone, Double salario) {
        super(codigo, nome, telefone);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Cliente> getClientesCadastros() {
        return clientesCadastros;
    }

    public void setClientesCadastros(List<Cliente> clientesCadastros) {
        this.clientesCadastros = clientesCadastros;
    }

    @Override
    public String toString() {
        return "Atendente [codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + ", telefone=" + telefone
                + ", getCodigo()=" + getCodigo() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
                + ", getTelefone()=" + getTelefone() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + "]";
    }

}
