package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.SmartPhone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ProductManagerTest {
    Product first = new SmartPhone(1, "XS", 100000, "Apple");
    Product second = new SmartPhone(2, "I6", 50000, "Lenovo");
    Product third = new SmartPhone(3, "S6", 75000, "Samsung");
    Product fourth = new SmartPhone(4, "A5", 25000, "Huawei");
    Product fifth = new Book(5, "Singer", 2000, "Rob Snider");
    Product sixth = new Book(6, "Birds", 3000, "Stiven King ");
    Product seventh = new Book(7, "Jaws", 4000, "Piter Benchly");
    private ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    @BeforeEach
    public void setUp() {
        manager.addProduct(first);
        manager.addProduct(second);
        manager.addProduct(third);
        manager.addProduct(fourth);
        manager.addProduct(fifth);
        manager.addProduct(sixth);
        manager.addProduct(seventh);

    }

    @Test
    public void shouldBySearchNameBook() {
        String search = "Birds";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{sixth};

        assertArrayEquals(expected, actual);
    }


}
