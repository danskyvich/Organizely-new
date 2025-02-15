package com.organizely.app.view

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organizely.app.R

class AuthEmailVerified : ComponentActivity() {

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun PageContent() {
        Row(Modifier.background(colorResource(R.color.auth_bg))
            .padding(30.dp, 30.dp, 30.dp, 40.dp)
            .fillMaxSize()) {
            Column(Modifier.fillMaxWidth()) {
                Row(Modifier.fillMaxWidth().weight(1f)) {}

                Image(
                    painter = painterResource(R.drawable.vector_email_vef_code),
                    contentDescription = "Verified icon",
                    Modifier.size(250.dp)
                        .align(Alignment.CenterHorizontally)
                    )
                
                Column(Modifier.fillMaxWidth()) {
                    Text("Your email has been verified!", fontSize = 35.sp, color = colorResource(R.color.white))
                    Text("Let's go!", fontSize = 19.sp, color = colorResource(R.color.white), modifier = Modifier.padding(top = 5.dp))
                }
                
                Row(Modifier.fillMaxWidth().weight(1f)) {}

                ContinueButton()
            }
        }
    }

    @Composable
    fun ContinueButton() {
        Button(
            onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(colorResource(R.color.yellow)),
            modifier = Modifier.fillMaxWidth()
                .height(60.dp)
        ) {
            Text("Continue", fontSize = 19.sp, color = colorResource(R.color.black))
        }
    }
}