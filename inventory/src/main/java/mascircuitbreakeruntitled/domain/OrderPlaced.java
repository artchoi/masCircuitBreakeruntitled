package mascircuitbreakeruntitled.domain;

import java.util.*;
import lombok.*;
import mascircuitbreakeruntitled.domain.*;
import mascircuitbreakeruntitled.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private Long customerId;
}
