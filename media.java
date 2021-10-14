import java.util.Scanner;

class media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        numeros numero = new numeros(num1, num2, num3);
        System.out.printf("MEDIA = %.1f\n", numero.media());
    }
}
class numeros {
    numeros(double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    double num1, num2, num3;

    double media() {
        return (getNum1()*2+getNum2()*3+getNum3()*5)/10;
    }

    double getNum1() {
        return num1;
    }

    double getNum2() {
        return num2;
    }

    double getNum3() {
        return num3;
    }
}