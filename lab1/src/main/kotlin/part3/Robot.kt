package part3

open class Robot(
    name: String
) : RobotAction {

    override fun sit(where: Place): String {
        print("сидит в $where. ")
        return "сидит в $where. "
    }

    override fun getUp(whence: Place, type: String, part: PartOfRobot): String {
        print("$type поднялся из $whence на ${part.type}.")
        return "$type поднялся из $whence на ${part.type}."
    }

    override fun tryToGo(where: Place): String {
        print(" героическая попытка пересечь $where.")
        return " героическая попытка пересечь $where."
    }

    override fun watch(forWhat: Human): String {
        print("Смотреть сквозь левое плечо $forWhat")
        return "Смотреть сквозь левое плечо $forWhat"
    }

    override fun stop(inFrontOfWho: Human): String {
        print("Остановился перед $inFrontOfWho.")
        return "Остановился перед $inFrontOfWho."
    }

    override fun toString(): String {
        return "Робот "
    }
}
