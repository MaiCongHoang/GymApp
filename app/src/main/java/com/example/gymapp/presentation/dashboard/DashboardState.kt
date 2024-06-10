package com.example.gymapp.presentation.dashboard

import androidx.compose.ui.graphics.Color
import com.example.gymapp.domain.model.Session
import com.example.gymapp.domain.model.Subject

data class DashboardState(
    val totalSubjectCount: Int = 0,
    val totalStudiedMinutes: Float = 0f,
    val totalGoalStudyMinutes: Float = 0f,
    val subjects: List<Subject> = emptyList(),
    val subjectName: String = "",
    val goalStudyMinutes: String = "",
    val subjectCardColors: List<Color> = Subject.subjectCardColors.random(),
    val session: Session? = null
)
