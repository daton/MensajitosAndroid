package org.sierraguadalupe.mensajitosandroid;

/**
 * Created by rapid on 13/12/2017.
 */

public class Estatus {
    boolean success;
    String mensaje;

    public Estatus() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
