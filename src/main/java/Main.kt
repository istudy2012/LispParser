import parser.Parser
import parser.token.TokenStream

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val source = "(+ 1 2)"
        val tokenStream = TokenStream(source)
        val tokens = tokenStream.handle()
        val parser = Parser(tokens)
        parser.handle()
    }

}