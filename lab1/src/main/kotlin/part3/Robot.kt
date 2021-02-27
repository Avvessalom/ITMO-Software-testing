package part3

open class Robot(
    name: String
) : RobotAction {

    override fun sit(where: Place) {
        print("сидящего в $where, ")
    }

    override fun getUp(whence: Place, type: String) {
        print("$type поднялся из $whence на ноги.")
    }

    override fun tryToGo(where: Place) {
        print("героическая попытка пересечь $where.")
    }

    override fun watch(forWhat: Human) {
        print("Смотреть сквозь плечо $forWhat")
    }

    override fun stop(inFrontOfWho: Human) {
        print("Остановился перед $inFrontOfWho.")
    }

    override fun toString(): String {
        return "Робот "
    }
}
