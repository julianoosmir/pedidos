package tutorial.pedidos.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import tutorial.pedidos.dtos.PagamentoDTO;

@Component
public class PagamentoListener {

    @RabbitListener(queues = "pagamentos.detalhes-pedido")
    public void recebeMensagem(PagamentoDTO pagamentoDTO){
        System.out.println("Recebi a Mensagem: + " + pagamentoDTO.toString());
    }
}
