package src.main.java.apimenus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuServiceTest {

    private MenuService menuService;
    private MenuRepositoryInterface mockedMenuRepo;

    @BeforeEach
    public void setUp() {
        mockedMenuRepo = mock(MenuRepositoryInterface.class);
        menuService = new MenuService(mockedMenuRepo);
    }

    @Test
    public void testGetAllMenusJSON() {
        ArrayList<Menu> mockMenuList = new ArrayList<>();
        mockMenuList.add(new Menu("Menu 1", 'c'));
        mockMenuList.add(new Menu("Menu 2", 'l'));
        when(mockedMenuRepo.getAllMenus()).thenReturn(mockMenuList);
        String jsonResponse = menuService.getAllMenusJSON();
        assertNotNull(jsonResponse);
    }

    @Test
    public void testUpdateMenu() {
        Menu mockMenu = new Menu("Menu 1", 'c');
        when(mockedMenuRepo.updateMenu(mockMenu.getName(), mockMenu.getStatus())).thenReturn(true);
        boolean result = menuService.updateMenu(mockMenu);
        assertTrue(result);

        when(mockedMenuRepo.updateMenu("Inexistant Menu", 'l')).thenReturn(false);
        result = menuService.updateMenu(new Menu("Inexistant Menu", 'l'));
        assertFalse(result);
    }
}
