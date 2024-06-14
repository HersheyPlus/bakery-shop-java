package services;

import entities.Admin;
import java.util.List;

public interface AdminService {
    Admin createAdmin(String adminName, String adminEmail, String adminPhone,String adminPassword);
    Admin getAdminById(String adminId);
    List<Admin> getAllAdmins();
    Admin updateAdmin(String adminId, String newAdminName, String newAdminEmail, String newAdminPhone,String newAdminPassword);
    void deleteAdmin(String adminId);
}
