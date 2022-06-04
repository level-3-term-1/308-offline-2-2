package Editor;

import Fonts.Font;
import LanguageFactory.LanguageFactory;
import Parser.Parser;

public class ProgrammingEditor {

    private static ProgrammingEditor programmingEditor;

    private LanguageFactory languageFactory;
    private Parser parser;
    private Font font;

    private ProgrammingEditor(){

    }

    public static ProgrammingEditor getInstance(){
        if(programmingEditor == null) {
            programmingEditor = new ProgrammingEditor();
        }
        return ProgrammingEditor.programmingEditor;
    }

    public void configureParserAndFonts(LanguageFactory languageFactory) {
        this.languageFactory = languageFactory;
        setParser();
        setFont();
    }

    private void setFont() {
        this.font = languageFactory.createFont();
    }

    private void setParser() {
        this.parser = languageFactory.createParser();
    }

    public void showCurrentState(){
        this.font.showingEnvironment();
        this.parser.parsing();
    }
}
