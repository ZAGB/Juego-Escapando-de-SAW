/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IniciodeJuego;

/**
 *
 * @author aldav
 */
public class Nivel2 implements IJuego {
    
    private String opcionSeleccionada;
    
    public void guardarSeleccionado(String botonSeleccionado){
       opcionSeleccionada = botonSeleccionado;
    }
    

    @Override
    public boolean esGanador() {
        return opcionSeleccionada == "3";
    }
    
}
