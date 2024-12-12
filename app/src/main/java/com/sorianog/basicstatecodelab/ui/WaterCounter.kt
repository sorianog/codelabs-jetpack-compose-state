package com.sorianog.basicstatecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sorianog.basicstatecodelab.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text(
            text = stringResource(R.string.glasses_count_msg, count)
        )
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text(stringResource(R.string.add_one))
        }
    }
}