import Editor.ProgrammingEditor;
import LanguageFactory.CPP_Factory;
import LanguageFactory.C_Factory;
import LanguageFactory.PythonFactory;
import Utils.FileType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileType fileType;
        Scanner input = new Scanner(System.in);
        String string = input.next();

        ProgrammingEditor programmingEditor = ProgrammingEditor.getInstance();

        fileType = string.endsWith(".c") ? FileType.C : string.endsWith(".cpp") ? FileType.CPP : string.endsWith(".py") ? FileType.PYTHON : null;

        switch (fileType) {
            case C -> {
                programmingEditor.configureParserAndFonts(new C_Factory());
            }
            case CPP -> {
                programmingEditor.configureParserAndFonts(new CPP_Factory());
            }
            case PYTHON -> {
                programmingEditor.configureParserAndFonts(new PythonFactory());
            }
        }
        programmingEditor.showCurrentState();

    }
}