/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author wendy
 */
public class ingreso {
    private int idingresos;
    private String descripcion;
    private int monto;
    private String fecha;
    private String usuario;
    
    private int SUMmonto;
    private String Groupfecha;

    public ingreso() {
    }

    public ingreso(int idingresos, String descripcion, int monto, String fecha, String usuario) {
        this.idingresos = idingresos;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public ingreso(String descripcion, int monto, String fecha, String usuario) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getSUMmonto() {
        return SUMmonto;
    }

    public void setSUMmonto(int SUMmonto) {
        this.SUMmonto = SUMmonto;
    }

    public String getGroupfecha() {
        return Groupfecha;
    }

    public void setGroupfecha(String Groupfecha) {
        this.Groupfecha = Groupfecha;
    }
    
    
    
    public int getIdingresos() {
        return idingresos;
    }

    public void setIdingresos(int idingresos) {
        this.idingresos = idingresos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "ingreso{" + "idingresos=" + idingresos + ", descripcion=" + descripcion + ", monto=" + monto + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }

    
    
    
}
