package org.java.ciclabile;

import java.util.NoSuchElementException;

public class Ciclabile {

    

    private int[] elencoInteri;

    private int index;


    public Ciclabile(int[] array){
        this.elencoInteri = array;
        this.index = 0;
    }


    public Ciclabile(){
        this.elencoInteri = new int[2];
        this.index = 0;
    }


    public void addElemento(int nuovoElemento){
        int[] nuovoArray = new int[elencoInteri.length + 1];
        for(int i = 0; i < elencoInteri.length; i++){
            nuovoArray[i] = elencoInteri[i];
        }

        nuovoArray[elencoInteri.length] = nuovoElemento;
        elencoInteri = nuovoArray;


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


