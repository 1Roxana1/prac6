class Direction(var from: String, var to: String){
    companion object {
        private val cities = listOf(
            "Екатеринбург", "Барнаул", "Новосибирск", "Омск", "Томск",
            "Красноярск", "Иркутск", "Улан-Удэ", "Чита", "Воронеж",
            "Казань", "Челябинск", "Москва", "Норильск", "Санкт-Петербург"
        )

        fun create(): Direction {
            var from: String
            var to: String
            do {
                from = cities.random()
                to = cities.random()
            } while (from == to)
            return Direction(from, to)
        }
    }
}