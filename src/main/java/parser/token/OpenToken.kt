package parser.token

class OpenToken: Token() {

    companion object {
        fun create(position: Int) : OpenToken {
            val token = OpenToken()
            token.start = position
            token.end = position + 1
            return token
        }
    }

    override fun tag(): String {
        return "("
    }

}