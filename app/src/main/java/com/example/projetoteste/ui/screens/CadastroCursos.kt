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
import com.example.projetoteste.model.CourseData
import com.example.projetoteste.ui.components.CourseFormSection
import com.example.projetoteste.ui.components.CursoViewHeader
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CadastroCursos(modifier: Modifier = Modifier) {
    var course by remember { mutableStateOf(CourseData()) }

    Column(modifier = modifier.fillMaxSize()) {
        CursoViewHeader()
        CourseFormSection(
            course = course,
            oncompletename = { course = course.copy(completename = it) },
            onshortname = { course = course.copy(shortname = it) },
            ontype = { course = course.copy(type = it) },
            onworktime = { course = course.copy(worktime = it) },
            onshortdescription = { course = course.copy(shortdescription = it) }
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