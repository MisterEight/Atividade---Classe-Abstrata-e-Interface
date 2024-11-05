abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    protected float valorEstimado;

    public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public float getValorEstimado() {
        return valorEstimado;
    }

    abstract void calcularIPVA();
    abstract void exibirDetalhes();

    abstract void calcularValorEstimado();
}


class Veiculos extends Veiculo {

    public Veiculos(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
        calcularValorEstimado();
    }

    @Override
    void calcularValorEstimado() {
        int anos = 2024 - getAnoFabricacao();
        valorEstimado = Math.max(0, 50000 - (2000 * anos));
    }

    @Override
    void calcularIPVA() {
        float ipva = valorEstimado * 0.04f;
        System.out.printf("IPVA do Carro: R$%.2f%n", ipva);
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Detalhes do Veículo:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.printf("Valor Estimado: R$%.2f%n", getValorEstimado());
        calcularIPVA();
    }
}


class Caminhao extends Veiculo {

    public Caminhao(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
        calcularValorEstimado();
    }

    @Override
    void calcularValorEstimado() {
        int anos = 2024 - getAnoFabricacao();
        valorEstimado = Math.max(0, 100000 - (5000 * anos));
    }

    @Override
    void calcularIPVA() {
        float ipva = valorEstimado * 0.015f;
        System.out.printf("IPVA do Caminhão: R$%.2f%n", ipva);
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Detalhes do Caminhão:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.printf("Valor Estimado: R$%.2f%n", getValorEstimado());
        calcularIPVA();
    }
}


class Onibus extends Veiculo {

    public Onibus(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
        calcularValorEstimado();
    }

    @Override
    void calcularValorEstimado() {
        int anos = 2024 - getAnoFabricacao();
        valorEstimado = Math.max(0, 80000 - (3000 * anos));
    }

    @Override
    void calcularIPVA() {
        float ipva = valorEstimado * 0.02f;
        System.out.printf("IPVA do Ônibus: R$%.2f%n", ipva);
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Detalhes do Ônibus:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.printf("Valor Estimado: R$%.2f%n", getValorEstimado());
        calcularIPVA();
    }
}

    