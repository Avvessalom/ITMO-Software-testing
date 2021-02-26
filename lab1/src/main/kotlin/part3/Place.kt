package part3

class Place constructor(private val name: String) {
    private val isFull: Boolean = false

    override fun toString(): String {
        return this.name
    }
}

fun main() {
    var kek = Place("jopa")
    println(Place("jopa").toString())
    println(Place("ne jopa").toString())
}
