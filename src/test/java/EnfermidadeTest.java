import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnfermidadeTest {

    @Test
    void deveRetornarTipoEnfermidade() {
        Enfermidade enfermidade = new Enfermidade("Autismo");
        assertEquals("Autismo", enfermidade.getTipo());
    }

    @Test
    void deveRetornarExcecaoTipoEnfermidadeNulo() {
        try {
            Enfermidade enfermidade = new Enfermidade(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTipoEnfermidadeVazio() {
        try {
            Enfermidade enfermidade = new Enfermidade("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetTipoEnfermidade() {
        Enfermidade enfermidade = new Enfermidade("Autismo");
        enfermidade.setTipo("Gripe");
        assertEquals("Gripe", enfermidade.getTipo());
    }

    @Test
    void deveRetornarExcecaoSetTipoEnfermidadeNulo() {
        try {
            Enfermidade enfermidade = new Enfermidade("Autismo");
            enfermidade.setTipo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetTipoEnfermidadeVazio() {
        try {
            Enfermidade enfermidade = new Enfermidade("");
            enfermidade.setTipo("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo é obrigatório", e.getMessage());
        }
    }
}