package com.example.projetoteste.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CourseFormSection(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFf5f2ee))

        ) {
            CourseTextField()

        }
    }
}
@Preview
@Composable
private fun FormPreview(){
    ProjetoTesteTheme {
        CourseFormSection( )
    }
}