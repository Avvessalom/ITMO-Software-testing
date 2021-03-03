package part3

interface RobotAction {
    fun sit(where: Place) :String

    fun getUp(whence: Place, type: String, part: PartOfRobot) : String

    fun tryToGo(where: Place): String

    fun watch(forWhat: Human): String

    fun stop(inFrontOfWho: Human) : String

}