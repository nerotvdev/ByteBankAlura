
public class CriaConta {

    public static void main(String[] args) {
            //Cria Clientes ln Conta ln set conta
        Cliente mariana = new Cliente();
        mariana.setNome("Mariana Bello");
		mariana.setCpf("222.222.222.-22");
		mariana.setProfissao("Etéticista");

        ContaCorrente ccDaMariana = new ContaCorrente(6646, 969060);
        ContaPoupanca cpDaMariana = new ContaPoupanca(6646, 969060-1);
        SeguroDeVida seguroDaMariana = new SeguroDeVida();

        CalculadorDeImpostos impostosMariana = new CalculadorDeImpostos();
        impostosMariana.registra(seguroDaMariana);
        impostosMariana.registra(ccDaMariana);

        ccDaMariana.setTitular(mariana);
        ccDaMariana.deposita(1000);
        cpDaMariana.setTitular(mariana);
        ccDaMariana.transfere(100, cpDaMariana);

        Cliente nero = new Cliente();
        nero.setNome("Nero");
		nero.setCpf("222.222.222.-22");
		nero.setProfissao("Programador");

        ContaCorrente ccDoNero = new ContaCorrente(6645, 969061);
        ContaPoupanca cpDoNero = new ContaPoupanca(6645, 969061-1);
        SeguroDeVida seguroDoNero = new SeguroDeVida();

        CalculadorDeImpostos impostosNero = new CalculadorDeImpostos();
        impostosNero.registra(seguroDoNero);
        impostosNero.registra(ccDoNero);


        ccDoNero.setTitular(nero);
        cpDoNero.setTitular(nero);
        ccDoNero.deposita(5000);
        ccDoNero.transfere(1000, cpDoNero);



        System.out.println("Agencia: " + ccDaMariana.getAgencia());
        System.out.println("Conta: " + ccDaMariana.getNumero());
        System.out.println("Nome: " + ccDaMariana.getTitular().getNome());
        System.out.println("Saldo: R$" + ccDaMariana.getSaldo());
        System.out.println("Conta Poupança R$" + cpDaMariana.getSaldo());
        System.out.println(impostosMariana.getTotalImposto());

        System.out.println();

        System.out.println("Agencia: " + ccDoNero.getAgencia());
        System.out.println("Conta: " + ccDoNero.getNumero());
        System.out.println("Nome: " + ccDoNero.getTitular().getNome());
        System.out.println("Saldo: R$" + ccDoNero.getSaldo());
        System.out.println("Conta Poupança R$" + cpDoNero.getSaldo());
        System.out.println(impostosNero.getTotalImposto());


    }

  
}