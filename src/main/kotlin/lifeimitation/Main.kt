package lifeimitation

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
    val petr = Human().apply { this.name = "Petr" }
    petr.interact(weather)

    weather.generateEvents(
        listOf(
            TimeEvent(
                "Sunrise",
                with(now()) {
                    var newDateTime = this
                    if (hour > SUNRISE_HOUR) newDateTime = newDateTime.plusDays(1)
                    newDateTime.withHour(SUNRISE_HOUR).withMinute(SUNRISE_MINUTE).withSecond(SUNRISE_SEC)
                }, Period.ofDays(1), weather
            )
        )
    )
    println(with(weatherEventsGenerator.events[0] as TimeEvent) { "$name $initTime $period" })
    petr.interactEvents(weatherEventsGenerator)
//    Petr greets Weather
//    Sunrise 2023-12-04T08:00:00.217505 P1D
//    Petr greets Sunrise

}