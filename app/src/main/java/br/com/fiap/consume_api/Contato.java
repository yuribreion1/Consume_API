package br.com.fiap.consume_api;

import java.io.Serializable;

public class Contato implements Serializable {
    private String nome;
    private String telefone;
    private String status;
    private String imagem;

    public Contato() {
    }

    public Contato(String nome, String telefone, String status, String imagem) {
        setNome(nome);
        setTelefone(telefone);
        setStatus(status);
        setImagem(imagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
