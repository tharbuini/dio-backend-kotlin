class Customer
class Contact(val id: Int, var email: String)

fun main() {
    var customer = Customer()
    val contact = Contact(1, "thiago@gmail.com")

    println(contact.id)
    println(contact.email)
    
    contact.email = "ana@gmail.com"
    println(contact.email)

}