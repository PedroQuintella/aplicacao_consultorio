import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private Medico gerente;
    private List<Medico> medicos;

    public Consultorio() {
        this.medicos = new ArrayList<Medico>();
    }

    public Medico getGerente() {
        if (gerente == null) {
            throw new NullPointerException("Consultório não possui gerente.");
        }
        return this.gerente;
    }

    public void setGerente(Medico gerente) {
        this.gerente = gerente;
    }

    public void adicionarMedico(Medico medico) {
        this.medicos.add(medico);
    }

    public void removerConsulta(Medico medico) {
        this.medicos.remove(medico);
    }

    public boolean verificarConsulta(Medico medico) {
        return this.medicos.contains(medico);
    }

    public String getNomePacienteConsulta() {

    }
}
