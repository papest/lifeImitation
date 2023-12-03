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


abstract class InteractingObject(var name: String = "Object") {
    open fun interact(interactingObject: InteractingObject) =
        println("$name interacting with ${interactingObject.name}")
}
