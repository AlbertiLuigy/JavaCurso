package enunzinho;

import enunzinho.Pedido;
import enunzinho.en;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pedido NovoPedido = new Pedido(1025, new Date(), en.PROCESSO_DE_PAGAMENTO);

        System.out.println(NovoPedido);

        
        
    }
    
}
