/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2_Pilha;

import pilha.NovaPilha;
import pilha.ObjetoPIlha;

public class Ex1 {

    public static void main(String args[]) {

        NovaPilha p1 = new NovaPilha();
        NovaPilha p2 = new NovaPilha();
        int i;

        for (i = 0; i < 3; i++) {
            p1.push(new ObjetoPIlha(i)); 
        }
        System.out.println("P1 possui tamanho:" + i);
        for (i = 0; i < 4; i++) {
            p2.push(new ObjetoPIlha(i));
        }
        System.out.println("P2 possui tamanho:" + i);
        p1.comparaTamanho(p1, p2);
    }
}
