package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis; 
    
    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }
    
    //----------------AUTOMOVIL------------------
    
    
    
    public void agregarAutomovil(String modelo, String marca, String motor, 
            String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil (auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, 
            String motor, String color, String patente, int cantPuertas) {
            auto.setColor(color);
            auto.setModelo(modelo);
            auto.setMarca(marca);
            auto.setPatente(patente);
            auto.setMotor(motor);
            auto.setCantPuertas(cantPuertas);
            
            //le pido a la persis que modifique
            controlPersis.modificarAuto(auto);
    }
    
    
    //----------------USUARIO------------------

    public Usuario validarUsuario(String usuario, String contrasenia) {
        
        Usuario usr = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios) {  
            if (usu.getNombreUsuario().equals(usuario)) {
                if(usu.getContrasenia().equals(contrasenia)) {
                   
                   usr = usu;
                   return usr;
                }
                else {
                   
                   usr = null;
                    return usr;
                }
            }
            else {
                
                usr = null;
            }
        
        }
        
        return usr;
    }
    
}
