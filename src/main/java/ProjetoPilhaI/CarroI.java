package ProjetoPilhaI;

import java.util.Objects;

/**
 * Classe CarroI
 * Implementado equal/hasCode
 */
public class CarroI {

    // atributo
    String marca;
   // construtor
    public CarroI(String marca) {
        this.marca = marca;
    }

    // getter e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método equals
     * Comparação de igualdade, testar se objeto é igual ao outro.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // teste
        if (o == null || getClass() != o.getClass()) return false;
        CarroI carroI = (CarroI) o; // cria o objeto carro.
        return Objects.equals(marca, carroI.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); // returna objeto marcas
    }

    @Override
    public String toString() {
        return "CarroI{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

