package lombokexperiments;

import lombokexperiments.dto.User;
import lombokexperiments.dto.UserLombok;
import lombokexperiments.dto.UserWith;

public class MainLombok {
// psvm
    public static void main(String[] args) {
        User user = new User("aaa", "ksdjk");
        System.out.println("user: " + user.getName());

        UserWith userWith = new UserWith();
        userWith.withName("aab");
        userWith.withPassword("sdkl");
        System.out.println(userWith.getPassword() + " user with");

        UserWith userWith1 = new UserWith()
                .withName("hhh")
                .withPassword("dhj"); // chain

        System.out.println("userWith1 " + userWith1.getName());

        UserWith userWith2 = new UserWith()
                .withPassword("dhjf");

        //----------- Lombok

        UserLombok userLombok = UserLombok.builder()
                .name("djhfk")
                .password("jk")
                .build();

        System.out.println("lombok " + userLombok.getName());

    }
}
