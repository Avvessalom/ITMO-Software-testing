package part3

interface RobotAction {
    fun sit(where: Place)

    fun getUp(whence: Place, type: String, part: PartOfRobot)

    fun tryToGo(where: Place)

    fun watch(forWhat: Human)

    fun stop(inFrontOfWho: Human)

}