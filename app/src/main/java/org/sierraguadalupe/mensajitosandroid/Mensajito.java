package org.sierraguadalupe.mensajitosandroid;

/**
 * Created by rapid on 13/12/2017.
 */

public class Mensajito {
    String id;
    String titulo;
    String cuerpo;

    public Mensajito() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
