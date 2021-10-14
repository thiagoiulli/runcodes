import  java.util.Scanner;

class Celula {

    private final int item;
    private Celula prox;

    public Celula(int item, Celula prox){
        this.item = item;
        this.prox = prox;
    }

    public Celula getProximo() {
        return this.prox;
    }

    public void setProximo(Celula prox){
        this.prox = prox;
    }

    public int getItem(){
        return this.item;
    }

}

class Pilha {

    private Celula ultimo;
    private int quantos;

    public Pilha(){
        this.ultimo = null;
        this.quantos = 0;
    }

    public void empilhar(int item){
        this.ultimo = new Celula(item, this.ultimo);
        this.quantos++;
    }

    public int desempilhar(){
        if(vazia())
            return 0;

        Celula aux = ultimo;
        ultimo = ultimo.getProximo();
        quantos--;

        aux.setProximo(null);
        return aux.getItem();
    }

    public int tamanho(){
        return quantos;
    }

    public boolean vazia(){
        return quantos == 0;
    }
}

class pilha {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Pilha pilha  = new Pilha();

        int n = input.nextInt();
        while(n > 0){

            char operacao = input.next().charAt(0);
            int item;

            switch (operacao){
                case 'E':
                    item = input.nextInt();
                    pilha.empilhar(item);
                    break;

                case 'D':
                    if(!pilha.vazia()){
                        item = pilha.desempilhar();
                        System.out.printf("%d\n", item);
                    }
                    else{
                        System.out.print("Erro: Pilha Vazia\n");
                    }
                    break;

                case 'T':
                    System.out.printf("%d\n", pilha.tamanho());
                    break;
            }
            n--;
        }
    }
}