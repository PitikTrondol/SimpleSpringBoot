package anridiaf.playground.java.mark1.greeting

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GreetingRepository: JpaRepository<Greeting, Long>