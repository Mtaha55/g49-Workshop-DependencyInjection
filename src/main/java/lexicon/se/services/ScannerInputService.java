package lexicon.se.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {

    private final Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("That's not a valid number! Try again: ");
            scanner.next(); // discard the invalid input
        }
        return scanner.nextInt();
    }

    @Override
    public String getInput() {
        return "";
    }
}
