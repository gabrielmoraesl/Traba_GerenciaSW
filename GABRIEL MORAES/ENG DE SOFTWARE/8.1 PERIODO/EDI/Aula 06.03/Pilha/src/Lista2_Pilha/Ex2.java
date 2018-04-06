package Lista2_Pilha;

import java.util.Scanner;
import pilha.NovaPilha;
import pilha.ObjetoPIlha;

public class Ex2 {

    public static void main(String args[]) {

        NovaPilha p1 = new NovaPilha();
        System.out.println("Digite os elementos de sua lista");
        for (int i = 0; i < 3; i++) {
            p1.push(new ObjetoPIlha(new Scanner(System.in).nextInt()));
        }

        System.out.println("PILHA ORIGINAL");
        p1.print();
        
        p1 = p1.inverterPilha();
                
        System.out.println("PILHA INVERTIDA");
        p1.print();
        
        
    }
}
