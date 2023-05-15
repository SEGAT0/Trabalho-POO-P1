
package fatec.poo.model;

/**
 * @author Richard
 */
public class ItemPedido {
    
    private int sequencia; 
    private double qtdVendida;
    
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int sequencia, double qtdVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdVendida = qtdVendida;
        this.produto = produto;
    }

    public void setQtdVendida(double qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdVendida() {
        return qtdVendida;
    }
    
    
}
