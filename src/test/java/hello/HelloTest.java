package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** A first test. If ./mvnw test reports "Tests run: 1, Failures: 0", your setup works. */
class HelloTest {
    @Test
    void greetsByName() {
        assertEquals("Hello, Reet!", Hello.greeting("Reet"));
    }
}
