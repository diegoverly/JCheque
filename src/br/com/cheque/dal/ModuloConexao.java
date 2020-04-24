package br.com.cheque.dal;

import static com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    
    public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(new JFrame(),"Erro ao fechar a conexão. \n"+e.getMessage(),"Erro de conexão",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
    
    
    
    public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(new JFrame(),"Erro ao fechar statement. \n"+e.getMessage(),"Erro de statement",JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(new JFrame(),"Erro ao fechar resultset. \n"+e.getMessage(),"Erro de Resultset",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
    
    

}