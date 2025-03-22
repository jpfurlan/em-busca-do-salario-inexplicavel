// Classe Carro
public class Carro {
    // Atributos (encapsulados)
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos (Comportamentos)
    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

// Subclasse CarroEletrico
public class CarroEletrico extends Carro {
    private int autonomia; // Em quilômetros
    private int preco;

    // Construtor
    public CarroEletrico(String modelo, int ano, int autonomia) {
        super(modelo, ano); // Chama o construtor da superclasse
        this.autonomia = autonomia;
    }

    // Sobrescrita do método
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Exibe detalhes da superclasse
        System.out.println("Autonomia: " + autonomia + " km");
    }

}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro carro1 = new Carro("Toyota Corolla", 2022);
        carro1.exibirDetalhes();

        System.out.println("-------------------------");

        // Criando um objeto da subclasse CarroEletrico
        CarroEletrico tesla = new CarroEletrico("Tesla Model 3", 2023, 500);
        tesla.exibirDetalhes();
    }
}

