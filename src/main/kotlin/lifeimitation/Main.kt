package lifeimitation

import lifeimitation.Interact.interact

/**
 * @author Papirova Ekaterina
 * @date 12.10.2023 17:46
 * lifeImitation
 */
@Author(
    "Ekaterina",
    "Papirova"
)

fun main() {
    val weather = Weather()
    weather.interact(InteractingObject())
    Human().apply { this.name = "Petr" }.interact(weather)
}