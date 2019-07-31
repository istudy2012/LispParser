package parser.token

enum class TokenType(val value: String) {

    OPEN_PT("("),
    CLOSE_PT(")"),

    DEFINE("define"),
    LET("let"),

    INT("int")

}