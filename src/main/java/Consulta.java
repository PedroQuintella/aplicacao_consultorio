import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;

    public Consulta(Medico medico, Paciente paciente, Consultorio consultorio) {
        if ((medico == null) || (medico.equals(""))) {
            throw new NullPointerException("Médico é obrigatório.");
        }
        if ((paciente == null) || (paciente.equals(""))) {
            throw new NullPointerException("Paciente é obrigatório.");
        }
        if ((consultorio == null) || (consultorio.equals(""))) {
            throw new NullPointerException("Consultório é obrigatório.");
        }
        else {
            this.medico = medico;
            this.paciente = paciente;
            this.consultorio = consultorio;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        if ((medico == null) || (medico.equals(""))) {
            throw new NullPointerException("Médico é obrigatório.");
        }
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if ((paciente == null) || (paciente.equals(""))) {
            throw new NullPointerException("Paciente é obrigatório.");
        }
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        if ((consultorio == null) || (consultorio.equals(""))) {
            throw new NullPointerException("Consultório é obrigatório.");
        }
        this.consultorio = consultorio;
    }

    public String getNomePaciente() {
        return paciente.getNome();
    }

    public String getNomeMedico() {
        return medico.getNome();
    }

    public String getCRMMedico() {
        return medico.getCrm();
    }

    public String getCPFPaciente() {
        return paciente.getCpf();
    }
}
