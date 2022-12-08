/*
package testentities;

import entities.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUser {

    CommonUser user = new CommonUser("firstname", "lastname", "emailid", "password");
    @Test(timeout = 500)
    public void testConstructor() {
        // tests if the first name after creating the User object is equal
        String firstname = "Ken";
        String lastname = "Evans";
        String email = "kenevans111@gmail.com";
        String password = "kdljwlkj.1";
        CommonUser example = new CommonUser(firstname, lastname, email, password);

        // assertion
        assertEquals(firstname, example.getFirstName());
        assertEquals(lastname, example.getLastName());
        assertEquals(email, example.getEmailAddress());
        assertEquals(password, example.getPassword());
        assertEquals(new HabitFactory(), example.getHabitCollection());
        assertEquals(new CategoryCollection(), example.getCategoryCollection());
        assertEquals(new TaskFactory(), example.getTaskCollection());
        assertEquals(new Timer(), example.getTomato());

    }

    @Test(timeout = 500)
    public void testSetUserFirstName() {
        // tests if the User's first name set in the User Object is equal
        String firstname = "Ken";
        user.setFirstName(firstname);
        // assertion
        assertEquals(firstname, user.getFirstName());
    }

    @Test(timeout = 500)
    public void testSetUserLastName() {
        // tests if the last name set in the User Object is equal
        String lastname = "Stevens";
        user.setEmailAddress(lastname);
        // assertion
        assertEquals(lastname, user.getLastName());
    }

    @Test(timeout = 500)
    public void testSetUserEmailAddress() {
        // tests if the email address set in the User Object is equal
        String email = "kenstevens@gmail.com";
        user.setEmailAddress(email);
        // assertion
        assertEquals(email, user.getEmailAddress());
    }


    @Test(timeout = 500)
    public void testSetUserPassword() {
        // tests if the user password set in the User Object is equal
        String password = "jnkwdm.22";
        user.setPassword(password);
        // assertion
        assertEquals(password, user.getPassword());
    }


}
*/
