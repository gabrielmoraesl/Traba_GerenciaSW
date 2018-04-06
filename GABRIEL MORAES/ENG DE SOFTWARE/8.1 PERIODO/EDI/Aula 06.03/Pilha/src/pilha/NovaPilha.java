/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Gabriel Moraes
 */
public class NovaPilha {

    private ObjetoPIlha topo = new ObjetoPIlha();
    private int tamanho;

    public NovaPilha() {
        topo = null;
        tamanho = 0;
    }

    public boolean isEmpty() { //verificar se está vazio! Obs: sempre havera um topo, caso esteja vazia, a pilha nao tem nenhum elemento
        return topo == null;
    }

    public void push(ObjetoPIlha p) {

        p.setProximo(topo);
        topo = p;
        tamanho++;
    }

    public ObjetoPIlha pop() {
        if (!isEmpty()) {
            ObjetoPIlha aux = topo;
            topo = topo.getProximo(); //
            tamanho--;
            return aux;
        }
        return null;

    }

    public void desempilhaTudo() {
        while (!isEmpty()) {
            pop();
        }
    }

    public ObjetoPIlha getTopo() {
        return this.topo;
    }

    public boolean equals(ObjetoPIlha p) {
        return this.topo.getCodigo() == p.getCodigo();
    }

    public int getSize() {
        return this.tamanho;
    }

    public void mostraPilhaCodigo() {
        ObjetoPIlha aux = topo;
        do {

            System.out.println(aux.getCodigo());
            aux = aux.getProximo();
        } while (aux != null);
    }

    public void mostraPilhaString() {
        ObjetoPIlha aux = topo;
        do {

            System.out.println(aux.getLetra());
            aux = aux.getProximo();
        } while (aux != null);
    }

    public void print() {
        ObjetoPIlha aux = topo;
        do {
            System.out.println(aux.getCodigo());
            aux = aux.getProximo();
        } while (aux != null);
    }

    public boolean comparaPilha(NovaPilha p) {
        ObjetoPIlha aux = topo;

        if (getSize() != p.getSize()) {
            return false;
        }
        ObjetoPIlha aux2 = p.getTopo();
        do {
            if (aux.getCodigo() != aux2.getCodigo()) {
                return false;
            }
            aux = aux.getProximo();
            aux2 = aux2.getProximo();
        } while (aux != null);
        return true;
    }

    public void comparaTamanho(NovaPilha p1, NovaPilha p2) {
        if (p1.getSize() != p2.getSize()){
            System.out.println("Pilha P1 possui mais elementos que pilha P2");
        }else
            System.out.println("As pilhas possuem a mesma quantidade de elementos");
    }
    
    public NovaPilha inverterPilha(){
        NovaPilha aux = new NovaPilha();
        while (!isEmpty()){
            aux.push(pop());
        }
        return aux;        
    }
    
}
