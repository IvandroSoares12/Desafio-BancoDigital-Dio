public class Main {
    public static void main(String[] args) {
        Cliente Ivandro=new Cliente();
        Ivandro.setNome("Ivandro");
        Conta cc=new ContaCorrente(Ivandro);
        cc.depositar(100);
        Conta pp=new ContaCorrente(Ivandro);
        cc.transferir(100,pp);
         cc.imprimirInformacoescomuns();
         pp.imprimirInformacoescomuns();
    }
}
