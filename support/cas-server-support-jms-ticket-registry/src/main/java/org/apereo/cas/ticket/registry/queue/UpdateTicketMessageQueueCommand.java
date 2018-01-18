package org.apereo.cas.ticket.registry.queue;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.StringBean;
import org.apereo.cas.ticket.Ticket;
import org.apereo.cas.ticket.registry.TicketRegistry;

/**
 * This is {@link UpdateTicketMessageQueueCommand}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
@Slf4j
@Getter
public class UpdateTicketMessageQueueCommand extends BaseMessageQueueCommand {

    
    @JsonProperty
    private Ticket ticket;

    @JsonCreator
    public UpdateTicketMessageQueueCommand(@JsonProperty("id") final StringBean id, @JsonProperty("ticket") final Ticket ticket) {
        super(id);
        this.ticket = ticket;
    }

    @Override
    public void execute(final TicketRegistry registry) {
        LOGGER.debug("Executing queue command on ticket registry id [{}] to update ticket [{}]", ticket);
        registry.updateTicket(ticket);
    }
}
