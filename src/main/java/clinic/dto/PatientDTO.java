package clinic.dto;

import clinic.entities.enums.Gender;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class PatientDTO {

    private Integer id;

    //patient's second name
    private String secondName;

    //patient's first name
    private String firstName;

    //patient's middle name
    private String middleName;

    //patient's birthdate
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;

    //patient's gender
    private String gender;

    //patient's insurance policy number
    private String insurance;
}
