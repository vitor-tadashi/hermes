package br.com.tadashera.roadrunner;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UnitTest")
public class ApplicationTest {

    @Test
    @DisplayName("Should start application")
    public void shouldStart() {
        Application.main(null);
    }
}
