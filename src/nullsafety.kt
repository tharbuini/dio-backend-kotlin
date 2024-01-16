import org.jetbrains.annotations.NotNull

fun describeString(maybeString: String?): String {
    //if (!isEmptyorNull(maybeString))
      if (maybeString != null && maybeString.length > 0) {
          return "String of length ${maybeString.length}"
      } else {
          return "Empty or null string"
      }
}


fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null


    // a interrogação diz que pode receber nulo
    var nullable: String? = "You can keep a null here"
    nullable = null

    // teria que explicitar o tipo e colocar a interrogação
    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null

    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }
    strLength(neverNull)
    strLength(nullable)

    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}