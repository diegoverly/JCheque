
package br.com.cheque.dal;

import java.sql.Connection;
import java.sql.DriverManager;


public class ModuloConexao {
    


    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "org.firebirdsql.jdbc.FBDriver";
                 

        try {

            Class.forName(driver);

            //executa o arquivo do driver

            conexao = DriverManager.getConnection("jdbc:firebirdsql://localhost:3050/C:\\DadosPortuga\\CONTAB.FDB", "SYSDBA", "masterkey");
            //jdbc:firebirdsql://localhost/c:/DadosPortuga/contab.fdb

            System.out.println (driver);
                  
                     
               return conexao;
 
           } catch (Exception e) {
             e.printStackTrace();
            return null;
          }

    }


}