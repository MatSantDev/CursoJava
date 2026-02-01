package Exercice.Set;

import java.util.Date;
import java.util.Objects;

public class UsersLogs {

    private String nome;
    private Date data;

    public UsersLogs(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UsersLogs{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UsersLogs usersLogs = (UsersLogs) o;
        return Objects.equals(nome, usersLogs.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}