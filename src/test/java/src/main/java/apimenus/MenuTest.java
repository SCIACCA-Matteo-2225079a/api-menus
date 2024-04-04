package src.main.java.apimenus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    private Menu menu;

    @BeforeEach
    public void setUp() {
        menu = new Menu("Menu Test", 'c');
    }

    @Test
    public void testGetName() {
        assertEquals("Menu Test", menu.getName());
    }

    @Test
    public void testGetStatus() {
        assertEquals('c', menu.getStatus());
    }

    @Test
    public void testSetName() {
        menu.setName("New Name");
        assertEquals("New Name", menu.getName());
    }

    @Test
    public void testSetStatus() {
        menu.setStatus('l');
        assertEquals('l', menu.getStatus());
    }

    @Test
    public void testToString() {
        assertEquals("Menu{Nom = 'Menu Test', statut = c}", menu.toString());
    }
}

