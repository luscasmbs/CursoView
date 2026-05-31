package com.example.projetoteste.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projetoteste.model.CourseData
import com.example.projetoteste.ui.components.CourseFormSection
import com.example.projetoteste.ui.components.CoursePreviewCard
import com.example.projetoteste.ui.components.CursoViewHeader
import com.example.projetoteste.ui.components.FormActions
import com.example.projetoteste.ui.components.StatusCard
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CadastroCursos(modifier: Modifier = Modifier) {
    var course by remember { mutableStateOf(CourseData()) }
    var statusMessage by remember {
        mutableStateOf("Preencha os dados para gerar a visualização do curso.")
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        CursoViewHeader()
        CourseFormSection(
            course = course,
            oncompletename = { course = course.copy(completename = it) },
            onshortname = { course = course.copy(shortname = it) },
            ontype = { course = course.copy(type = it) },
            onworktime = { course = course.copy(worktime = it) },
            onshortdescription = { course = course.copy(shortdescription = it) }
        )
        CoursePreviewCard(
            course = course
        )
        StatusCard(mensage = statusMessage)
        FormActions(
            onClickClear = {
                course = CourseData()
                statusMessage = "Formulário limpo."
            },
            onValidatorClick = {
                statusMessage = if (
                    course.completename.isBlank() ||
                    course.shortname.isBlank() ||
                    course.type.isBlank() ||
                    course.worktime.isBlank() ||
                    course.shortdescription.isBlank()
                ) {
                    "Preencha todos os campos antes de validar."
                } else {
                    "Cadastro visual válido para apresentação."
                }
            },
            onLoadExampleClick = {
                course = CourseData.examplemodel()
                statusMessage = "Exemplo carregado para análise."
            }
        )
        Spacer(
            modifier = Modifier
                .height(24.dp)
                .navigationBarsPadding()
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
