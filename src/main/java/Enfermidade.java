public class Enfermidade {
    private String tipo;

    public Enfermidade(String tipo) {
        if ((tipo == null) || (tipo.trim().equals(""))) {
            throw new NullPointerException("Tipo é obrigatório");
        }
        else {
            this.tipo = tipo;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ((tipo == null) || (tipo.trim().equals(""))) {
            throw new NullPointerException("Tipo é obrigatório");
        }
        else {
            this.tipo = tipo;
        }
    }
}
