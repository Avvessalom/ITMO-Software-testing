package part3

class HeadOfRobot(override val status: String) : PartOfRobot {
    override val type: String = "Голова"
    fun action(typeOfAction: String, action: String): String {
        print("Голова робота $typeOfAction $action. ")
        return("Голова робота $typeOfAction $action. ")
    }

    override fun toString(): String {
        return type
    }
}