package lifeimitation

/**
 * @author Papirova Ekaterina
 * @date 12.10.2023 18:06
 * lifeImitation
 */

open class Human(name: String = "Human") : InteractingObject(name) {
    override fun interact(interactingObject: InteractingObject) {
        println("$name greets ${interactingObject.name}")
    }

    fun interactEvents(eventsGenerator: EventsGenerator) {
        eventsGenerator.events.forEach {
            println("$name greets ${it.name}")
        }
    }
}
