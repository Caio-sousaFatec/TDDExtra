
import org.example.CalculadoraSalario;
import org.example.Cargo;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSalarioTest {
    private final CalculadoraSalario calculadora = new CalculadoraSalario();

    @Test
    void testSalarioDesenvolvedorMaiorOuIgual3000() {
        Funcionario f = new Funcionario("João", "joao@email.com", 3000.0, Cargo.DESENVOLVEDOR);
        assertEquals(2400.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioDesenvolvedorMenor3000() {
        Funcionario f = new Funcionario("Ana", "ana@email.com", 2500.0, Cargo.DESENVOLVEDOR);
        assertEquals(2250.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioDbaMaiorOuIgual2000() {
        Funcionario f = new Funcionario("Carlos", "carlos@email.com", 2500.0, Cargo.DBA);
        assertEquals(1875.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioDbaMenor2000() {
        Funcionario f = new Funcionario("Lucas", "lucas@email.com", 1500.0, Cargo.DBA);
        assertEquals(1275.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioTestadorMaiorOuIgual2000() {
        Funcionario f = new Funcionario("Paula", "paula@email.com", 2200.0, Cargo.TESTADOR);
        assertEquals(1650.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioTestadorMenor2000() {
        Funcionario f = new Funcionario("Julia", "julia@email.com", 1800.0, Cargo.TESTADOR);
        assertEquals(1530.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioGerenteMaiorOuIgual5000() {
        Funcionario f = new Funcionario("Marcos", "marcos@email.com", 6000.0, Cargo.GERENTE);
        assertEquals(4200.0, calculadora.calcularSalarioLiquido(f));
    }

    @Test
    void testSalarioGerenteMenor5000() {
        Funcionario f = new Funcionario("Roberta", "roberta@email.com", 4500.0, Cargo.GERENTE);
        assertEquals(3600.0, calculadora.calcularSalarioLiquido(f));
    }
}

