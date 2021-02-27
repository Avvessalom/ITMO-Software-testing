package part3

class HeadOfRobot(override val status: String) : PartOfRobot {
    override val type: String = "Голова"
    fun action(typeOfAction: String, action: String) {
        print("Голова робота $typeOfAction $action. ")
    }
}