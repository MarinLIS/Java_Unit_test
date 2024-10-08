package src.seminars.homeworks.hw_3.task_3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.seminars.main.hw_3.User;
import src.seminars.main.hw_3.UserRepository;

public class UserRepositoryAdminTest {

    @Test
    void testLogoutAllNonAdmins() {
        UserRepository userRepository = new UserRepository();

        User admin = new User("admin", "adminPass", true, true);
        User user_01 = new User("user_01", "password_01", true, false);
        User user_02 = new User("user_02", "password_02", true, false);
        User user_03 = new User("user_03", "password_03", true, false);


        userRepository.addUser(admin);
        userRepository.addUser(user_01);
        userRepository.addUser(user_02);
        userRepository.addUser(user_03);

        userRepository.logoutAllNonAdmins();

        Assertions.assertTrue(admin.getAuthentication());
        Assertions.assertFalse(user_01.getAuthentication());
        Assertions.assertFalse(user_02.getAuthentication());
        Assertions.assertFalse(user_03.getAuthentication());
    }
}