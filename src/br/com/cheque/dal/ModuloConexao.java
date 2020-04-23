package br.com.cheque.dal;

import static com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ModuloConexao {

    public static Connection conector() throws Exception {
        java.sql.Connection conexao = null;
        final String driver = "org.firebirdsql.jdbc.FBDriver";

        try {

            Class.forName(driver);

            //executa o arquivo do driver
            Properties props = loadProperties();
            String url = props.getProperty("dburl");

            conexao = DriverManager.getConnection(url, props);
            

            return conexao;

        } catch (Exception e) {
            e.printStackTrace();            
            return null;
        }

    }

    private static Properties loadProperties() throws Exception {

        try (InputStream inputStream = getResourceAsStream("Jprop.properties")) {
            Properties props = new Properties();
            props.load(inputStream);
            return props;
        } catch (IOException e) {
            throw new Exception(e.getMessage());
        }

    }

}