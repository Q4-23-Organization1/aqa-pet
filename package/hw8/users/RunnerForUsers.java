package hw8.users;


public class RunnerForUsers {
    public static void main(String[] args) {
        User firstUser = new User("Jack", "qwerty");


        firstUser.setAge(26);
        firstUser.email = "firstUserEmail@com";
        firstUser.isActive = true;
        printUserInfo(firstUser);

        firstUser.makePurchase(50);
        firstUser.printTotalAmountOfSpentMoney();


        User secondUser = new User("John");

        secondUser.setPassword("1");
        secondUser.setAge(268);
        secondUser.email = "secondUserEmail@com";
        secondUser.isActive = false;
        printUserInfo(secondUser);

        secondUser.makePurchase(55);
        secondUser.printTotalAmountOfSpentMoney();


        }


    public static void printUserInfo(User user) {
        System.out.println("---------------------------- ");
        System.out.println("User information ");
        System.out.println("----------------------------");
        System.out.println("User name: " + user.getName());
        System.out.println("User password: " + (user.getPassword() != null ? user.getPassword() : " The PASSWORD was not set. Only letters are allowed as a password"));
        System.out.println("User age: " + (user.getAge() > 0 ? user.getAge() : " The AGE was not set. It is allowed only a value between 1 and 120."));
        System.out.println("User email: " + user.email);


    }
}








