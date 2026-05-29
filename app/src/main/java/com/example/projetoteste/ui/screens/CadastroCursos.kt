package com.example.projetoteste.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projetoteste.ui.components.CourseFormSection
import com.example.projetoteste.ui.components.CursoViewHeader
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CadastroCursos(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        CursoViewHeader()
        CourseFormSection(courseName = "",
            onCourseNameChange = {})
    }
}

@Preview(showBackground = true)
@Composable
private fun screenPreview(){
    ProjetoTesteTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            CursoViewHeader()
            CourseFormSection(courseName = "",
                onCourseNameChange = {})
        }
    }
}