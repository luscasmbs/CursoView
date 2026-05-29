package com.example.projetoteste.ui.components

import android.R
import android.R.attr.top
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CourseTextField(modifier: Modifier = Modifier, onValueChange: (String) -> Unit, value: String){

    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(0.92f)
                .fillMaxHeight(0.3f)
                .background(
                    Color(0xFFffffff),
                    shape = RoundedCornerShape(16.dp)

                )
                .border(
                    width = 0.5.dp,
                    color = Color(0xFFe8e4df),
                    shape = RoundedCornerShape(16.dp)
                )

        ) {

            Text(
                text = "DADOS DO CURSO",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFFc5c1bc),
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 16.dp, start = 15.dp)
            )
            OutlinedTextField(
                shape = RoundedCornerShape(16.dp),
                value = value,
                onValueChange = onValueChange,
                
                placeholder = {
                    Text(
                        text = "Nome completo do curso",
                        color = Color(0xFFefebe7)
                    )
                },
                singleLine = true,
                colors = androidx.compose.material3.OutlinedTextFieldDefaults.colors(
                    disabledBorderColor = Color(0xFFefebe7),
                    focusedBorderColor = Color(0xFF36414e)
                ),

                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .padding(top = 45.dp)
                    .align(Alignment.TopCenter)

            )
        }

    }
}
@Preview
@Composable
private fun CourseTextFieldPreview(){
    ProjetoTesteTheme {
        CourseFormSection(courseName = "",
            onCourseNameChange = {})
    }
}