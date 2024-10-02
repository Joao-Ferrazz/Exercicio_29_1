
package model;

/**
 *
 * @author unisul
 */
public class Veiculo {

    private double quilometros;
    private double litros;

    public Veiculo() {
        this(0, 0);
    }

    public Veiculo(double quilometros, double litros) {
        this.quilometros = quilometros;
        this.litros = litros;
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getConsumo() {
        return ((getLitros() / getQuilometros()));
    }
}

    

