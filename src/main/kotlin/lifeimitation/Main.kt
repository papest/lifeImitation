package lifeimitation

import lifeimitation.Interact.interact
import java.time.LocalDateTime.*
import java.time.Period

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
    weather.generateEvents(listOf(TimeEvent("Sunrise",
        with (now()){
        var newDateTime = this
        if (hour > SUNRISE_TIME) newDateTime =  newDateTime.plusDays(1)
            newDateTime.withHour(SUNRISE_TIME) }, Period.ofDays(1), weather)))
    println(weatherEventsGenerator.events[0].name)
}