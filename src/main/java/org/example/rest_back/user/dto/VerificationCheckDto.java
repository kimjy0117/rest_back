package org.example.rest_back.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class VerificationCheckDto {
    private String email;
    private String code;
}
