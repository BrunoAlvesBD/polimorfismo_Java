public class Principal {
    public static void main(String[] args) {
        //polimorfismo

        Figura[] figuras = new Figura[3];
        figuras[0] = new Retangulo(5,6);
        figuras[1] = new Triangulo(5,6);
        figuras[2] = new Quadrado(8);

        for (Figura figura : figuras) {
            System.out.println("Área: "+figura.calcularArea());
        }
    }
}
