fun main() {
    for(i in 0..3) {
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    for(i in 2..8 step 3) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    // ranges for chars
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")

    // using if statements
    val x = 2
    if (x in 1..5) {            // 1
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }
}