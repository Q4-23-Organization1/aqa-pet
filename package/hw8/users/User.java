package hw8.users;


public class User {

    public String name;
    private int age;
    public String email;
    private String password;
    public double amountSpentMoney;
    public boolean isActive;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
            if (age >= 1 && age <= 120) {
                this.age = age;

            }

        }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password) {
        if (password.matches("[a-zA-Z]+")) {
            this.password = password;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase made: $" + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public  void printTotalAmountOfSpentMoney() {
        System.out.println("Amount of spent money: $" + amountSpentMoney);

    }


}

