public class Client {
    private final String name;
    private final int age;
    private int numChildren;
    private final double money;

    public Client (String name, int age, int numChildren, double money){
        this.age = age;
        this.name = name;
        numChildren = 0;
        this.money = money;
    }

    public String getName (){ return name; }
    public double getMoney() { return money; }
    public int getAge(){ return age;}

}
