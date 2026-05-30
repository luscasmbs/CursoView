package com.example.projetoteste.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoteste.model.CourseData
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CourseTextField(
    course: CourseData,
    oncompletename: (String) -> Unit,
    onshortname: (String) -> Unit,
    ontype: (String) -> Unit,
    onworktime: (String) -> Unit,
    onshortdescription: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(0.92f)
                .height(300.dp)
                .background(
                    Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(16.dp)
                )
                .border(
                    width = 0.5.dp,
                    color = Color(0xFFE8E4DF),
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            Text(
                text = "DADOS DO CURSO",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFFC5C1BC),
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 16.dp, start = 15.dp)
            )

            OutlinedTextField(
                shape = RoundedCornerShape(16.dp),
                value = course.completename,
                onValueChange = oncompletename,
                placeholder = {
                    Text(
                        text = "Nome completo do curso",
                        color = Color(0xFFEFEBE7)
                    )
                },
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEFEBE7),
                    focusedBorderColor = Color(0xFF36414E)
                ),
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .padding(top = 45.dp)
                    .align(Alignment.TopCenter)
            )
            OutlinedTextField(
                shape = RoundedCornerShape(16.dp),
                value = course.shortname,
                onValueChange = onshortdescription,
                placeholder = {
                    Text(
                        text = "Nome breve",
                        color = Color(0xFFEFEBE7)
                    )
                },
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEFEBE7),
                    focusedBorderColor = Color(0xFF36414E)
                ),
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .padding(top = 120.dp)
                    .align(Alignment.TopCenter)
            )
            OutlinedTextField(
                shape = RoundedCornerShape(16.dp),
                value = course.type,
                onValueChange = ontype,
                placeholder = {
                    Text(
                        text = "Categoria",
                        color = Color(0xFFEFEBE7)
                    )
                },
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEFEBE7),
                    focusedBorderColor = Color(0xFF36414E)
                ),
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .padding(top = 195.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CourseTextFieldPreview() {
    ProjetoTesteTheme {
        CourseTextField(
            course = CourseData.examplemodel(),
oncompletename ={},
            onshortname = {},
            ontype = {},
            onworktime = {},
            onshortdescription = {}
        )
    }
}