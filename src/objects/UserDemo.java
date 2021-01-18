package objects;

public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("User 1");
        user1.setUserName("user1");
        user1.setPassword("password1");
        user1.setGender(User.MALE);
        //user1.numUsersLogin = 1;
        User.increaseNumberUserLogin(); // 1

        User user2 = new User();
        user2.setName("User 2");
        user2.setUserName("user2");
        user2.setPassword("password2");
        user2.setGender(User.FEMALE);
        //user2.numUsersLogin = 2;
        User.increaseNumberUserLogin(); // 2

        System.out.println(User.numUsersLogin); // 5
        System.out.println(user2.getPassword()); // 5

    }
}
