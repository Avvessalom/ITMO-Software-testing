package part3

fun main() {
    val trillian = Human("Триллиан", 20)
    val alien = Human("Eugene", 22)
    val ugol = Place("угол")
    val room = Place("комната")
    val robot = Robot("kek")
    val head = HeadOfRobot("Работает")
    val legs = LegOfRobot("Работает")
    print(robot.toString())
    robot.sit(ugol)
    head.action("резко", "дернулась вверх")
    head.action("едва заметно", "закачалась из стороны в сторону")
    print(robot.toString())
    robot.getUp(ugol, "тяжело", legs)
    print(" Сделал то, что ")
    alien.seem(alien.isAlienWatcher)
    print(alien.toString())
    robot.tryToGo(room)
    robot.stop(trillian)
    robot.watch(trillian)
    println("\n--------------------------------------------------\nOriginal text:\nГолова робота, сидящего в углу, сначала резко дернулась вверх, а затем едва заметно закачалась из стороны в сторону. Он тяжело поднялся на ноги и сделал то, что показалось бы постороннему наблюдателю героической попыткой пересечь комнату. Он остановился перед Триллиан и посмотрел, как будто, сквозь ее левое плечо.")
}