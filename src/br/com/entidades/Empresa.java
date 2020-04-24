
package br.com.entidades;


public class Empresa {
    
  private Integer codigo, CEP, telefone, CGC;
  private String  nome, endereco, bairro, cidade, estado, UF, site, email;

    public Empresa() {
    }
  
    public Empresa(Integer codigo, Integer CEP, Integer telefone, Integer CGC, String nome, String endereco, String bairro, String cidade, String estado, String UF, String site, String email) {
        this.codigo = codigo;
        this.CEP = CEP;
        this.telefone = telefone;
        this.CGC = CGC;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.UF = UF;
        this.site = site;
        this.email = email;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getCEP() {
        return CEP;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public Integer getCGC() {
        return CGC;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getUF() {
        return UF;
    }

    public String getSite() {
        return site;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public void setCGC(Integer CGC) {
        this.CGC = CGC;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empresa{" + "codigo=" + codigo + ", CEP=" + CEP + ", telefone=" + telefone + ", CGC=" + CGC + ", nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", UF=" + UF + ", site=" + site + ", email=" + email + '}';
    }
  
    
}
