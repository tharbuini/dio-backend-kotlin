// class that will be inherited need the "open"
open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

// "override" changes the open function provided by the superior class
class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}
class Golden : Dog() {
    override fun sayHello() {
        println("woof!")
    }
}

// inheritance with parameterized constructor
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")                  // 1

// passing constructor arguments to superclass
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1

fun main() {
    val dog1: Dog = Yorkshire()
    val dog2 = Golden()
    dog1.sayHello()
    dog2.sayHello()


    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()


    val lion: Lion = Asiatic("Rufo")                              // 2
    lion.sayHello()
}