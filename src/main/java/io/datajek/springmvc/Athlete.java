package io.datajek.springmvc;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Athlete {

    @NotNull(message="This is a required field.")
    @Min(value=1, message="Value must be greater than or equal to 1.")
    @Max(value=100, message="Value must be lower than or equal to 100.")
    private Integer rank;

    private String firstName;
    @NotNull(message = "This is a required field.")
    @Size(min=1, message = "This is a required field.")
    private String lastName;
    private String country;

    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Past(message = "Date must be in the past.")
    private Date lastWon;

    @Pattern(regexp="^\\$([0-9]{1,3},([0-9]{3},)*[0-9]{3})$", message = "Incorrect format")
    private String prizeMoney;

    public Athlete(){}

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastWon() {
        return lastWon;
    }

    public void setLastWon(Date lastWon) {
        this.lastWon = lastWon;
    }

    public String getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(String prizeMoney) {
        this.prizeMoney = prizeMoney;
    }
}
