package com.hcerqueira.calculadora_media

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraMediaApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculadoraMediaApp() {
    var notaA1 by remember { mutableStateOf("") }
    var notaA2 by remember { mutableStateOf("") }
    var notaA3 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("Sua média aparecerá aqui") }
    var corResultado by remember { mutableStateOf(androidx.compose.ui.graphics.Color.Black) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(
            text = "Calculadora de Média EaD",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        // Campo Nota A1
        Text(
            text = "Nota A1 (0-10)",
            modifier = Modifier.align(Alignment.Start)
        )
        OutlinedTextField(
            value = notaA1,
            onValueChange = { notaA1 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Digite a nota A1") },
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo Nota A2
        Text(
            text = "Nota A2 (0-10)",
            modifier = Modifier.align(Alignment.Start)
        )
        OutlinedTextField(
            value = notaA2,
            onValueChange = { notaA2 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Digite a nota A2") },
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo Nota A3 (Opcional)
        Text(
            text = "Nota A3 (0-10) - Opcional",
            modifier = Modifier.align(Alignment.Start)
        )
        OutlinedTextField(
            value = notaA3,
            onValueChange = { notaA3 = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Digite a nota A3 (se houver)") },
            singleLine = true
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Botão Calcular
        Button(
            onClick = {
                calcularMedia(notaA1, notaA2, notaA3) { media, a1 ->
                    val (texto, cor) = when {
                        a1 > 0 && media >= 6.0 -> "Média Final: ${"%.1f".format(media)}\n🎉 APROVADO!" to androidx.compose.ui.graphics.Color.Green
                        a1 == 0.0 -> "❌ REPROVADO (A1 = 0)" to androidx.compose.ui.graphics.Color.Red
                        else -> "Média Final: ${"%.1f".format(media)}\n❌ REPROVADO" to androidx.compose.ui.graphics.Color.Red
                    }
                    resultado = texto
                    corResultado = cor
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("CALCULAR MÉDIA")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Resultado
        Text(
            text = resultado,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = corResultado
        )
    }
}

private fun calcularMedia(
    strA1: String,
    strA2: String,
    strA3: String,
    onResult: (Double, Double) -> Unit
) {
    try {
        if (strA1.isEmpty() || strA2.isEmpty()) {
            return
        }

        val a1 = strA1.toDouble()
        val a2 = strA2.toDouble()
        val a3 = if (strA3.isEmpty()) 0.0 else strA3.toDouble()

        if (a1 !in 0.0..10.0 || a2 !in 0.0..10.0 || (a3 > 0 && a3 !in 0.0..10.0)) {
            return
        }

        val notaA2 = if (a3 > a2) a3 else a2
        val media = (a1 * 0.4) + (notaA2 * 0.6)

        onResult(media, a1)
    } catch (e: NumberFormatException) {
        // Ignora erro
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCalculadoraMediaApp() {
    CalculadoraMediaApp()
}