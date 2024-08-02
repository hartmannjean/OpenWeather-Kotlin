package com.example.openweather

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
        val context = LocalContext.current
        Column(
                modifier = Modifier
                        .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
                OutlinedButton(
                        onClick = { Toast.makeText(context, "Atualizado", Toast.LENGTH_SHORT).show() }
                ) {
                        Text(text = "Atualizar...")
                }
        }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
        HomeScreen()
}