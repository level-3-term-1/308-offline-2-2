package Editor;

public class ProgrammingEditor {

    private static ProgrammingEditor programmingEditor;

    private ProgrammingEditor(){

    }

    public static ProgrammingEditor getInstance(){
        if(programmingEditor == null) {
            programmingEditor = new ProgrammingEditor();
        }
        return ProgrammingEditor.programmingEditor;
    }
}
