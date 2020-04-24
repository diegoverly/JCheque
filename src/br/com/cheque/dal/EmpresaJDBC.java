package br.com.cheque.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import br.com.entidades.Empresa;

public class EmpresaJDBC {

    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    public EmpresaJDBC() {

    }

    public Empresa PesquisaPorCodigo(Integer codigo) throws Exception {

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
            throw new Exception(e);
        } finally {
            ModuloConexao.closeStatement(st);
            ModuloConexao.closeResultSet(rs);
            ModuloConexao.closeConnection(conn);
        }
    }

    public void InserirEmpresa(Empresa obj) throws Exception {
        PreparedStatement st = null;
        try {
            conn = ModuloConexao.conector();
            st = conn.prepareStatement(
                    "INSERT INTO EMPRESAS "
                    + "(EMP_CODIGO, EMP_NOME, EMP_ENDERECO, EMP_BAIRRO, EMP_CIDADE, EMP_ESTADO, EMP_UF, EMP_CEP, EMP_TELEFONE, EMP_CGC, EMP_SITE, EMP_EMAIL) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            st.setObject(1, obj.getCodigo());
            st.setString(2, obj.getNome());
            st.setString(3, obj.getEndereco());
            st.setString(4, obj.getBairro());
            st.setString(5, obj.getCidade());
            st.setString(6, obj.getEstado());
            st.setString(7, obj.getUF());
            st.setObject(8, obj.getCEP());
            st.setObject(9, obj.getTelefone());
            st.setObject(10, obj.getCGC());
            st.setString(11, obj.getSite());
            st.setString(12, obj.getEmail());
             

            st.executeUpdate();

            JOptionPane.showMessageDialog(new JFrame(), "Cadastro realizado com sucesso.");

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            ModuloConexao.closeStatement(st);
            ModuloConexao.closeConnection(conn);
        }
    }

}
