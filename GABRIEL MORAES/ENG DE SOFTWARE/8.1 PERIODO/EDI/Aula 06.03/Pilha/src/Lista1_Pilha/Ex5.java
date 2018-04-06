/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1_Pilha;

import pilha.ObjetoPIlha;
import pilha.NovaPilha;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String Msg = entrada.nextLine();
        
        NovaPilha msg_original = new NovaPilha();
        NovaPilha msg_criptografada = new NovaPilha();
        
        System.out.println("Digite seu texto: ");
       
        for (int i =0 ; i < Msg.length(); i++){
            msg_original.push(new ObjetoPIlha(Msg.charAt(i)));
        }
        
        System.out.println("MENSAGEM ORIGINAL");
        msg_original.mostraPilhaString();
        
        
        for (int i = 0 ; i < msg_original.getSize(); i++){
            msg_criptografada.push(msg_original.pop());
        }
        
        
        System.out.println("\n\n\nMENSAGEM NOVA");
        msg_criptografada.mostraPilhaString();
        
        
    }
}
