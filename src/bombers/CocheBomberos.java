/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombers;

import java.util.ArrayList;

/**
 *
 * @author Jelly
 */
public class CocheBomberos {
    private Bombero copyi, copyj, copyk, copyf, copyg, copyy;
    private ArrayList<Bombero> array;
    
    public CocheBomberos(){
        array = new ArrayList(6);
    }
    
    public void addUno(Bombero i){
        copyi = i;
        array.add(copyi);
        copyi.setPuesto("Conductor");
        
    }
    public void addDos(Bombero i, Bombero j){
        copyi=i;copyj=j;
        array.add(copyi);
        array.add(copyj);
        copyi.setPuesto("Conductor");
        copyj.setPuesto("Manguera1");
    }
    
    public void addTres(Bombero i, Bombero j, Bombero k){
        copyi=i;copyj=j;copyk=k;
        array.add(copyi);
        array.add(copyj);
        array.add(copyk);
        copyi.setPuesto("Conductor");
        copyj.setPuesto("Manguera1");
        copyk.setPuesto("Manguera2");
    }
    
    public void addCuatro(Bombero i, Bombero j, Bombero k, Bombero f){
        copyi=i;copyj=j;copyk=k;copyf=f;
        array.add(copyi); array.add(copyj); array.add(copyk);array.add(copyf);
        copyi.setPuesto("Conductor");
        copyj.setPuesto("Manguera1");
        copyk.setPuesto("Manguera2");
        copyf.setPuesto("Auxiliar1");
    }
    
    public void addCinco(Bombero i, Bombero j, Bombero k, Bombero f, Bombero g){
        copyi=i;copyj=j;copyk=k;copyf=f;copyg=g;
        array.add(copyi); array.add(copyj); array.add(copyk); array.add(copyf); array.add(copyg);
        copyi.setPuesto("Conductor");
        copyj.setPuesto("Manguera1");
        copyk.setPuesto("Manguera2");
        copyf.setPuesto("Auxiliar1");
        copyg.setPuesto("Auxiliar2");
    }
    
    public void addSeis(Bombero i, Bombero j, Bombero k, Bombero f, Bombero g, Bombero y){
        copyi=i;copyj=j;copyk=k;copyf=f;copyg=g;copyy=y;
        array.add(copyi); array.add(copyj); array.add(copyk); array.add(copyf); array.add(copyg);array.add(copyy);
        copyi.setPuesto("Conductor");
        copyj.setPuesto("Manguera1");
        copyk.setPuesto("Manguera2");
        copyf.setPuesto("Auxiliar1");
        copyg.setPuesto("Auxiliar2");
        copyy.setPuesto("Auxiliar3");
    }
    
    
}
