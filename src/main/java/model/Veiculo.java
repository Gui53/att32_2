package model;

import java.util.Scanner;

public class Veiculo {

    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        this(0, 0, (float) 0.0);
    }

    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso:");
        peso = sc.nextInt();

        System.out.println("Velocidade Máxima:");
        velocMax = sc.nextInt();

        System.out.println("Preço:");
        preco = sc.nextFloat();
    }

    public void imprimir() {

        System.out.println("Peso:" + peso);
        

        System.out.println("Velocidade Máxima: " + velocMax);

        System.out.printf("Preço: " + preco);
    }

}
