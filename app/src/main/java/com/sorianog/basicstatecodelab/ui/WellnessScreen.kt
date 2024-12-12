package com.sorianog.basicstatecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import com.sorianog.basicstatecodelab.WellnessTask
import com.sorianog.basicstatecodelab.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList(
            list = list,
            onCloseTask = { task -> list.remove(task)}
        )
    }
}

fun getWellnessTasks() =
    List(30) { i ->
        WellnessTask(i, "Task # $i")
    }