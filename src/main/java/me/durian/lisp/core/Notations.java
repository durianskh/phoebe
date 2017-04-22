package me.durian.lisp.core;

/**
 * Created by durianskh on 4/22/17.
 */
public enum Notations {

    DELIMITED_PERIOD(".", "used in the notation for pairs, and to indicate a rest-parameter in a formal parameter list"),
    DELIMITED_PLUS("+", ""),
    DELIMITED_MINUS("-", ""),
    LEFT_PARENTHESE("(", ""),
    RIGHT_PARENTHESE(")", ""),
    SINGLE_QUOTE("'", " used to indicate literal data"),
    BACKQUOTE("`", "used to indicate almost-constant data"),
    COMMA(",", "comma and the sequence comma at-sign are used in conjunction with backquote"),
    COMMA_AT(",@", "comma and the sequence comma at-sign are used in conjunction with backquote"),
    DOUBLE_QUOTE("\"", "used to delimit strings"),
    BLACKSLASH("\\", " used in the syntax for character constants and as an escape character within string constants"),
    LEFT_SQUARE_BRACKET("[", "reserved for possible future extensions to the language"),
    RIGHT_SQUARE_BRACKET("]", "reserved for possible future extensions to the language"),
    LEFT_CURLY_BRACKET("{", "reserved for possible future extensions to the language"),
    RIGHT_CURLY_BRACKET("}", "reserved for possible future extensions to the language"),
    VERTICAL_BAR("|", "reserved for possible future extensions to the language"),
    SHARP_T("#t", "true"),
    SHARP_F("#f", "false"),
    SHARP_BACKSLASH("#\\", "introduces a character constan"),
    SHART_LEFT_PARENTHESE("#(", "introduces a vector constant. Vector constants are terminated by )"),
    SHARP_E("#e", ""),
    SHARP_I("#i", ""),
    SHARP_B("#b", ""),
    SHARP_O("#o", ""),
    SHARP_D("#d", ""),
    SHARP_X("#x", "");


    private String notation;

    private String desc;

    Notations(String notation, String desc) {
        this.notation = notation;
        this.desc = desc;
    }

    public String getNotation() {
        return notation;
    }

    public String getDesc() {
        return desc;
    }
}
