package pilha;

public class Pilha {

    public Object[] pilha;
    public int posPilha;

    public Pilha() {
        posPilha = -1;
        this.pilha = new Object[100];
    }

    public void push(Object item) {
        if (!isFull()) {
            this.pilha[++posPilha] = item;
        } else {
            System.out.println("A PILHA ESTA CHEIA!");
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            System.out.println(toString());
            Object remove = this.pilha[size()-1];
            this.pilha[size()-1] = null;
            posPilha--;
            return remove;
        }
    }

    public boolean isFull() { // VERIFICAR SE ESTÁ CHEIA
        if (this.pilha[99] != null) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() { // VERIFICAR SE A PILHA ESTA VAZIA
        if (this.posPilha == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() { // VERIFICAR O TAMANHO DA PILHA
        if (this.isEmpty()) {
            return 0;
        }
        return this.posPilha + 1;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i <= size(); i++) {
                System.out.println(pilha[i]);
            }
        }
    }
    
    
       public boolean compara(Pilha outra){
         if (this.posPilha != outra.posPilha){
             return false;
         }else{
             Pilha bkp = new Pilha();
             bkp = this;
             
             for (int i = 0; i < bkp.size()-1; i++){
                 if ( !(bkp.pop().toString() == outra.pop().toString()) ){
                     
                     return false;
                 }
             }
             return true;
         }
       }
    
    public Object peek() { // verificar a ultima posição
        if (isEmpty()) {
            return 0;
        }
        return pilha[this.posPilha];
    }
    
}