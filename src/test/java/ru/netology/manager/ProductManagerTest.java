package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager(new ProductRepository());
    private Book first = new Book(88, "Калечина-Малечина", 320, "Евгения Некрасова");
    private Smartphone second = new Smartphone(123, "Galaxy A10", 8000,"Samsung");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
    }

    @Test
    public void shouldSearchByName() {
        Product[] expected = {first};
        Product[] actual = manager.searchBy("Калечина-Малечина");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAuthor() {
        Product[] expected = {first};
        Product[] actual = manager.searchBy("Евгения Некрасова");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByProduction() {
        Product[] expected = {second};
        Product[] actual = manager.searchBy("Samsung");

        assertArrayEquals(expected, actual);
    }

}