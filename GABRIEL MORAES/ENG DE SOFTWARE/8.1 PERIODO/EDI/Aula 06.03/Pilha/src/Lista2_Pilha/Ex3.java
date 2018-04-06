/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2_Pilha;

import java.util.Scanner;
import pilha.NovaPilha;
import pilha.ObjetoPIlha;

public class Ex3 {

    public static void main(String args[]) {

        
        
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("Digite seu texto: ");
        String Msg = entrada.nextLine();
        NovaPilha msg_original = new NovaPilha();      
       
        for (int i =0 ; i < Msg.length(); i++){
            msg_original.push(new ObjetoPIlha(Msg.charAt(i)));
        }
        System.out.println("MENSAGEM INVERSA: ");
        msg_original.mostraPilhaString();
    }

}
