package entities;
import static helper.GenerateId.generateAdminId;

public class Admin {
    private final String adminId;
    private String adminName;
    private String adminEmail;
    private String adminPhone;
    private String adminPassword;


    //! load data from file or database
    public Admin(String adminId, String adminName, String adminEmail, String adminPhone,String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPhone = adminPhone;
        this.adminPassword = adminPassword;
    }

    //! create data before save to file or database
    public Admin(String adminName, String adminEmail, String adminPhone,String adminPassword) {
       this(generateAdminId(),adminName,adminEmail,adminPhone,adminPassword);
    }


    public String getAdminId() {return adminId;}

    public String getAdminName() {return adminName;}

    public String getAdminEmail() {return adminEmail;}

    public String getAdminPhone() {return adminPhone;}

    public String getAdminPassword() {return adminPassword;}

    public void setAdminName(String adminName) {this.adminName = adminName;}

    public void setAdminEmail(String adminEmail) {this.adminEmail = adminEmail;}

    public void setAdminPhone(String adminPhone) {this.adminPhone = adminPhone;}

    public void setAdminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return String.format("Admin{id: %s, name: '%s', email: '%s', phone: %s,}", adminId, adminName, adminEmail,
                adminPhone);
    }
}
