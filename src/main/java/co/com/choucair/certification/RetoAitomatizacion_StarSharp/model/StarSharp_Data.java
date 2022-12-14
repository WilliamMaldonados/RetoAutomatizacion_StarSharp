package co.com.choucair.certification.RetoAitomatizacion_StarSharp.model;

public class StarSharp_Data {

    public String getMeetName() {
        return meetName;
    }

    public void setMeetName(String meetName) {
        this.meetName = meetName;
    }

    public String getMeetNumber() {
        return meetNumber;
    }

    public void setMeetNumber(String meetNumber) {
        this.meetNumber = meetNumber;
    }

    public String getMeetDateStart() {
        return meetDateStart;
    }

    public void setMeetDateStart(String meetDateStart) {
        this.meetDateStart = meetDateStart;
    }

    public String getMeetDateEnd() {
        return meetDateEnd;
    }

    public void setMeetDateEnd(String meetDateEnd) {
        this.meetDateEnd = meetDateEnd;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String meetName;
    private String meetNumber;
    private String meetDateStart;
    private String meetDateEnd;

    private String User;
    private String Password;


}
