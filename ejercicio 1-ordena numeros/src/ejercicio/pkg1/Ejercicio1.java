/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author PC16-LAB02
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[]l={2,5,131  ,77,710};
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i]+","); 
        }
        System.out.println();
        int temp;  
        for(int i=0;i<l.length-1;i++){
            for(int j=0;j<l.length-1-i;j++){
                if(l[j]>l[j+1]){
                    temp=l[j+1];
                    l[j+1]=l[j];
                    l[j]=temp;

                }
            }
        }
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i]+","); 
        }
    }
}
    

  