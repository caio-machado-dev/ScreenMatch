import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(100);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(2);
        meuFilme.avalia(3);
        System.out.println(meuFilme.mediaDasAvaliacoes());


        meuFilme.exibirFichaTecnica();

        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibirFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporadas(10);
        serie.setMinutosPorEpisodios(60);

        System.out.println("Duração para Maratonar Lost: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme meuFilme02 = new Filme();
        meuFilme02.setNome("O poderoso chefão");
        meuFilme02.setAnoDeLancamento(1970);
        meuFilme02.setDuracaoEmMinutos(100);

        calculadora.incluir(meuFilme);
        calculadora.incluir(meuFilme02);
        calculadora.incluir(serie);
        System.out.println(calculadora.getTempoTotal());


    }
}