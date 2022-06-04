package LanguageFactory;

import Fonts.Font;
import Fonts.Monaco;
import Parser.Parser;
import Parser.CPP_Parser;

public class CPP_Factory implements LanguageFactory{
    @Override
    public Parser createParser() {
        return new CPP_Parser();
    }

    @Override
    public Font createFont() {
        return new Monaco();
    }
}
