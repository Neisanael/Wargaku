package com.example.wargaku.ui.component

import android.widget.RatingBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardPenduduk(modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFAFDDE5)
        ),
        modifier = Modifier
            .padding(10.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = "Paimon",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Column {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(3.dp)
            ) {
                Text(
                    text = "Jumlah Keluarga", modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp)
                )
                Text(text = ": 4", modifier = Modifier.weight(1f))
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(3.dp)
            ) {
                Text(
                    text = "Bantuan", modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp)
                )
                Text(text = ": Ya", modifier = Modifier.weight(1f))
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(3.dp)
            ) {
                Text(
                    text = "Agama", modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp)
                )
                Text(text = ": Muslim", modifier = Modifier.weight(1f))
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(3.dp)
            ) {
                Text(
                    text = "Alamat", modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp)
                )
                Text(
                    text = ": Jl Diponegoro asdfwqrjlaksjdlfkjowe oajsofjd",
                    modifier = Modifier.weight(1f)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewCardPenduduk() {
    CardPenduduk()
}