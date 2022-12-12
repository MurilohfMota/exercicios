public class conta {
  private String numero;
  private double saldo;

  public String getNumero(){
    return this.numero;
  }
  public double getSaldo(){
    return this.saldo;
  }

  public void setNumero(String numero){
    this.numero = numero;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  //--------metodos de transiçao------\\

  public boolean creditar(double saldo){
    if(saldo>0){
      this.setSaldo(saldo);
      return true;
    }
    else{return false;
    }
  }
  public boolean debitar(double saldo){
    if(saldo > this.saldo){
      return false;
    }
    else{
      this.setSaldo((this.saldo - saldo));
      return true;
    }
  }
}
