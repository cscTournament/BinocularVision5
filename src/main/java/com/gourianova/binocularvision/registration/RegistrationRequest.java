package com.gourianova.binocularvision.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String first_name;
    private final String last_name;
    private final String login;
    private final String password;
    private final BigDecimal balance;
}
