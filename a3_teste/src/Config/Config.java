package Config;

public class Config {

    /*Escrever uma classe que contenha, no mínimo, seis atributos, sendo um deles obrigatoriamente *id (int)
    
    Atributos*/
    private int id;
    private String senha_usuario;
    private String policia = "190"; // ligar para a policia
    private String samu = "192";
    private String mensagem;// enviar mensagens para os contatos
    private String escolha;

    /*public long[] getNumeros() {
        return numeros;
    }

    public void setNumeros(long[] numeros) {
        this.numeros = numeros;
    }*/
    //Metodos acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicia() {
        return policia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getSamu() {
        return samu;
    }

    //Construtores    
}
