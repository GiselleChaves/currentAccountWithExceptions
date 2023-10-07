public class App {
    public static void main(String[] args) throws Exception {
        currentAccount cc = new currentAccount(10.00);
        
        cc.deposito(150);
        System.out.println("Valor do Saldo: " + cc.getBalance());

        cc.retirada(500);
        cc.retirada(200);

        System.out.println("Valor do Saldo: " + cc.getBalance());
    }
}
