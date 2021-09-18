import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ConsultaTest {

    @Test
    void deveRetornarNomePaciente() {
        Paciente paciente = createMock(Paciente.class);
        expect(paciente.getNome()).andReturn("Pedro");
        replay(paciente);
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta = new Consulta(medico, paciente, consultorio);
        assertEquals("Pedro", consulta.getNomePaciente());
    }

    @Test
    void deveRetornarNomeMedico() {
        Medico medico = createMock(Medico.class);
        expect(medico.getNome()).andReturn("Pedro");
        replay(medico);
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta = new Consulta(medico, paciente, consultorio);
        consulta.getNomePaciente();
        assertEquals("Pedro", consulta.getNomeMedico());
    }

    @Test
    void deveRetornarCRMMedico() {
        Medico medico = createMock(Medico.class);
        expect(medico.getCrm()).andReturn("19088777");
        replay(medico);
        Paciente paciente = new Paciente("Pedro", "19917564734", 29, "A+", "H");
        Consultorio consultorio = new Consultorio();
        Consulta consulta = new Consulta(medico, paciente, consultorio);
        consulta.getNomePaciente();
        assertEquals("19088777", consulta.getCRMMedico());
    }

    @Test
    void deveRetornarCPFPaciente() {
        Paciente paciente = createMock(Paciente.class);
        expect(paciente.getCpf()).andReturn("18177686750");
        replay(paciente);
        Medico medico = new Medico("Pedro", "190777");
        Consultorio consultorio = new Consultorio();
        Consulta consulta = new Consulta(medico, paciente, consultorio);
        assertEquals("18177686750", consulta.getCPFPaciente());
    }


}