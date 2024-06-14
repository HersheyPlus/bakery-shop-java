package repositories;

import entities.Admin;
import java.util.List;
import java.util.Optional;

public interface AdminRepository {
    Admin save(Admin admin);
    Optional<Admin> findById(String id);
    List<Admin> findAll();
    void deleteById(String id);
    boolean existsById(String id);
}
