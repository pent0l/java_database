package pbo.java.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatmentTest {

    @Test
    void testCreateStatment() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        statement.close();
        connection.close();
    }

    @Test
    void testExecuteUpdate() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
                INSERT INTO mahasiswa(nim, nama, jurusan, tlp)
                VALUES ('SI17200013', 'Baiq Indri Astuti', 'Sistem Informasi', '081908908944')
                """;

        int update = statement.executeUpdate(sql);
        System.out.println(update);
        statement.close();
        connection.close();
    }
}
