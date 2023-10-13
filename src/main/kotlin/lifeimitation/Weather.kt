package lifeimitation

/**
 * @author Papirova Ekaterina
 * @date 12.10.2023 17:39
 * lifeImitation
 */
const val SUNRISE_TIME = 8
val weatherEventsGenerator = EventsGenerator()

@Author(
    "Ekaterina",
    "Papirova"
)

class Weather : InteractingObject("Weather"), GenerateEvent by weatherEventsGenerator

