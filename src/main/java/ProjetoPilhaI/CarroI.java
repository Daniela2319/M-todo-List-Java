package ProjetoPilhaI;

import java.util.Objects;

public class CarroI {

    String marca;

    public CarroI(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroI carroI = (CarroI) o;
        return Objects.equals(marca, carroI.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "CarroI{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

