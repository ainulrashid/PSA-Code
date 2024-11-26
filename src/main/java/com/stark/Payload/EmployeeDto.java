package com.stark.Payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/*EmployeeDto is a simplified version of the Employee data used to transfer only needed information
without exposing database details. Lombok @Getter and @Setter automatically create methods to access
fields, keeping the code clean and secure.*/

@Getter@Setter
public class EmployeeDto {
    private Long id;

    @NotBlank
    @Size(min = 3, message="At least 3 chars required")
    private String name;

    @Email
    private String emailId;

    @Size(min=10,max=10, message="At least 10 digits")
    private String mobile;
}
