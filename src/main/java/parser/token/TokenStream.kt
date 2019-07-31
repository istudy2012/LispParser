package parser.token

class TokenStream(val value: String) {

    fun handle(): List<Token> {
        val tokens = arrayListOf<Token>()
        var position = 0

        while (position < value.length) {
            val c = value[position]
            when (c) {
                '(' -> {
                    tokens.add(OpenToken.create(position))
                    position++
                }
                ')' -> {
                    tokens.add(CloseToken.create(position))
                    position++
                }
            }

        }

        return tokens
    }

}