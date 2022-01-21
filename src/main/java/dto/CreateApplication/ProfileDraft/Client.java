package dto.CreateApplication.ProfileDraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data

public class Client {

    //private String lastName;
   // private int loanSum;

    private Spouse spouse;
    private ContactPerson contactPerson;
    private RegistrationAddress registrationAddress;
    private ActualAddress actualAddress;
    private Employment employment;


    private String passportBirthPlace;
    private String passportOfficeCode;
    private String passportOffice;
    private String passportOldSeriesNumber;
    private boolean nameChanged;
    private String previousFirstName;
    private String previousLastName;
    private String previousMiddleName;
    private String maritalStatus;



    private boolean addressEquals;


   // private Boolean basicEs;



}