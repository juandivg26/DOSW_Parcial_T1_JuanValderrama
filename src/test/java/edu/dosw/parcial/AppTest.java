package edu.dosw.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void appShouldReturnExpectedMessage() {
        App app = new App();
        assertEquals("Proyecto Maven funcionando correctamente.", app.getMessage());
    }
}
