package anridiaf.playground.java.mark1.auth

import jakarta.persistence.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: Int,

    @Column(name = "full_name")
    val name: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @Column(name = "created_at")
    val createdAt: Long,

    @Column(name = "updated_at")
    val updatedAt: Long,
)
