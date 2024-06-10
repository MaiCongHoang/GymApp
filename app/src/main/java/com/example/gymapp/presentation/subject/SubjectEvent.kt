package com.example.gymapp.presentation.subject

import androidx.compose.ui.graphics.Color
import com.example.gymapp.domain.model.Session
import com.example.gymapp.domain.model.Task

sealed class SubjectEvent {
    data object UpdateSubject : SubjectEvent()
    data object DeleteSubject : SubjectEvent()
    data object DeleteSession : SubjectEvent()
    data object UpdateProgress : SubjectEvent()
    data class OnTaskIsCompleteChange(val task: Task): SubjectEvent()
    data class OnSubjectCardColorChange(val color: List<Color>): SubjectEvent()
    data class OnSubjectNameChange(val name: String): SubjectEvent()
    data class OnGoalStudyMinutesChange(val minutes: String): SubjectEvent()
    data class OnDeleteSessionButtonClick(val session: Session): SubjectEvent()
}
