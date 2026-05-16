package builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setAge(44)
                .setName("Kuldeep Singh").build();

        System.out.println(user);
    }
}
