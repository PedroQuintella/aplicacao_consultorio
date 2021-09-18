import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private String crm;
    private List<Consulta> consultas;

    public Medico(String nome, String crm) {
        super(nome);
        if ((crm == null) || (crm.trim().equals(""))) {
            throw new NullPointerException("CRM é obrigatório.");
        }
        else {
            this.crm = crm;
            this.consultas = new ArrayList<Consulta>();
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if ((crm == null) || (crm.trim().equals(""))) {
            throw new NullPointerException("CRM é obrigatório.");
        }
        this.crm = crm;
    }

    public void adicionarConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        this.consultas.remove(consulta);
    }

    public boolean verificarConsulta(Consulta consulta) {
        return this.consultas.contains(consulta);
    }
}
