public class Carros {

    //declaracao de variaveis private
    private String marca;
    private String modelo;
    private String cor;
    private double valor;

    //getters do projeto
    public Carros(String marca, String modelo, String cor, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "| Modelo: " + modelo + "| Cor: " + cor + "| Valor: R$" + valor;
    }

}
