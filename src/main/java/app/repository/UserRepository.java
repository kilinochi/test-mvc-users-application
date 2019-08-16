package app.repository;

import app.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("select distinct login from User")
    Iterable <User>  getAllUsers();
    User findByUsername(String username);
}