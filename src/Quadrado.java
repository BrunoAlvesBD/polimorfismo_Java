public class Quadrado extends Figura {

    public Quadrado(double largura) {
        super(largura);
    }



    @Override
    public double calcularArea() {
        return getLargura() * getLargura();
    }
}
