package lexicon.se.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UserInputServiceImpl implements UserInputService {

    private final Scanner scanner = null;

    @Autowired
    public UserInputServiceImpl() {
    }

    @Override
    public int getString() throws IllegalStateException {
        System.out.print("Enter a string: ");


        {
            System.out.print("Enter an integer: ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid number! Try again: ");
                scanner.next();// discard the invalid input
                throw new IllegalStateException("Unexpected value: " + scanner.next());
            }
            return scanner.nextInt();
        }

    }

    @Override
    public int getInt() {
        return 0;
    }
}