package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelFuncionario;

public class Funcionario {
    private String name;
    private NivelFuncionario nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String name, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double Renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoPorHora c : contratos) {
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }

}
