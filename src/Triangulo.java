public class Triangulo extends Figura {

    public Triangulo(double largura, double altura) {
        super(largura, altura);
    }

    @Override
    public double calcularArea() {
        return (getLargura() * getAltura()) / 2;
    }
}
