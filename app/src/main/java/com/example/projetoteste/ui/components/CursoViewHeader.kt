package com.example.projetoteste.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoteste.R
import com.example.projetoteste.ui.theme.ProjetoTesteTheme

@Composable
fun CursoViewHeader(
    modifier: Modifier = Modifier
){
    Column(modifier = modifier.fillMaxWidth()){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF1d3557))

        ){
            Row(
                modifier = Modifier
                    .padding(12.dp)
                    .padding(top = 46.dp),
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically // Alinha verticalmente ao centro entre si
            ){
                Image(
                    painter = painterResource(id = R.drawable.chapeu),
                    contentDescription = "Logo do app",
                    modifier = Modifier.size(40.dp)
                        .clip(RoundedCornerShape(6.dp))
                )
                Text(

                    text = "CURSOVIEW",
                    modifier = Modifier.padding(start = 12.dp),
                    style = MaterialTheme.typography.labelSmall,
                    color = Color(0xFFa1baca),
                    fontSize = 13.sp,

                )
            }
            Text(
                text = "Cadastro Visual de Cursos",
                modifier = Modifier
                    .padding(top = 110.dp)
                    .padding(start = 12.dp),
                color = Color(0xFFF4F5F0),
                style = MaterialTheme.typography.labelSmall,
                fontSize = 23.sp

            )
            Text(
                text = "Monte a apresentação inicial de um curso\ntécnico.",
                modifier = Modifier
                    .padding(top = 145.dp)
                    .padding(start = 12.dp),
                color = Color(0xFF88a3b7),
                style = MaterialTheme.typography.labelSmall,
                fontSize = 13.sp
            )
        }
    }
}
 //a
@Preview
@Composable
private fun HeaderPreview(){
    ProjetoTesteTheme {
        CursoViewHeader()
    }
}