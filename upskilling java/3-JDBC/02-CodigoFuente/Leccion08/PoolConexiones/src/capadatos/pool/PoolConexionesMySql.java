package capadatos.pool;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class PoolConexionesMySql {

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("admin");
        ds.setUrl("jdbc:mysql://localhost:3306/sga?useSSL=false");
        //Definimos el tamano del pool de conexiones
        ds.setInitialSize(5);//5 Conexiones iniciales
        return ds;
    }
    
    public static Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
    }
}
