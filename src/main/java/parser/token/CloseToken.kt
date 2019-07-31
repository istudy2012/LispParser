package parser.token

class CloseToken: Token() {

    companion object {
        fun create(position: Int) : CloseToken {
            val token = CloseToken()
            token.start = position
            token.end = position + 1
            return token
        }
    }

    override fun tag(): String {
        return ")"
    }

}