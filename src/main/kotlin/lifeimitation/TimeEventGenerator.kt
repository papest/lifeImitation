package lifeimitation

import java.time.LocalDateTime
import java.time.Period

/**
 * @author Papirova Ekaterina
 * @date 13.10.2023 18:06
 * lifeImitation
 */
open class Event(val name: String, val generator: GenerateEvent)
class TimeEvent(name: String, val initTime: LocalDateTime, val period: Period, generator: GenerateEvent) :
    Event(name, generator)

class EventsGenerator : GenerateEvent {
    var events = emptyList<Event>()
    override fun generateEvents(events: List<Event>) {
        this.events = events
    }
}

interface GenerateEvent {
    fun generateEvents(events: List<Event>)
}
