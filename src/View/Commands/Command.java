package View.Commands;

import View.ConsoleUi;

public abstract class Command {

    String description;
    ConsoleUi consoleUi;

    public Command(ConsoleUi consoleUi) {

        this.consoleUi = new ConsoleUi();
    }

    public String getDescription() {

        return description;
    }

    public abstract void execute();
}
