package si.laurentius.msh.ws.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SEDRequestUtilsTest {

    @Test
    public void testIsNotValidMailAddress() {
        // given
        List<String> emails = Arrays.asList(null,
                "test@test-sed.si",
                "good@example.com",
        "very.good@example.co.in",
        "good1@example.me.org",
        "mr_good@example.com",
        "miss-good@example.com");

        for (String emailAddress: emails){
            // when then
            assertFalse("Email ["+emailAddress+"] is valid but validators returns as not valid!", SEDRequestUtils.isNotValidMailAddress(emailAddress));
        }
    }

    @Test
    public void testIsNotValidMailAddressInvalid() {
        // given
        List<String> emails = Arrays.asList("test",
                "@test-sed.si",
                "example.com",
                "very..good@example.co.in",
                "good1@example_si.org"
                );

        for (String emailAddress: emails){
            // when then
            assertTrue("Email ["+emailAddress+"] is valid but validators returns as not valid!", SEDRequestUtils.isNotValidMailAddress(emailAddress));
        }
    }
}