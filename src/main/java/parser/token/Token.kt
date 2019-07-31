package parser.token

open class Token {

    var start: Int = 0
    var end: Int = 0

    open fun tag(): String {
        return ""
    }

}