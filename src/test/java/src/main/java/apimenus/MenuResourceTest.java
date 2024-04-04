package src.main.java.apimenus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuResourceTest {

    private MenuResource menuResource;
    private MenuService mockedMenuService;

    @BeforeEach
    public void setUp() {
        mockedMenuService = mock(MenuService.class);
        menuResource = new MenuResource(mockedMenuService);
    }

    @Test
    public void testGetAllMenus() {
        String mockJsonResponse = "[{\"name\":\"Menu 1\",\"status\":\"c\"},{\"name\":\"Menu 2\",\"status\":\"l\"}]";
        when(mockedMenuService.getAllMenusJSON()).thenReturn(mockJsonResponse);
        String actualJsonResponse = menuResource.getAllMenus();
        assertEquals(mockJsonResponse, actualJsonResponse);
    }
}
