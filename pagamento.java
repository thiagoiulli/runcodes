import java.util.Scanner;

class pagamento {
    public static void main(String[] args){
        int n, codigo, horas, dependentes;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        funcionario[] trabalhadores = new funcionario[n];
        for (int i = 0; i < n; i++){
            codigo = input.nextInt();
            horas = input.nextInt();
            dependentes = input.nextInt();
            trabalhadores[i] = new funcionario(codigo, horas, dependentes);
        }
        for (int i = 0; i < n; i++){
            float bruto, desconto;
            System.out.printf("%d ", trabalhadores[i].getcodigo());
            bruto = trabalhadores[i].bruto(trabalhadores[i].gethoras(), trabalhadores[i].auxilio());
            System.out.printf("%.2f ", bruto);
            desconto = (trabalhadores[i].inss() + trabalhadores[i].Irenda());
            System.out.printf("%.2f ", desconto);
            System.out.printf("%.2f\n", bruto - desconto);
        }
    }
}

class funcionario {
    funcionario(int codigo, int horas, int dependentes){
        this.codigo = codigo;
        this.horas = horas;
        this.dependentes = dependentes;
    }

    final private int codigo, horas, dependentes;


    private float bruto;

    int getcodigo(){
        return codigo;
    }

    float gethoras(){
        return 12*horas;
    }

    float auxilio(){
        return 40*dependentes;
    }
    float bruto(float horas, float dependentes){
        bruto = horas+dependentes;
        return bruto;
    }
    float inss(){
        return (bruto/100)*8.5f;
    }
    float Irenda(){
        return (bruto/100)*5;
    }
}