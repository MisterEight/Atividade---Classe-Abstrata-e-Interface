interface Acomodacao {
    double calcularDiaria();
    void exibirDetalhes(int dias, int numPessoas);
}

interface ServicoAdicional {
    double calcularServico(int dias, int numPessoas);
}

class QuartoSimples implements Acomodacao, ServicoAdicional {
    private final double diaria = 100.0;

    @Override
    public double calcularDiaria() {
        return diaria;
    }

    @Override
    public double calcularServico(int dias, int numPessoas) {
        double cafeDaManha = 20.0 * numPessoas * dias;
        double limpezaExtra = 30.0 * dias;
        return cafeDaManha + limpezaExtra;
    }

    @Override
    public void exibirDetalhes(int dias, int numPessoas) {
        double custoDiaria = calcularDiaria() * dias;
        double custoServico = calcularServico(dias, numPessoas);
        double custoTotal = custoDiaria + custoServico;
        System.out.println("Detalhes do Quarto Simples:");
        System.out.printf("Custo Diaria: R$%.2f para %d dias%n", custoDiaria, dias);
        System.out.printf("Serviços Adicionais: R$%.2f%n", custoServico);
        System.out.printf("Custo Total: R$%.2f%n", custoTotal);
    }
}

class QuartoDuplo implements Acomodacao, ServicoAdicional {
    private final double diaria = 180.0;

    @Override
    public double calcularDiaria() {
        return diaria;
    }

    @Override
    public double calcularServico(int dias, int numPessoas) {
        double cafeDaManha = 20.0 * numPessoas * dias;
        double limpezaExtra = 30.0 * dias;
        return cafeDaManha + limpezaExtra;
    }

    @Override
    public void exibirDetalhes(int dias, int numPessoas) {
        double custoDiaria = calcularDiaria() * dias;
        double custoServico = calcularServico(dias, numPessoas);
        double custoTotal = custoDiaria + custoServico;
        System.out.println("Detalhes do Quarto Duplo:");
        System.out.printf("Custo Diaria: R$%.2f para %d dias%n", custoDiaria, dias);
        System.out.printf("Serviços Adicionais: R$%.2f%n", custoServico);
        System.out.printf("Custo Total: R$%.2f%n", custoTotal);
    }
}

class Suite implements Acomodacao, ServicoAdicional {
    private final double diaria = 350.0;

    @Override
    public double calcularDiaria() {
        return diaria;
    }

    @Override
    public double calcularServico(int dias, int numPessoas) {
        double cafeDaManha = 20.0 * numPessoas * dias;
        double limpezaExtra = 30.0 * dias;
        return cafeDaManha + limpezaExtra;
    }

    @Override
    public void exibirDetalhes(int dias, int numPessoas) {
        double custoDiaria = calcularDiaria() * dias;
        double custoServico = calcularServico(dias, numPessoas);
        double custoTotal = custoDiaria + custoServico;
        System.out.println("Detalhes da Suite:");
        System.out.printf("Custo Diaria: R$%.2f para %d dias%n", custoDiaria, dias);
        System.out.printf("Serviços Adicionais: R$%.2f%n", custoServico);
        System.out.printf("Custo Total: R$%.2f%n", custoTotal);
    }
}
