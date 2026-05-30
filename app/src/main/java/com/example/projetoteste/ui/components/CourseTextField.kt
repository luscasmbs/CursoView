package com.example.projetoteste.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoteste.model.CourseData
import com.example.projetoteste.ui.theme.ProjetoTesteTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height


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
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .padding(horizontal = 16.dp)
            .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(16.dp))
            .border(0.5.dp, Color(0xFFE8E4DF), shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 12.dp, vertical = 16.dp)
    ) {
        Text(
            text = "DADOS DO CURSO",
            style = MaterialTheme.typography.labelSmall,
            color = Color(0xFFC5C1BC),
            fontSize = 13.sp,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        OutlinedTextField(
            shape = RoundedCornerShape(16.dp),
            value = course.completename,
            onValueChange = oncompletename,
            placeholder = { Text("Nome completo do curso", color = Color(0xFFEFEBE7)) },
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFEFEBE7),
                focusedBorderColor = Color(0xFF36414E),
                unfocusedContainerColor = Color(0xFFf8f6f3),
                focusedContainerColor = Color(0xFFf0ede8),
                focusedTextColor = Color(0xFFa49d95),
                unfocusedTextColor = Color(0xFFc2bdb7),
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            shape = RoundedCornerShape(16.dp),
            value = course.shortname,
            onValueChange = onshortname,
            placeholder = { Text("Nome breve", color = Color(0xFFEFEBE7)) },
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFEFEBE7),
                focusedBorderColor = Color(0xFF36414E),
                unfocusedContainerColor = Color(0xFFf8f6f3),
                focusedContainerColor = Color(0xFFf0ede8),
                focusedTextColor = Color(0xFFa49d95),
                unfocusedTextColor = Color(0xFFc2bdb7),
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(
                shape = RoundedCornerShape(16.dp),
                value = course.type,
                onValueChange = ontype,
                placeholder = { Text("Categoria", color = Color(0xFFEFEBE7)) },
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEFEBE7),
                    focusedBorderColor = Color(0xFF36414E),
                    unfocusedContainerColor = Color(0xFFf8f6f3),
                    focusedContainerColor = Color(0xFFf0ede8),
                    focusedTextColor = Color(0xFFa49d95),
                    unfocusedTextColor = Color(0xFFc2bdb7),
                ),
                modifier = Modifier.weight(1f)
            )

            OutlinedTextField(
                shape = RoundedCornerShape(16.dp),
                value = course.worktime,
                onValueChange = onworktime,
                placeholder = { Text("Carga horária", color = Color(0xFFEFEBE7)) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEFEBE7),
                    focusedBorderColor = Color(0xFF36414E),
                    unfocusedContainerColor = Color(0xFFf8f6f3),
                    focusedContainerColor = Color(0xFFf0ede8),
                    focusedTextColor = Color(0xFFa49d95),
                    unfocusedTextColor = Color(0xFFc2bdb7),
                ),
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            shape = RoundedCornerShape(16.dp),
            value = course.shortdescription,
            onValueChange = onshortdescription,
            placeholder = { Text("Descrição curta", color = Color(0xFc2bdb7)) },
            maxLines = 3,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFEFEBE7),
                focusedBorderColor = Color(0xFF36414E),
                unfocusedContainerColor = Color(0xFFf8f6f3),
                focusedContainerColor = Color(0xFFf0ede8),
                focusedTextColor = Color(0xFFa49d95),
                unfocusedTextColor = Color(0xFFc2bdb7),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
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