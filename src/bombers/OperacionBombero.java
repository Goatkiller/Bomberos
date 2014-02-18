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
public class OperacionBombero {

    
    private Bombero [] array= new Bombero[6]; 
    
    public OperacionBombero() {
    }
    
    public void ponerBomberos(Bombero i, Bombero j,Bombero k,Bombero f,Bombero g,Bombero y){
        
        this.array[0] = i;
        this.array[1] = j;
        this.array[2] = k;
        this.array[3] = f;
        this.array[4] = g;
        this.array[5] = y;
    }
    
    
    public String verBomberos(){
        String cadena= "Bombero 1: "+array[0].toString()+"\n"
                + "Bombero 2: "+array[1].toString()+"\n"
                +"Bombero 3: "+array[2].toString()+"\n"
                +"Bombero 4: "+array[3].toString()+"\n"
                +"Bombero 5: "+array[4].toString()+"\n"
                +"Bombero 6: "+array[5].toString()+"\n";
        return cadena;
    }
    
    public Bombero suma(int i,int j){
        
       
       
        String nombre = array[i].getNombre()+" "+array[j].getNombre();
        int edad = array[i].getEdad()+ array[j].getEdad();
        String puesto = array[i].getPuesto()+" "+array[j].getPuesto();
        int salario = array[i].getSalario() + array[j].getSalario();
        
        Bombero c = new Bombero(nombre, edad, puesto, salario);
        
       return c;
        
    }
    
    public CocheBomberos prepararCoche1(int i){
        
        CocheBomberos coche = new CocheBomberos();
        coche.addUno(array[i]);
        return coche;
    }
    
    public CocheBomberos prepararCoche2(int i, int j){
         CocheBomberos coche = new CocheBomberos();
         coche.addDos(array[i], array[j]);
         return coche;
    }
    public CocheBomberos prepararCoche3(int i, int j, int k){
         CocheBomberos coche = new CocheBomberos();
         coche.addTres(array[i], array[j], array[k]);
         return coche;
    }
     public CocheBomberos prepararCoche4(int i, int j, int k, int f){
         CocheBomberos coche = new CocheBomberos();
         coche.addCuatro(array[i], array[j], array[k], array[f]);
         return coche;
    }
     public CocheBomberos prepararCoche5(int i, int j, int k, int f, int g){
         CocheBomberos coche = new CocheBomberos();
         coche.addCinco(array[i], array[j], array[k], array[f], array[g]);
         return coche;
    }
     public CocheBomberos prepararCoche6(int i, int j, int k, int f, int g, int y){
         CocheBomberos coche = new CocheBomberos();
         coche.addSeis(array[i], array[j], array[k], array[f], array[g], array[y]);
         return coche;
    }

}
