public class CriaConta {

    public static void main(String[] args) {
            //Cria Clientes ln Conta ln set conta
        Cliente mariana = new Cliente();
        mariana.setNome("Mariana Bello");
		mariana.setCpf("222.222.222.-22");
		mariana.setProfissao("Etéticista");

        Conta contaDaMariana = new Conta(6646, 969060);

        contaDaMariana.setTitular(mariana);
        contaDaMariana.deposita(1000);

        Cliente nero = new Cliente();
        nero.setNome("Nero");
		nero.setCpf("222.222.222.-22");
		nero.setProfissao("Programador");

        Conta contaDoNero = new Conta(6645, 969061);

        contaDoNero.setTitular(nero);
        contaDoNero.deposita(5000);


        System.out.println("Agencia: " + contaDaMariana.getAgencia());
        System.out.println("Conta: " + contaDaMariana.getNumero());
        System.out.println("Nome: " + contaDaMariana.getTitular().getNome());
        System.out.println("Saldo: R$" + contaDaMariana.getSaldo());

        System.out.println();

        System.out.println("Agencia: " + contaDoNero.getAgencia());
        System.out.println("Conta: " + contaDoNero.getNumero());
        System.out.println("Nome: " + contaDoNero.getTitular().getNome());
        System.out.println("Saldo: R$" + contaDoNero.getSaldo());


    }

}