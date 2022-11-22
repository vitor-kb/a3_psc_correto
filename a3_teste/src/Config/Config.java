package Config;

public class Config {

    /*Escrever uma classe que contenha, no mínimo, seis atributos, sendo um deles obrigatoriamente *id (int)
    
    Atributos*/
    private int id;
    private int teclado_numerico; // realizar ligações
    private int emergencia; // ligar para a emergencia
    private String mensagem;// enviar mensagens para os contatos
    private String[] contatos = {"Vitor", "Raul", "Matheus", "Leandro","Biel"};
    //private long numeros[] = new long[5];
    private String escolha;

    public String[] getContatos() {
        return contatos;
    }

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

    public int getTeclado_numerico() {
        return teclado_numerico;
    }

    public void setTeclado_numerico(int teclado_numerico) {
        this.teclado_numerico = teclado_numerico;
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

    //Construtores

    

}
