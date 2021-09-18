import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveRetornarNomeMedico() {
        Medico medico = new Medico("Pedro", "198778");
        assertEquals("Pedro", medico.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeMedicoNulo() {
        try {
            Medico medico = new Medico(null, "198778");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomeMedicoVazio() {
        try {
            Medico medico = new Medico("", "198778");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarCRMMedico() {
        Medico medico = new Medico("Pedro", "198778");
        assertEquals("198778", medico.getCrm());
    }

    @Test
    void deveRetornarExcecaoCRMMedicoNulo() {
        try {
            Medico medico = new Medico("Pedro", null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CRM é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCRMMedicoVazio() {
        try {
            Medico medico = new Medico("Pedro", "");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CRM é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomeMedico() {
        Medico medico = new Medico("Pedro", "198778");
        medico.setNome("Bruno");
        assertEquals("Bruno", medico.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomeMedicoNulo() {
        try {
            Medico medico = new Medico("Pedro", "198778");
            medico.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeMedicoVazio() {
        try {
            Medico medico = new Medico("Pedro", "198778");
            medico.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetCRMMedico() {
        Medico medico = new Medico("Pedro", "198778");
        medico.setCrm("198779");
        assertEquals("198779", medico.getCrm());
    }

    @Test
    void deveRetornarExcecaoSetCRMMedicoNulo() {
        try {
            Medico medico = new Medico("Pedro", "198778");
            medico.setCrm(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CRM é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCRMMedicoVazio() {
        try {
            Medico medico = new Medico("Pedro", "198778");
            medico.setCrm("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CRM é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarUmaConsultaAdicionada() {
        Medico medico = new Medico("Pedro", "190777");
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta = new Consulta(medico, paciente, consultorio);
        medico.adicionarConsulta(consulta);
        List<Consulta> lista = Arrays.asList(consulta);
        assertEquals(lista, medico.getConsultas());
    }

    @Test
    void deveRetornarDuasConsultasAdicionada() {
        Medico medico = new Medico("Pedro", "190777");
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        medico.adicionarConsulta(consulta1);
        medico.adicionarConsulta(consulta2);
        List<Consulta> lista = Arrays.asList(consulta1, consulta2);
        assertEquals(lista, medico.getConsultas());
    }

    @Test
    void deveRemoverUmaConsulta() {
        Medico medico = new Medico("Pedro", "190777");
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        paciente.adicionarConsulta(consulta1);
        medico.adicionarConsulta(consulta2);
        medico.removerConsulta(consulta1);
        List<Consulta> lista = Arrays.asList(consulta2);
        assertEquals(lista, medico.getConsultas());
    }

    @Test
    void deveRemoverDuasConsultas() {
        Medico medico = new Medico("Pedro", "190777");
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        Consulta consulta3 = new Consulta(medico, paciente, consultorio);
        medico.adicionarConsulta(consulta1);
        medico.adicionarConsulta(consulta2);
        medico.adicionarConsulta(consulta3);
        medico.removerConsulta(consulta1);
        medico.removerConsulta(consulta3);
        List<Consulta> lista = Arrays.asList(consulta2);
        assertEquals(lista, medico.getConsultas());
    }

    @Test
    void deveVerificarConsulta() {
        Medico medico = new Medico("Pedro", "190777");
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        medico.adicionarConsulta(consulta1);
        medico.adicionarConsulta(consulta2);
        assertTrue(medico.verificarConsulta(consulta1));
    }
}