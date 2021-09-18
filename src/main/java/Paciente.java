import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private String cpf;
    private Integer idade;
    private String tipoSanguineo;
    private String sexo;
    private List<Enfermidade> enfermidades;
    private List<Consulta> consultas;

    public Paciente(String nome, String cpf, Integer idade, String tipoSanguineo, String sexo) {
        super(nome);
        if ((cpf == null) || (cpf.trim().equals(""))) {
            throw new NullPointerException("CPF é obrigatório.");
        }
        else {
            if (idade == null) {
                throw new NullPointerException("Idade é obrigatório.");
            }
            else {
                if ((tipoSanguineo == null) || (tipoSanguineo.trim().equals(""))) {
                    throw new NullPointerException("Tipo Sanguíneo é obrigatório.");
                }
                else {
                    if ((sexo == null) || (sexo.trim().equals(""))) {
                        throw new NullPointerException("Sexo é obrigatório.");
                    }
                    else {
                        this.cpf = cpf;
                        this.idade = idade;
                        this.tipoSanguineo = tipoSanguineo;
                        this.sexo = sexo;
                        this.enfermidades = new ArrayList<Enfermidade>();
                        this.consultas = new ArrayList<Consulta>();
                    }
                }
            }
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if ((cpf == null) || (cpf.trim().equals(""))) {
            throw new NullPointerException("CPF é obrigatório.");
        }
        else {
            this.cpf = cpf;
        }
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        if (idade == null) {
            throw new NullPointerException("Idade é obrigatório.");
        }
        else {
            this.idade = idade;
        }
    }

    public String getTipoSanguineo() {
        return this.tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        if ((tipoSanguineo == null) || (tipoSanguineo.trim().equals(""))) {
            throw new NullPointerException("Tipo Sanguíneo é obrigatório.");
        }
        else {
            this.tipoSanguineo = tipoSanguineo;
        }
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if ((sexo == null) || (sexo.trim().equals(""))) {
            throw new NullPointerException("Sexo é obrigatório.");
        }
        else {
            this.sexo = sexo;
        }
    }

    public void adicionarEnfermidade(Enfermidade enfermidade) {
        this.enfermidades.add(enfermidade);
    }

    public void removerEnfermidade(Enfermidade enfermidade) {
        this.enfermidades.remove(enfermidade);
    }

    public boolean verificarEnfermidade(Enfermidade enfermidade) {
        return this.enfermidades.contains(enfermidade);
    }

    public List<Enfermidade> getEnfermidades() {
        return this.enfermidades;
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

    public List<Consulta> getConsultas() {
        return this.consultas;
    }
}
