package lifeimitation

/**
 * @author Papirova Ekaterina
 * @date 12.10.2023 17:39
 * lifeImitation
 */
const val SUNRISE_HOUR = 8
const val SUNRISE_MINUTE = 0
const val SUNRISE_SEC = 0
val weatherEventsGenerator = EventsGenerator()

@Author(
    "Ekaterina",
    "Papirova"
)

class Weather : InteractingObject("Weather"), GenerateEvent by weatherEventsGenerator

