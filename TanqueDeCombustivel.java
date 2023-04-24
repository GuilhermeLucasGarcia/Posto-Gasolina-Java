    import java.util.Scanner;
    public class TanqueDeCombustivel {
        String tipoCombustivel;
        double capacidadeMax = 10000;
        double quantAtual;
        double quantPedinte;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TanqueDeCombustivel tanque = new TanqueDeCombustivel();
        

        System.out.println("Digite o tipo de combustivel");
        tanque.tipoCombustivel = input.nextLine();;

        System.out.println("Tipo de combustivel: " + tanque.getTipoCombustivel());
        System.out.println("Capacidade maxima: " + tanque.getCapacidadeMaxima());
        System.out.println("Quantidade Atual: " + tanque.getQuantidadeAtual());

        System.out.println("Digite a quantidade desejada:");
        tanque.quantPedinte = input.nextDouble();

        System.out.println("Quantidade que voce pediu: " + tanque.getQuantidadePedinte());
        System.out.println("Quantidade nova do tanque: " + tanque.getQuantNova());

    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMax;
    }

    public double getQuantidadeAtual() {
        return quantAtual = capacidadeMax ;
    }

    public double getQuantidadePedinte() {
        return quantPedinte;
    }

    public double getQuantNova() {
        return quantAtual - quantPedinte;
    }

}
