package sk.jaro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Dao {
    private Connection conn = null;
    private PropertiesReader propertiesReader = new PropertiesReader();

    Dao() throws SQLException{
        String user = propertiesReader.getProperty(PropertiesReader.ORACLE_USER);
        String psw = propertiesReader.getProperty(PropertiesReader.ORACLE_PSW);
        connect(user,psw);
    }

    private void connect(String usr, String pwd) throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        conn = DriverManager.getConnection(getConnectioUrl(),usr,pwd);

        if(conn!=null) {
            conn.setAutoCommit(false);
        }else{
            throw new SQLException("Connection is null");
        }
    }

    private String getConnectioUrl() {
        String host = propertiesReader.getProperty(PropertiesReader.ORACLE_HOST);
        String port = propertiesReader.getProperty(PropertiesReader.ORACLE_PORT);
        String dbname = propertiesReader.getProperty(PropertiesReader.ORACLE_DB_NAME);

        return String.format("jdbc:oracle:thin:@%s:%s:%s", host, port, dbname);
    }

    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
//            LOG.error("Can not close connection.",e);
        }
    }

    public void commit(){
        try {
            conn.commit();
        } catch (SQLException e) {
//            LOG.error("Can not commit transaction in connection.",e);
        }
    }

    public void rollBack(){
        try {
            conn.rollback();
        } catch (SQLException e) {
//            LOG.error("Can not roll back transaction in connection.",e);
        }
    }

    public Connection getConn() {
        return conn;
    }



}
