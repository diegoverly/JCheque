/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cheque.dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Server
 */
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
 
            return null;
  
        }

    }


}