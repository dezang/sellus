package doubled.sellus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiRootApplication

fun main(args: Array<String>) {
    runApplication<ApiRootApplication>(*args)
}
