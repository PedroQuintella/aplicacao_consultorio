import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarNomePessoa() {
        Pessoa pessoa = new Pessoa("Pedro");
        assertEquals("Pedro", pessoa.getNome());
    }

    @Test
    void deveRetornarExcecaoNomePessoaNula() {
        try {
            Pessoa pessoa = new Pessoa(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomePessoaVazia() {
        try {
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomePessoa() {
        Pessoa pessoa = new Pessoa("Bruno");
        pessoa.setNome("Pedro");
        assertEquals("Pedro", pessoa.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomePessoaNulo() {
        try {
            Pessoa pessoa = new Pessoa("Pedro");
            pessoa.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomePessoaVazio() {
        try {
            Pessoa pessoa = new Pessoa("Pedro");
            pessoa.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }
}