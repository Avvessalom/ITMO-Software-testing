package part3

class Human (var name: String, val age: Int) {
    var isAlienWatcher: Boolean = true
        get() = field
        set(value) {
            field = if(this.name != "Trillian"){
                true
            } else{
                value
            }
        }
}
