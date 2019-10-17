package model;

/**
 *
 * @author aldai
 */
public class Auto {

    private String marca;
    private String placa;
    private double valor;
    private int modelo;

    public Auto(String marca, String placa, double valor, int modelo) {
        this.marca = marca;
        this.placa = placa;
        this.valor = valor;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

   
}
