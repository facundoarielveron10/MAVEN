package model;

public class User {
    private String usuario;
    private String email;

    public User(String usuario, String email) {
        this.usuario = usuario;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
