
package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Richard
 */
public class Cliente extends Pessoa {
    private double limiteCred, limiteDisp;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double LimiteCred) {
        super(cpf, nome);
        this.limiteCred = LimiteCred;
        pedidos = new ArrayList<Pedido>();
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
}
