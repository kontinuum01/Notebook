package View;

import Model.Note;
import java.time.LocalDateTime;
import java.util.List;

public interface View {
    void start();

    void printAnswer(String answer);

    void showNotes(List<Note> notes);

    void showMessage(String message);

    LocalDateTime getDateTimeInput();

    String getDescriptionInput();

    String getFileNameInput();
}
