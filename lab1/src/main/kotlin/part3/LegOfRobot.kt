package part3

class LegOfRobot(override val status: String): PartOfRobot {
    override val type: String = "Ноги"
    override fun toString(): String {
        return type
    }
}