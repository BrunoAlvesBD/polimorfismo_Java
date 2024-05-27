public class Retangulo extends Figura{


    public Retangulo(double largura, double altura) {
        //usando a palavra super para utilizar o construtor da classe principal Figura
        super(largura,altura);

    }


    //usando gets da classe principal
    @Override
    public double calcularArea() {
        return getLargura() * getAltura();
    }




}
