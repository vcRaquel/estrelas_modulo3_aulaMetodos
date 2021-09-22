
package br.com.zup.modelagemDeClasseExercicioComp3;
//Classe Retangulo: Crie uma classe que modele um retângulo:
//Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
public class Retangulo {
    double base;
    double altura;

    public Retangulo(){

    }
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    //2. Métodos:
    // Mudar valor dos lados
    public void mudarValorDosLados(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    // Retornar valor dos lados
    //****************************** tirar dúvida de como dar 2 retornos ******************************************
    public double valorDosLados(){
        return  base;
    }
    // calcular Área
    public void calcularArea(){
        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
    }
    // calcular Perímetro;
    public void calcularPerimetro(){
        double perimetro = 2 * (base + altura);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }

    public void mostraDados(){
        System.out.println("-----------------------------------");
        System.out.println("O valor da base é: " + base);
        System.out.println("O valor da altura é: " + altura);

    }

}
