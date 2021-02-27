package part3

class Place constructor(val name: String) {
    val isFull: Boolean = false

    override fun toString(): String {
        return this.name
    }
}
