import kotlin.random.Random

fun main() {
    while (true) {
        // Создать направление
        val direction = Direction.create()
        println("Маршрут: ${direction.from} - ${direction.to}")

        //  Продать билеты
        val cashDesk = CashDesk()
        var numOfPasses = cashDesk.tickets()
        println("Продано билетов: $numOfPasses")
        println()

        // Сформировать поезд
        val carriages = Carriage.createTrain(numOfPasses)
        println("Поезд сформирован с ${carriages.size} вагонами.")

        // Отправить поезд
        val train = FastTrain(direction, carriages.size)
        carriages.forEachIndexed { index, capacity ->
            println("Вагон ${index + 1}: пассажиров $capacity ")
        }

        println()

        train.send()

        println()

        println("Хотите закончить работу? (введите EXIT для выхода)")
        val input = readLine()
        if (input.equals("EXIT", ignoreCase = true)) {
            println("Выход из программы.")
            break
        }
    }
}

