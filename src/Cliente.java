import java.sql.Date;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private int tipoCliente; // 0: Não assinante, 1: Assinante diária 2: Assinante mensal, 3: Assinante anual
    private Date inicioAssinatura;
    private Date validadeAssinatura;
    private int viagensRealizadasNoDia;

    public Cliente(int id, String nome, String cpf, String telefone, int tipoCliente, Date inicioAssinatura, Date validadeAssinatura) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tipoCliente = tipoCliente;
        this.inicioAssinatura = inicioAssinatura;
        this.validadeAssinatura = validadeAssinatura;
        this.viagensRealizadasNoDia = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Date getInicioAssinatura() {
        return inicioAssinatura;
    }

    public void setInicioAssinatura(Date inicioAssinatura) {
        this.inicioAssinatura = inicioAssinatura;
    }

    public Date getValidadeAssinatura() {
        return validadeAssinatura;
    }

    public void setValidadeAssinatura(Date validadeAssinatura) {
        this.validadeAssinatura = validadeAssinatura;
    }

    public int getViagensRealizadasNoDia() {
        return viagensRealizadasNoDia;
    }

    public void incrementarViagensRealizadasNoDia() {
        viagensRealizadasNoDia++;
    }
}
