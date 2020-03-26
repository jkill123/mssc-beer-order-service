package pinchuk.sfg.brewery.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 26/03/2020 - 10:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidateOrderResult {
    private UUID orderId;
    private Boolean isValid;
}
