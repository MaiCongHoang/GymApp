package com.example.gymapp.presentation.dashboard

import androidx.compose.ui.graphics.Color
import com.example.gymapp.domain.model.Session
import com.example.gymapp.domain.model.Task

sealed class DashboardEvent {
    data object SaveSubject : DashboardEvent()
    data object DeleteSession : DashboardEvent()
    data class OnDeleteSessionButtonClick(val session: Session): DashboardEvent()
    data class OnTaskIsCompleteChange(val task: Task): DashboardEvent()
    data class OnSubjectCardColorChange(val colors: List<Color>): DashboardEvent()
    data class OnSubjectNameChange(val name: String): DashboardEvent()
    data class OnGoalStudyMinutesChange(val minutes: String): DashboardEvent()
}
