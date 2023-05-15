package tutorial.pedidos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tutorial.pedidos.models.Status;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusDto {
    private Status status;
}
