package br.com.kelvin.CalculadoraResistenciaEletrica;

import java.util.Scanner;

public class CalcularResistenciaEletrica {
    public static void main(String[] args) {
        float Vin = 0.0f, Vled = 0.0f, iled = 0.0f, r = 0.0f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora de Resistencia Elétrica  v1.0");
        System.out.println("Criador: Kelvin\n\n");


        System.out.println("Digite o valor de Vin (em Volts): ");
        Vin = scan.nextFloat();
        System.out.println("Vin: " + Vin);
        System.out.println("Digite o valor de Vled (em Volts): ");
        Vled = scan.nextFloat();
        System.out.println("Vled: " + Vled);
        System.out.println("Digite o valor de iled (em amperes): ");
        iled = scan.nextFloat();
        System.out.println("Iled: " + iled);

        r = (Vin - Vled) / iled;
        System.out.println("O valor do Resistor é de: " + r + " Ohms.");


    }
}
