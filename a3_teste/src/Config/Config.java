package Config;

public class Config {

    /*Escrever uma classe que contenha, no mínimo, seis atributos, sendo um deles obrigatoriamente *id (int)
    
    Atributos*/
    private int id;
    private String senha_usuario;
    private int emergencia = 190; // ligar para a emergencia
    private String mensagem;// enviar mensagens para os contatos
    //private long numeros[] = new long[5];
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

    public int getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(int emergencia) {
        this.emergencia = emergencia;
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

    //Construtores    
}
