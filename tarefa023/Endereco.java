public class Endereco {
    private String complementoEndereco;
    private Integer CEP;
    private TipoEndereco tipoEndereco; 
    private Logradouro logradouro;
    private int numero;
    private String complementoNumero; 
   

    public Endereco(int numero, String complementoNumero, String complementoEndereco, Integer CEP, TipoEndereco tipoEndereco, Logradouro logradouro) {
        this.numero = numero;
        this.complementoNumero = complementoNumero;
        this.complementoEndereco = complementoEndereco;
        this.CEP = CEP;
        this.tipoEndereco = tipoEndereco;
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplementoNumero() {
        return this.complementoNumero;
    }

    public void setComplementoNumero(String complementoNumero) {
        this.complementoNumero = complementoNumero;
    }

    public String getComplementoEndereco() {
        return this.complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public Integer getCEP() {
        return this.CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public TipoEndereco getTipoEndereco() {
        return this.tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Logradouro getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

}
