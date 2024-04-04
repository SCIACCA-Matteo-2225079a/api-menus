package src.main.java.apimenus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MenuApplicationTest {

    @Test
    public void testOpenDbConnection() {
        MenuApplication menuApp = new MenuApplication();
        MenuRepositoryInterface mockedRepo = mock(MenuRepositoryInterface.class);
        when(menuApp.openDbConnection()).thenReturn(mockedRepo);
        assertEquals(mockedRepo, menuApp.openDbConnection());
    }

    @Test
    public void testCloseDbConnection() {
        MenuApplication menuApp = new MenuApplication();
        MenuRepositoryInterface mockedRepo = mock(MenuRepositoryInterface.class);
        menuApp.closeDbConnection(mockedRepo);
        verify(mockedRepo, times(1)).close();
    }
}

