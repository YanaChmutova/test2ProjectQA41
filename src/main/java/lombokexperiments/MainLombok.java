package lombokexperiments;


import lombokexperiments.dto.User;
import lombokexperiments.dto.UserLombok;
import lombokexperiments.dto.UserWith;

public class MainLombok {
    //psvm -> public static void main

    public static void main(String[] args) {
    User user = new User( "aaa", "lkfg");
    //sout -> System.out.println()
     System.out.println(" user " + user.getName());
     UserWith userWith = new UserWith();
     userWith.withName("dddd");
     userWith.withPassword("llkjd");
     System.out.println(userWith.getPassword() + " user with " +
             "");
     UserWith userWith1 = new UserWith()
             .withName("hhh")
             .withPassword("dfgjjh");//chain
        System.out.println(" userWith1 " + userWith1.getName());

     UserWith userWith2 = new UserWith()
             .withPassword("dgffg");

     // ---------------Lombok

        UserLombok userLombok = UserLombok.builder()
                .name("ghfgj")
                .password("dfgd").build();
        System.out.println("Lombok " + userLombok.getName());
    }

}
