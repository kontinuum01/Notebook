package View.Commands;

import View.ConsoleUi;

public class LoadNotes extends Command {

    public LoadNotes(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Сохранить файл";
    }

    @Override
    public void execute() {
        ConsoleUi.loadNotes();
    }
}
