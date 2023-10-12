package lifeimitation

/**
 * @author Papirova Ekaterina
 * @date 12.10.2023 16:20
 * lifeImitation
 */

@Author("Ekaterina", "Papirova")


@Retention(value = AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.FILE)
annotation class Author(val firstName: String, val surName: String)

