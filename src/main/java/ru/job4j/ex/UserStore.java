package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
       for (User user: users) {
           if (user.getUsername().equals(login)) {
              return user;
           }
       }

        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username could not be less than 3");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден");
        }
    }
}