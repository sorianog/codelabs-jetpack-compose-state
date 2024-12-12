package com.sorianog.basicstatecodelab.ui

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.sorianog.basicstatecodelab.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    private fun getWellnessTasks() =
        List(30) { i ->
            WellnessTask(i, "Task # $i")
        }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        _tasks.find {
            it.id == item.id
        }?.let { task ->
            task.checked = checked
        }
    }
}
