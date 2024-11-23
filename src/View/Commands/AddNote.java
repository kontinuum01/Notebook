package View.Commands;

import View.ConsoleUi;

public class AddNote extends Command {

    public AddNote(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Добавить запись";
    }

    @Override
    public void execute() {
        ConsoleUi.addNote();
    }
}
