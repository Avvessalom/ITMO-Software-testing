package part3

open class Robot(
    name: String
) : RobotAction {

    override fun sit(where: Place) {
        print("сидит в $where. ")
    }

    override fun getUp(whence: Place, type: String, part: PartOfRobot) {
        print("$type поднялся из $whence на ${part.type}.")
    }

    override fun tryToGo(where: Place) {
        print(" героическая попытка пересечь $where.")
    }

    override fun watch(forWhat: Human) {
        print("Смотреть сквозь левое плечо $forWhat")
    }

    override fun stop(inFrontOfWho: Human): String {
        print("Остановился перед $inFrontOfWho.")
        return "Остановился перед $inFrontOfWho."
    }

    override fun toString(): String {
        return "Робот "
    }
}
