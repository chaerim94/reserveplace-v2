package reserveplace.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import reserveplace.domain.*;
import reserveplace.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationCancelConfirmed extends AbstractEvent {

    private Long id;

    public ReservationCancelConfirmed(ReservationManagement aggregate) {
        super(aggregate);
    }

    public ReservationCancelConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event
