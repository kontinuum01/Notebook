package View.Commands;

import View.ConsoleUi;

public class ShowNotesForWeek extends Command {
    public ShowNotesForWeek(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Вывести записи для недели";
    }

    @Override
    public void execute() {
        ConsoleUi.showNotesForWeek();
    }
}
