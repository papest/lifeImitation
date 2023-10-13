package lifeimitation

import java.time.LocalDateTime
import java.time.Period

/**
 * @author Papirova Ekaterina
 * @date 13.10.2023 18:06
 * lifeImitation
 */

class TimeEvent(val name: String, val initTime: LocalDateTime, val period: Period, val generator: GenerateEvent)

class EventsGenerator : GenerateEvent {
    var events = emptyList<TimeEvent>()
    override fun generateEvents(events: List<TimeEvent>) {
        this.events = events
    }
}

interface GenerateEvent {
    fun generateEvents(events: List<TimeEvent>)
}


