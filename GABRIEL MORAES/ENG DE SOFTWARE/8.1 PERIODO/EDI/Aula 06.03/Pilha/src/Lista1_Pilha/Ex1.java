/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1_Pilha;

import pilha.ObjetoPIlha;
import pilha.NovaPilha;
import java.util.Scanner;

public class Ex1 {

    public static void main(String args[]) {

        NovaPilha p1 = new NovaPilha();
        NovaPilha p2 = new NovaPilha();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os elementos da pilha 1: ");

        for (int i = 0; i < 3; i++) {
            p1.push(new ObjetoPIlha(entrada.nextInt()));
        }
        System.out.println("Digite os elementos da pilha 2: ");

        //p2.push(new ObjetoPIlha(-322));
        for (int i = 0; i < 3; i++) {
            p2.push(new ObjetoPIlha(entrada.nextInt()));
        }

        System.out.println(p1.comparaPilha(p2));

    }
}