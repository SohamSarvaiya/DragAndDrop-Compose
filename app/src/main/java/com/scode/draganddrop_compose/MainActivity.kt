package com.scode.draganddrop_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.scode.draganddrop_compose.ui.theme.DragAndDropComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DragAndDropComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DragAndDropBoxes(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}