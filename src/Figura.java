public abstract class Figura {
    private double largura;
    private double altura;

    public Figura(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }

    //sobrecarga usada devido ao quadrado que só usa 1 valor
    public Figura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodo para calcular as areas das outras figuras, ela não tem corpo aqui para ser usada nas subclasses
    //usando a palavra ABSTRACT, precisa estar na classe abstrata, então usando override nas subclasses, funciona

    public abstract double calcularArea();

}
