package lista_exercicios_26_02_to_05_03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TestDriverTest {

    @Test
    void addOne() {
        Assertions.assertEquals(3, TestDriver.addOne(3));
    }
}