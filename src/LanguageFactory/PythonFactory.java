package LanguageFactory;

import Fonts.Consolas;
import Fonts.Font;
import Parser.Parser;
import Parser.Py_Parser;

public class PythonFactory implements LanguageFactory{
    @Override
    public Parser createParser() {
        return new Py_Parser();
    }

    @Override
    public Font createFont() {
        return new Consolas();
    }
}
