import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarNomePaciente() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        assertEquals("Pedro", paciente.getNome());
    }

    @Test
    void deveRetornarExcecaoNomePacienteNulo() {
        try {
            Paciente paciente = new Paciente(null, "19917564734", 29, "A+", "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomePacienteVazio() {
        try {
            Paciente paciente = new Paciente("", "19917564734", 29, "A+", "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomePaciente() {
        Paciente paciente = new Paciente("Bruno", "19917564734", 29, "A+", "H");
        paciente.setNome("Pedro");
        assertEquals("Pedro", paciente.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomePacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomePacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarCPFPaciente() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        assertEquals("19917564734", paciente.getCpf());
    }

    @Test
    void deveRetornarExcecaoCPFPacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", null, 29, "A+", "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCPFPacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "", 29, "A+", "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetCPFPaciente() {
        Paciente paciente = new Paciente("Bruno", "19917564734", 29, "A+", "H");
        paciente.setCpf("19917564735");
        assertEquals("19917564735", paciente.getCpf());
    }

    @Test
    void deveRetornarExcecaoSetCPFPacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setCpf(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCPFPacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setCpf("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarIdadePaciente() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        assertEquals(29, paciente.getIdade());
    }

    @Test
    void deveRetornarExcecaoIdadePacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", null, "A+", "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Idade é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetIdadePaciente() {
        Paciente paciente = new Paciente("Bruno", "19917564734", 29, "A+", "H");
        paciente.setIdade(30);
        assertEquals(30, paciente.getIdade());
    }

    @Test
    void deveRetornarExcecaoSetIdadePacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 30, "A+", "H");
            paciente.setIdade(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Idade é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoSanguineoPaciente() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        assertEquals("A+", paciente.getTipoSanguineo());
    }

    @Test
    void deveRetornarExcecaoTipoSanguineoPacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, null, "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo Sanguíneo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTipoSanguineoPacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "", "H");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo Sanguíneo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetTipoSanguineoPaciente() {
        Paciente paciente = new Paciente("Bruno", "19917564734", 29, "A+", "H");
        paciente.setTipoSanguineo("B-");
        assertEquals("B-", paciente.getTipoSanguineo());
    }

    @Test
    void deveRetornarExcecaoSetTipoSanguineoPacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setTipoSanguineo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo Sanguíneo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCTipoSanguineoPacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setTipoSanguineo("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo Sanguíneo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSexoPaciente() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        assertEquals("H", paciente.getSexo());
    }

    @Test
    void deveRetornarExcecaoSexoPacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sexo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSexoPacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sexo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetSexoPaciente() {
        Paciente paciente = new Paciente("Bruno", "19917564734", 29, "A+", "H");
        paciente.setSexo("M");
        assertEquals("M", paciente.getSexo());
    }

    @Test
    void deveRetornarExcecaoSetSexoPacienteNulo() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setSexo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sexo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetSexoPacienteVazio() {
        try {
            Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
            paciente.setSexo("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sexo é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarUmaEnfermidadeAdicionada() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Enfermidade enfermidade = new Enfermidade("Autismo");
        paciente.adicionarEnfermidade(enfermidade);
        List<Enfermidade> lista = Arrays.asList(enfermidade);
        assertEquals(lista, paciente.getEnfermidades());
    }

    @Test
    void deveRetornarDuasEnfermidadesAdicionada() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Enfermidade enfermidade1 = new Enfermidade("Autismo");
        Enfermidade enfermidade2 = new Enfermidade("Gripe");
        paciente.adicionarEnfermidade(enfermidade1);
        paciente.adicionarEnfermidade(enfermidade2);
        List<Enfermidade> lista = Arrays.asList(enfermidade1, enfermidade2);
        assertEquals(lista, paciente.getEnfermidades());
    }

    @Test
    void deveRemoverUmaEnfermidade() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Enfermidade enfermidade = new Enfermidade("Autismo");
        paciente.adicionarEnfermidade(enfermidade);
        paciente.removerEnfermidade(enfermidade);
        List<Enfermidade> lista = Arrays.asList();
        assertEquals(lista, paciente.getEnfermidades());
    }

    @Test
    void deveRemoverDuasEnfermidades() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Enfermidade enfermidade1 = new Enfermidade("Autismo");
        Enfermidade enfermidade2 = new Enfermidade("Gripe");
        paciente.adicionarEnfermidade(enfermidade1);
        paciente.adicionarEnfermidade(enfermidade2);
        paciente.removerEnfermidade(enfermidade1);
        paciente.removerEnfermidade(enfermidade2);
        paciente.removerEnfermidade(enfermidade1);
        paciente.removerEnfermidade(enfermidade2);
        List<Enfermidade> lista = Arrays.asList();
        assertEquals(lista, paciente.getEnfermidades());
    }

    @Test
    void deveVerificarEnfermidade() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Enfermidade enfermidade1 = new Enfermidade("Autismo");
        Enfermidade enfermidade2 = new Enfermidade("Gripe");
        paciente.adicionarEnfermidade(enfermidade1);
        paciente.adicionarEnfermidade(enfermidade2);
        assertTrue(paciente.verificarEnfermidade(enfermidade1));
    }

    @Test
    void deveRetornarUmaConsultaAdicionada() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta = new Consulta(medico, paciente, consultorio);
        paciente.adicionarConsulta(consulta);
        List<Consulta> lista = Arrays.asList(consulta);
        assertEquals(lista, paciente.getConsultas());
    }

    @Test
    void deveRetornarDuasConsultasAdicionada() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        paciente.adicionarConsulta(consulta1);
        paciente.adicionarConsulta(consulta2);
        List<Consulta> lista = Arrays.asList(consulta1, consulta2);
        assertEquals(lista, paciente.getConsultas());
    }

    @Test
    void deveRemoverUmaConsulta() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        paciente.adicionarConsulta(consulta1);
        paciente.adicionarConsulta(consulta2);
        paciente.removerConsulta(consulta1);
        List<Consulta> lista = Arrays.asList(consulta2);
        assertEquals(lista, paciente.getConsultas());
    }

    @Test
    void deveRemoverDuasConsultas() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        Consulta consulta3 = new Consulta(medico, paciente, consultorio);
        paciente.adicionarConsulta(consulta1);
        paciente.adicionarConsulta(consulta2);
        paciente.adicionarConsulta(consulta3);
        paciente.removerConsulta(consulta1);
        paciente.removerConsulta(consulta3);
        List<Consulta> lista = Arrays.asList(consulta2);
        assertEquals(lista, paciente.getConsultas());
    }

    @Test
    void deveVerificarConsulta() {
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta1 = new Consulta(medico, paciente, consultorio);
        Consulta consulta2 = new Consulta(medico, paciente, consultorio);
        paciente.adicionarConsulta(consulta1);
        paciente.adicionarConsulta(consulta2);
        assertTrue(paciente.verificarConsulta(consulta1));
    }


}


