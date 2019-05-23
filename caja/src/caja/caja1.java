/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author PC16-LAB02
 */
public class caja1 {
    int ancho;
    int altura;
    int profundo;
    caja1 (){}
    caja1(int ancho, int altura,int profundo){
        this.ancho=ancho;
        this.altura=altura;
        this.profundo=profundo;
    }
    int volumen(){
        return ancho*altura*profundo;
    }
    int cara1(){
        return altura*ancho;      
    }
    int cara2(){
        return altura*profundo;
    }
    int cara3(){
        return ancho*profundo;
    }
    int sumacara(){
        return ancho*altura*2 + altura*profundo*2 + ancho*profundo*2;      
    }
}
