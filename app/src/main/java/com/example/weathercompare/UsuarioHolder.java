package com.example.weathercompare;

public class UsuarioHolder {
    private Usuario usuario;
    public Usuario getUsuarioLogueado() {return usuario;}
    public void setUsuarioLogueado(Usuario usuario) {this.usuario = usuario;}

    private static final UsuarioHolder holder = new UsuarioHolder();
    public static UsuarioHolder getInstance() {return holder;}
}
