
package pilha;
public class ObjetoPIlha {
    
    private int codigo;
    private char letra;
    private ObjetoPIlha proximo;

    
    public ObjetoPIlha() {
        this.proximo = null;
        this.codigo = 0;
    }

    public ObjetoPIlha(int codigo) {
        this.proximo = null;
        this.codigo = codigo;
    }
        
    public ObjetoPIlha(char l) {
        this.proximo = null;
        this.codigo = 0;
        this.letra = l;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ObjetoPIlha getProximo() {
        return proximo;
    }

    public void setProximo(ObjetoPIlha proximo) {
        this.proximo = proximo;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
    
    
    
}
