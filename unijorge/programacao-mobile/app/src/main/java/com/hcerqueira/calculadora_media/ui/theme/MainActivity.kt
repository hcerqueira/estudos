package com.hcerqueira.calculadora_media

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraMediaApp()
        }
    }
}

@Composable
fun CalculadoraMediaApp() {
    // Variáveis para armazenar as notas digitadas
    var notaA1 by remember { mutableStateOf("") }
    var notaA2 by remember { mutableStateOf("") }
    var notaA3 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("Digite as notas e clique em Calcular") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Título do App
        Text(
            text = "Calculadora de Média EaD",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Campo para nota A1
        OutlinedTextField(
            value = notaA1,
            onValueChange = { notaA1 = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Nota A1") },
            placeholder = { Text("0 a 10") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo para nota A2
        OutlinedTextField(
            value = notaA2,
            onValueChange = { notaA2 = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Nota A2") },
            placeholder = { Text("0 a 10") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo para nota A3 (opcional)
        OutlinedTextField(
            value = notaA3,
            onValueChange = { notaA3 = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Nota A3 (opcional)") },
            placeholder = { Text("0 a 10") }
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Botão para calcular a média
        Button(
            onClick = {
                // Chama a função de cálculo quando clicado
                resultado = calcularMedia(notaA1, notaA2, notaA3)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("CALCULAR MÉDIA")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Exibe o resultado do cálculo
        Text(
            text = resultado,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

// Função que calcula a média seguindo as regras da instituição
private fun calcularMedia(notaA1: String, notaA2: String, notaA3: String): String {
    return try {
        // Verifica se as notas principais foram preenchidas
        if (notaA1.isEmpty() || notaA2.isEmpty()) {
            return "Preencha A1 e A2"
        }

        // Converte texto para números
        val a1 = notaA1.toDouble()
        val a2 = notaA2.toDouble()
        val a3 = if (notaA3.isEmpty()) 0.0 else notaA3.toDouble()

        // Verifica se as notas estão entre 0 e 10
        if (a1 !in 0.0..10.0 || a2 !in 0.0..10.0 || (a3 > 0 && a3 !in 0.0..10.0)) {
            return "Notas devem ser entre 0 e 10"
        }

        // REGRA: Se A3 for maior que A2, usa A3 no lugar de A2
        val notaFinalA2 = if (a3 > a2) a3 else a2

        // Fórmula: (A1 * 40%) + (A2 * 60%)
        val media = (a1 * 0.4) + (notaFinalA2 * 0.6)

        // Verifica se foi aprovado ou reprovado
        when {
            a1 == 0.0 -> "REPROVADO - A1 zerada"
            media >= 6.0 -> "APROVADO - Média: ${"%.1f".format(media)}"
            else -> "REPROVADO - Média: ${"%.1f".format(media)}"
        }

    } catch (e: Exception) {
        "Erro: Digite números válidos"
    }
}

// 🔍 PREVIEW - PARA VER NO ANDROID STUDIO SEM PRECISAR EXECUTAR
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCalculadoraMediaApp() {
    CalculadoraMediaApp()
}