
import fatec.poo.model.Vendedor;

/**
 * @author Richard
 */

public class AplicTeste {

    public static void main(String[] args) {
        
        
        //Teste de % taxa de comissao (Funcionando)
        Vendedor vddr = new Vendedor("14325", "nome", 1000);
        vddr.setTaxaComissao(25);
        System.out.println("Tx" + vddr.getTaxaComissao());
        
        
        
    }   
}
