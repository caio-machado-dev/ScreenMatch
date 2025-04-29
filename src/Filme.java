public class Filme {
    // Atributos da classe - caracteristicas
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


        // Métodos que realizam ações ao instanciar a classe
        void exibirFichaTecnica () {
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
        }

        void avalia(double nota) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }

        double mediaDasAvaliacoes() {
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }
    }
