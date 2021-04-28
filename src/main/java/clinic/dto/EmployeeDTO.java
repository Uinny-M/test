package clinic.dto;


public class EmployeeDTO {
    private Integer id;

    //patient's second name
    private String secondName;

    //patient's first name
    private String firstName;

    //patient's middle name
    private String middleName;

    //type of medical employee (doctor/nurse)
    private String position;

    //login for auth
    private String login;

    //password for auth
    private String password;

    //is the employee deleted
    private boolean isDeleted;

    //employee's role
    private String role;
}
