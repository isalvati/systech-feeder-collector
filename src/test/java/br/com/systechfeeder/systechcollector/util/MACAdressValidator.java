package br.com.systechfeeder.systechcollector.util;

import br.com.systechfeeder.systechcollector.util.validation.MACAddressValidator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MACAdressValidator {
    MACAddressValidator validator = new MACAddressValidator();

    @Test
    public void macValidTest() {
        String mac = "AA-BB-CC-DD-EE-FF";
        Assert.assertTrue(validator.isValid(mac, null));
    }

    @Test
    public void macInvalidTest() {
        String mac = "AA-BB-GG-DD-EE-FF";
        Assert.assertFalse(validator.isValid(mac, null));
    }
}
