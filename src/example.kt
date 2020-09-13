class Singleton {
    var money:Int = 0

    companion object {
        private var INSTANCE: Singleton? = null

        val instance: Singleton
            get() {
                if (INSTANCE == null) {
                    INSTANCE = Singleton()
                }

                return INSTANCE!!
            }
    }
}

fun main(args: Array<String>) {
    val Singleton1 = Singleton.instance
    val Singleton2 = Singleton.instance
    Singleton2.money = 1000

    println(Singleton1.money)

    println(Singleton2.money)

}