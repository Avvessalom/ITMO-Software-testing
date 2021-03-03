package part3

class Human(var name: String, val age: Int) {
    var isAlienWatcher: Boolean = true
        get() = field
        set(value) {
            field = if (this.name != "Триллиан") {
                true
            } else {
                value
            }
        }
    fun seem (isAlien: Boolean): Boolean {
        if (isAlien){
          print("показалось ")
            return true
        }
        return false
    }

    override fun toString(): String {
        return if (name == "Триллиан") {
            this.name
        } else {
            "посторонний"
        }
    }
}
