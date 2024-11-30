import kotlin.random.Random

class Carriage {

    companion object {
        fun createTrain(numOfPasses: Int): List<Int> {
            val carriages = mutableListOf<Int>()
            var totalPasses = 0

            while (totalPasses < numOfPasses) {
                val capacity = Random.nextInt(5, 26) // вместимость вагона от 5 до 25
                carriages.add(capacity)
                totalPasses += capacity
            }

            return carriages
        }
    }
}