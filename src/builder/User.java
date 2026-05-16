package builder;

public class User {
    private String name;
    private int age;

    private User(UserBuilder userBuilder){
        name = userBuilder.getName();
        age = userBuilder.getAge();
    }

    public static class UserBuilder{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
