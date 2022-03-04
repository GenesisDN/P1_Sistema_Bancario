import java.util.AbstractCollection;

public class Client {
    private String name;
    private int age;
    private int numChildren;
    private double quantidadeDinero;
    private Account account;

    public Client (String name, int age, int numChildren, double quantidadeDinero){
        this.age = age;
        this.name = name;
        this.numChildren = numChildren;
        this.quantidadeDinero = quantidadeDinero;
    }

    public String getName (){ return name; }
    public double getQuantidadeDinero() { return quantidadeDinero; }
    public int getAge(){ return age;}
    public int getNumChildren() { return numChildren; }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }
    public void setQuantidadeDinero(double quantidadeDinero) {
        this.quantidadeDinero = quantidadeDinero;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean criarConta(){ //Booleano para fazer o teste mais facil
        boolean check = false;
        if(this.account != null){
            Account newAccount = new Account(this.quantidadeDinero);
            this.account = newAccount;
            check = true;
        }
        return check;
    }

    public boolean emprestimos (){
        double emprestimo = 0;
        if (this.account.getSaldo() > 0) {
             emprestimo += 0.45;
        }
        if(this.age >= 18){
            emprestimo = 0.25;
        }
        if(this.numChildren < 3){
            emprestimo = 0.30;
        }
        return emprestimo >= 0.60;
    }


}
