package clinic.dto;

import clinic.entities.enums.ManipulationType;

import javax.persistence.*;

public class ManipulationDTO {

    private byte id;

    //name of manipulation
    private String title;

    //type of manipulation
    private ManipulationType type;

    //is the manipulation deleted
    private boolean isDeleted;
}
