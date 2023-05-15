package tutorial.pedidos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDoPedidoDto {

    private Long id;
    private Integer quantidade;
    private String descricao;
}