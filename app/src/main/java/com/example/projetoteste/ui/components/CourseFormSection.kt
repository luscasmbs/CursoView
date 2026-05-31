package com.example.projetoteste.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.projetoteste.model.CourseData
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CourseFormSection(
    course: CourseData,
    oncompletename: (String) -> Unit,
    onshortname: (String) -> Unit,
    ontype: (String) -> Unit,
    onworktime: (String) -> Unit,
    onshortdescription: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFf8f4f0))
        ) {
            CourseTextField(
                course = course,
                oncompletename = oncompletename,
                onshortname = onshortname,
                ontype = ontype,
                onworktime = onworktime,
                onshortdescription = onshortdescription
            )
        }
    }
}

@Preview
@Composable
private fun FormPreview() {
    ProjetoTesteTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFf8f4f0))
        ) {
            CourseFormSection(
                course = CourseData.examplemodel(),
                oncompletename = {},
                onshortname = {},
                ontype = {},
                onworktime = {},
                onshortdescription = {}
            )
            CoursePreviewCard(course = CourseData.examplemodel())
            StatusCard(mensage = "Preencha os dados para gerar a visualização do curso.")
            FormActions(
                onClickClear = {},
                onValidatorClick = {},
                onLoadExampleClick = {}
            )
        }
    }
}
