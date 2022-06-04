package LanguageFactory;

import Fonts.Font;
import Parser.Parser;

public interface LanguageFactory {
    Parser createParser();
    Font createFont();
}
