package lexicon.se.services;


public interface UserInputService {
    default int getString() {
        return 0;
    }

    int getInt();

    default String getInput() {
        return null;
    }
}
