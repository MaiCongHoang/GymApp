package com.example.gymapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.gymapp.presentation.theme.gradient1
import com.example.gymapp.presentation.theme.gradient2
import com.example.gymapp.presentation.theme.gradient3
import com.example.gymapp.presentation.theme.gradient4
import com.example.gymapp.presentation.theme.gradient5

@Entity
data class Subject(
    val name: String,
    val goalMinutes: Float,
    val colors: List<Int>,
    @PrimaryKey(autoGenerate = true)
    val subjectId: Int? = null
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}
