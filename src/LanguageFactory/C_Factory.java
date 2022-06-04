package LanguageFactory;

import Fonts.CourierNew;
import Fonts.Font;
import Parser.C_Parser;
import Parser.Parser;

public class C_Factory implements LanguageFactory{
    @Override
    public Parser createParser() {
        return new C_Parser();
    }

    @Override
    public Font createFont() {
        return new CourierNew();
    }
}
