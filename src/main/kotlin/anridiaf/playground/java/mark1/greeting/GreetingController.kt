package anridiaf.playground.java.mark1.greeting

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/greeting")
class GreetingController(@Autowired private val repository: GreetingRepository) {
    @GetMapping("/{id}")
    fun getGreetingById(@PathVariable("id") id: Long): ResponseEntity<Greeting> {
        val result = repository.findById(id).orElse(null)
            ?: return ResponseEntity(null, HttpStatus.NOT_FOUND)

        return ResponseEntity(result, HttpStatus.OK)
    }

    @PostMapping("")
    fun newGreeting(@RequestBody greeting: Greeting): ResponseEntity<Greeting>{
        val createdGreeting = repository.save(greeting)
        return ResponseEntity(createdGreeting, HttpStatus.CREATED)
    }
}