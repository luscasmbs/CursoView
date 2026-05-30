package com.example.projetoteste.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projetoteste.ui.components.CourseFormSection
import com.example.projetoteste.ui.components.CursoViewHeader
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CadastroCursos(modifier: Modifier = Modifier) {
    var courseName by remember { mutableStateOf("") }

    Column(modifier = modifier.fillMaxSize()) {
        CursoViewHeader()
        CourseFormSection(
            courseName = courseName,
            onCourseNameChange = { courseName = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenPreview() {
    ProjetoTesteTheme {
        CadastroCursos()
    }
}