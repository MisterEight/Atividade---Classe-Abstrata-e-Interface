public class VeiculoMain {
    public static void main(String[] args) {
        Veiculo carro = new Veiculos("ABC-1234", "Toyota", "Corolla", 2020);
        carro.exibirDetalhes();

        Veiculo caminhao = new Caminhao("DEF-5678", "Volvo", "FH", 2018);
        caminhao.exibirDetalhes();

        Veiculo onibus = new Onibus("GHI-9012", "Mercedes", "O500", 2019);
        onibus.exibirDetalhes();
    }
}
