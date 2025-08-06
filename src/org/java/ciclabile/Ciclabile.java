package org.java.ciclabile;

import java.util.NoSuchElementException;

public class Ciclabile {

    

    private int[] elencoInteri;

    private int index;


    public Ciclabile(int[] array){
        this.elencoInteri = array;
        this.index = 0;
    }











    public int getElementoSuccessivo(){

        if(!hasElementi()){
          
            throw new NoSuchElementException("Non ci sono altri elementi");
        }

        
        int elementoCorrente = elencoInteri[index];
        this.index++;
        return elementoCorrente;

    }



    public boolean hasElementi(){


        return index < elencoInteri.length;
        
    }


}


