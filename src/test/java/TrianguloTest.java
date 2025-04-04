import org.example.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTest {

    // Triângulo escaleno válido
    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Escaleno", Triangulo.classificarTriangulo(3, 4, 5));
    }

    // Triângulo isósceles válido
    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 3, 5));
        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 3, 3));
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 5, 3));
    }

    // Triângulo equilátero válido
    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Equilátero", Triangulo.classificarTriangulo(4, 4, 4));
    }

    // Caso de teste em que a soma de dois lados é igual ao terceiro lado
    @Test
    public void testSomaIgualTerceiroLado() {
        assertEquals("Não forma um triângulo", Triangulo.classificarTriangulo(3, 4, 7));
        assertEquals("Não forma um triângulo", Triangulo.classificarTriangulo(7, 3, 4));
        assertEquals("Não forma um triângulo", Triangulo.classificarTriangulo(4, 7, 3));
    }

    // Caso de teste em que a soma de dois lados é menor que o terceiro lado
    @Test
    public void testSomaMenorQueTerceiroLado() {
        assertEquals("Não forma um triângulo", Triangulo.classificarTriangulo(1, 2, 5));
        assertEquals("Não forma um triângulo", Triangulo.classificarTriangulo(5, 1, 2));
        assertEquals("Não forma um triângulo", Triangulo.classificarTriangulo(2, 5, 1));
    }

    // Caso de teste com os três valores iguais a zero
    @Test
    public void testValoresZero() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(0, 0, 0));
    }


    // Caso de teste para um valor zero
    @Test
    public void testValorZero() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(0, 4, 5));
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(4, 0, 5));
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(4, 5, 0));
    }

    // Caso de teste para valor negativo
    @Test
    public void testValorNegativo() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(-1, 4, 5));
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(4, -1, 5));
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(4, 5, -1));
    }

}
