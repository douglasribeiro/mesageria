package douglas.develop.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MessageDto {

    private Long id;

    private String nome;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date data;

    private String proc;

    public MessageDto() {}

    public MessageDto(Long id, String nome, Date data, String proc) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.proc = proc;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }
}
