/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion;
import Clases.Atencion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class ListaAtencion {
    private List<Atencion> lista = new ArrayList<>();

    public ListaAtencion() {
    }

    public List<Atencion> getLista() {
        return lista;
    }

    public void setLista(List<Atencion> lista) {
        this.lista = lista;
    }
    
    public boolean agregarAtencion(Atencion ate){
        for (Atencion atencion : lista) {
            if(atencion.getCodigo().equals(ate.getCodigo())){
                return false;
            }
                
        }
        lista.add(ate);
        return true;
    }
    public Atencion eliminarAtencion(String codigo){
        for (Atencion atencion : lista) {
            if(atencion.codigo.equals(codigo)){
            lista.remove(atencion);
                System.out.println("ATENCION ELIMINADA DEL SISTEMA");
                return atencion;
            }
        }
        System.out.println("CODIGO DE LA ATENCION INCORRECTO");
        return null;
    }
    
    public boolean modificarAtencion(Atencion ate){
        for (Atencion atencion : lista) {
            if(atencion.getCodigo().equals(ate.getCodigo())){
                lista.add(ate);
                return true;
            }
        }
        return false;
    }

}
