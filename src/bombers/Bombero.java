/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombers;

/**
 *
 * @author Jelly
 */
public class Bombero {
    
    private String nombre;
    private int edad;
    private String puesto;
    private int salario;

    public Bombero() {
    }

    public Bombero(String nombre, int edad, String puesto, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
    } 
    
    @Override
    public String toString(){
        
        String cadena = nombre+", "+edad+", "+ puesto+", "+salario;
        return cadena;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
