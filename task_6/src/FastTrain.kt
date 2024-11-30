class FastTrain(var direction: Direction, var size: Int) {
    fun send() {
        println("Поезд ${direction.from} - ${direction.to}, состоящий из ${size} вагонов, отправлен.")
    }
}