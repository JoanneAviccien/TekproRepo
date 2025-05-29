package org.memento;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Halo");
        caretaker.saveState(editor.save());
        logger.info("Teks sekarang: " + editor.getText());

        editor.setText("Halo Dunia");
        caretaker.saveState(editor.save());
        logger.info("Teks sekarang: " + editor.getText());

        editor.setText("Halo Dunia!!!");
        caretaker.saveState(editor.save());
        logger.info("Teks sekarang: " + editor.getText());

        // Undo dua kali
        editor.restore(caretaker.undo(editor.save()));
        logger.info("Undo 1: " + editor.getText());
        editor.restore(caretaker.undo(editor.save()));
        logger.info("Undo 2: " + editor.getText());

        // Redo satu kali
        editor.restore(caretaker.redo(editor.save()));
        logger.info("Redo 1: " + editor.getText());
    }
} 