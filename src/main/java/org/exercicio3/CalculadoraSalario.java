package org.exercicio3;

public class CalculadoraSalario {
    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salario = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();

        return switch (cargo) {
            case DESENVOLVEDOR -> salario >= 3000 ? salario * 0.8 : salario * 0.9;
            case DBA, TESTADOR -> salario >= 2000 ? salario * 0.75 : salario * 0.85;
            case GERENTE -> salario >= 5000 ? salario * 0.7 : salario * 0.8;
        };
    }
}
