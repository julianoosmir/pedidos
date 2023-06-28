package tutorial.pedidos.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PagamentoDTO {
    private long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private StatusDepagamento status;
    private Long pedidoId;
    private Long formaPagamentoId;

    @Override
    public String toString() {
        return "PagamentoDTO{" +
                "id=" + id +
                ", valor=" + valor +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", expiracao='" + expiracao + '\'' +
                ", codigo='" + codigo + '\'' +
                ", status=" + status +
                ", pedidoId=" + pedidoId +
                ", formaPagamentoId=" + formaPagamentoId +
                '}';
    }
}
