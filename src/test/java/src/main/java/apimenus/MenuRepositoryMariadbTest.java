/*package src.main.java.apimenus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.*;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuRepositoryMariadbTest {

    private MenuRepositoryMariadb menuRepo;
    private Connection mockedConnection;
    private PreparedStatement mockedPreparedStatement;
    private ResultSet mockedResultSet;

    @BeforeEach
    public void setUp() throws SQLException {
        mockedConnection = mock(Connection.class);
        mockedPreparedStatement = mock(PreparedStatement.class);
        mockedResultSet = mock(ResultSet.class);
        menuRepo = new MenuRepositoryMariadb(mockedConnection, "jdbc:mariadb://mysql-api-menus.alwaysdata.net/api-menus_db", "api-menus", "B1N0F0jHhMTQEH7");
        when(mockedConnection.prepareStatement(anyString())).thenReturn(mockedPreparedStatement);
        when(mockedPreparedStatement.executeQuery()).thenReturn(mockedResultSet);
    }

    @Test
    public void testClose() throws SQLException {
        menuRepo.close();
        verify(mockedConnection, times(1)).close();
    }

    @Test
    public void testGetAllMenus() throws SQLException {
        ArrayList<Menu> mockMenuList = new ArrayList<>();
        mockMenuList.add(new Menu("Menu 1", 'c'));
        mockMenuList.add(new Menu("Menu 2", 'l'));

        when(mockedResultSet.next()).thenReturn(true, true, false);
        when(mockedResultSet.getString("name")).thenReturn("Menu 1", "Menu 2");
        when(mockedResultSet.getString("status")).thenReturn("c", "l");
        assertEquals(mockMenuList, menuRepo.getAllMenus());
    }

    @Test
    public void testUpdateMenu() throws SQLException {
        when(mockedPreparedStatement.executeUpdate()).thenReturn(1);
        assertTrue(menuRepo.updateMenu("Menu 1", 'c'));

        when(mockedPreparedStatement.executeUpdate()).thenReturn(0);
        assertFalse(menuRepo.updateMenu("Inexistant Menu", 'l'));
    }
}*/
