package part3

class Place constructor(private val name: String) {
    private val isFull: Boolean = false

    override fun toString(): String {
        return this.name
    }
}
