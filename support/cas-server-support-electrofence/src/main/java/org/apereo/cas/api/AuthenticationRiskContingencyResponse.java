package org.apereo.cas.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.webflow.execution.Event;
import lombok.ToString;

/**
 * This is {@link AuthenticationRiskContingencyResponse}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
@Slf4j
@Data
@AllArgsConstructor
public class AuthenticationRiskContingencyResponse {
    private Event result;
}
