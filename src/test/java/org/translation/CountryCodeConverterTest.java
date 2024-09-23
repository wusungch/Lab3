package org.translation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountryCodeConverterTest {

    @Test
    public void fromCountryCodeUsa() {
        CountryCodeConverter converter = new CountryCodeConverter();
        assertEquals("United States of America (the)", converter.fromCountryCode("usa"));
    }

    @Test
    public void fromCountryCodeAllLoaded() {
        CountryCodeConverter converter = new CountryCodeConverter();
        assertEquals(249, converter.getNumCountries());
    }
}
