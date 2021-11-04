package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    Product[] product = new Product[]{};
    private Book first = new Book(88, "Калечина-Малечина", 320, "Евгения Некрасова");
    private Smartphone second = new Smartphone(123, "Galaxy A10", 8000,"Samsung");

   @Test
    public void shouldTestBookMatches() {

       boolean actual = Book.matches("Евгения Некрасова");

       assertTrue(actual);
    }

}
