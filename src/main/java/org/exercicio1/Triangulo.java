package org.exercicio1;

public class Triangulo {

    public static String classificarTriangulo(int lado1, int lado2, int lado3) {

        // Verificando se algum lado é zero ou negativo
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return "Valores inválidos";
        }

        // Verificando se a soma de dois lados é maior que o terceiro
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return "Não forma um triângulo";
        }

        // Triângulo equilátero (todos os lados iguais)
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        }

        // Triângulo isósceles (dois lados iguais)
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        }

        // Triângulo escaleno (todos os lados diferentes)
        return "Escaleno";
    }
}

