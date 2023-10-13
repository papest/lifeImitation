package lifeimitation

/**
 * @author Papirova Ekaterina
 * @date 12.10.2023 17:33
 * lifeImitation
 */

@Author(
    "Ekaterina",
    "Papirova"
)

object Interact {
    fun InteractingObject.interact(value: InteractingObject) = println("$name interacting with ${value.name}")
}

open class InteractingObject(var name: String = "Object")

