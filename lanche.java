import java.util.Scanner;

class lanche {
    public static void main(String[] args) {
        int produto, quantidade;
        Scanner input = new Scanner(System.in);
        cardapio cod1 = new cardapio(4);
        cardapio cod2 = new cardapio(4.5f);
        cardapio cod3 = new cardapio(5);
        cardapio cod4 = new cardapio(2);
        cardapio cod5 = new cardapio(1.5f);
        produto = input.nextInt();
        quantidade = input.nextInt();
        switch (produto) {
            case 1:
                cod1.calcular(quantidade);
                break;
            case 2:
                cod2.calcular(quantidade);
                break;
            case 3:
                cod3.calcular(quantidade);
                break;
            case 4:
                cod4.calcular(quantidade);
                break;
            case 5:
                cod5.calcular(quantidade);
                break;
        }
        /*switch (produto) {
            case 1 -> cod1.calcular(quantidade);
            case 2 -> cod2.calcular(quantidade);
            case 3 -> cod3.calcular(quantidade);
            case 4 -> cod4.calcular(quantidade);
            case 5 -> cod5.calcular(quantidade);
        }*/
        //runcodes não aceita esse switch
    }
}

class cardapio {
    cardapio(float preco){
        this.preco = preco;
    }
    final private float preco;

    float retorna(){
        return preco;
    }
    void calcular(int quantidade){
        System.out.printf("Total: R$ %.2f", retorna()*quantidade);
    }
}
