class Cat {
    private var mood: Int = 1      // merupakan 'property' atau 'function' atau 'object' ? 'property'
    private var hungry: Int = 0    // merupakan 'property' atau 'function' atau 'object' ? 'property'
    private var energy: Int = 1    // merupakan 'property' atau 'function' atau 'object' ? 'property'

    private fun meow() {
        println("Miaoo,, Meoww,, Miauww")
    }    // merupakan 'property' atau 'function' atau 'object' ? 'function'

    fun sleep() {
        energy++
        hungry++
        println("State of Cat\nMood: $mood\nHungry: $hungry\nEnergy: $energy")
    }    // merupakan 'property' atau 'function' atau 'object' ? 'function'
}

fun main() {
    val gury = Cat()   // merupakan 'property' atau 'function' atau 'object' ? 'object'
//    gury.play()
    gury.sleep()       // merupakan 'property' atau 'function' atau 'object' ? 'function'
//    gury.meow()
}