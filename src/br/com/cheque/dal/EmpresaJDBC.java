package br.com.cheque.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import br.com.entidades.Empresa;

public class EmpresaJDBC {

    public EmpresaJDBC() {

    }

    public Empresa PesquisaPorCodigo(Integer codigo) throws Exception {

        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = ModuloConexao.conector();
            st = conn.prepareStatement(
                    "SELECT * FROM EMPRESAS WHERE EMP_CODIGO = ?");
            st.setInt(1, codigo);
            rs = st.executeQuery();
            if (rs.next()) {
                Empresa obj = new Empresa();
                obj.setCodigo(rs.getInt("EMP_CODIGO"));
                obj.setNome(rs.getString("EMP_NOME"));
                obj.setEndereco(rs.getString("EMP_ENDERECO"));
                obj.setBairro(rs.getString("EMP_BAIRRO"));
                obj.setCidade(rs.getString("EMP_CIDADE"));
                obj.setEstado(rs.getString("EMP_ESTADO"));
                obj.setUF(rs.getString("EMP_UF"));
                obj.setCEP(rs.getInt("EMP_CEP"));
                obj.setTelefone(rs.getInt("EMP_TELEFONE"));
                obj.setCGC(rs.getInt("EMP_CGC"));
                obj.setSite(rs.getString("EMP_SITE"));
                obj.setEmail(rs.getString("EMP_EMAIL"));
                return obj;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Erro ao consultar por código. \n" + e.getMessage(), "Erro de consulta", JOptionPane.ERROR_MESSAGE);
            throw new Exception (e);
        } finally {
            ModuloConexao.closeConnection(conn);
            ModuloConexao.closeStatement(st);
            ModuloConexao.closeResultSet(rs);
        }
    }

}
