package src.main.java.apimenus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class MenuRepositoryInterfaceTest {

    @Test
    public void testClose() {
        MenuRepositoryInterface menuRepo = mock(MenuRepositoryInterface.class);
        menuRepo.close();
        verify(menuRepo, times(1)).close();
    }

    @Test
    public void testGetAllMenus() {
        MenuRepositoryInterface menuRepo = mock(MenuRepositoryInterface.class);
        ArrayList<Menu> mockMenuList = new ArrayList<>();
        mockMenuList.add(new Menu("Menu 1", 'c'));
        mockMenuList.add(new Menu("Menu 2", 'l'));
        when(menuRepo.getAllMenus()).thenReturn(mockMenuList);
        assertEquals(mockMenuList, menuRepo.getAllMenus());
    }

    @Test
    public void testUpdateMenu() {
        MenuRepositoryInterface menuRepo = mock(MenuRepositoryInterface.class);
        String newName = "Menu 3";
        char newStatus = 'c';
        when(menuRepo.updateMenu(newName, newStatus)).thenReturn(true);
        assertTrue(menuRepo.updateMenu(newName, newStatus));
        when(menuRepo.updateMenu("Inexistant Menu", 'l')).thenReturn(false);
        assertFalse(menuRepo.updateMenu("Inexistant Menu", 'l'));
    }
}

