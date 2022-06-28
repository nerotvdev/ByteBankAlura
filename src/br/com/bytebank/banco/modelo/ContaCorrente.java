package br.com.bytebank.banco.modelo;
public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca (double valor) {
        double ValorASacar = valor + 0.2;
        return super.saca(ValorASacar);
    }
    
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
    
    @Override
    public String toString() {
        return "Conta Corrente:\n" + super.toString();
    }


}
