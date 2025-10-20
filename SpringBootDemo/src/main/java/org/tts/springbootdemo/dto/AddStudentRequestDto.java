package org.tts.springbootdemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class AddStudentRequestDto {
    @NotBlank(message = "Name must not be blank")
    @Size(min = 3, max = 255, message = "Name must be between 3 and 255 characters")
    private String name;
    @Email
    @NotBlank(message = "Email must not be blank")
    private String email;

}
