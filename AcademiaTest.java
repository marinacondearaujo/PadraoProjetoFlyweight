package padroesestruturaisteste_exercicios.flyweight;

import org.junit.jupiter.api.Test;
import padroesestruturais_exercicios.flyweight.CidadeFactory;
import padroesestruturais_exercicios.flyweight.Academia;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcademiaTest {
    @Test
    void deveRetornarAlunos() {
        Academia escola = new Academia();
        escola.matricular("Jose", "Juiz de Fora", "MG");
        escola.matricular("Maria", "Juiz de Fora", "MG");
        escola.matricular("Ana", "Juiz de Fora", "MG");
        escola.matricular("Joao", "Santos Dumont", "MG");

        List<String> saida = Arrays.asList(
                "Aluno{nome='Jose', cidade='Juiz de Fora', uf='MG'}",
                "Aluno{nome='Maria', cidade='Juiz de Fora', uf='MG'}",
                "Aluno{nome='Ana', cidade='Juiz de Fora', uf='MG'}",
                "Aluno{nome='Joao', cidade='Santos Dumont', uf='MG'}");

        assertEquals(saida, escola.obterAlunos());
    }

    @Test
    void deveRetornarTotalCidades() {
        Academia escola = new Academia();
        escola.matricular("Jose", "Juiz de Fora", "MG");
        escola.matricular("Maria", "Juiz de Fora", "MG");
        escola.matricular("Ana", "Juiz de Fora", "MG");
        escola.matricular("Joao", "Santos Dumont", "MG");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}
