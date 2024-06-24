package com.example.wargaku.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wargaku.ui.component.ButtonSelesai

@Composable
fun AddPeopleScreen() {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var agama by remember { mutableStateOf("") }
    var tanggal by remember { mutableStateOf("") }
    var isAssistanceReceived by remember { mutableStateOf(false) }
    var jenisBantuan by remember { mutableStateOf("") }
    var tahunBantuan by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                label = { Text(text = "Nama Kepala Keluarga") },
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                label = { Text(text = "Alamat Kepala Keluarga") },
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = agama,
                onValueChange = { agama = it },
                label = { Text(text = "Agama Kepala Keluarga") },
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = tanggal,
                onValueChange = { tanggal = it },
                label = { Text(text = "Tanggal Lahir Kepala Keluarga") },
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Pernah Menerima Bantuan?", modifier = Modifier.weight(1f))
                Switch(
                    checked = isAssistanceReceived,
                    onCheckedChange = { isAssistanceReceived = it }
                )
            }
            if (isAssistanceReceived) {
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = jenisBantuan,
                    onValueChange = { jenisBantuan = it },
                    label = { Text(text = "Jenis Bantuan") },
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = tahunBantuan,
                    onValueChange = { tahunBantuan = it },
                    label = { Text(text = "Tahun Bantuan") },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
        ButtonSelesai()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreviewAddPeopleScreen() {
    AddPeopleScreen()
}