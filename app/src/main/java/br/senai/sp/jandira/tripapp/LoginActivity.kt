package br.senai.sp.jandira.tripapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.tripapp.ui.theme.TripAppTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripAppTheme {
                Column() {
                    LoginScreen()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(

            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            backgroundColor = Color.Magenta
        ) {
            Column(

                modifier = Modifier.fillMaxWidth(),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.susanna_profile),
                    contentDescription = stringResource(id = R.string.susanna_description),
                    modifier = Modifier
                        .size(62.dp)
                        .clip(shape = CircleShape)
                        .border(2.dp, Color.White, shape = CircleShape)
                )
                Text(stringResource(id = R.string.susanna_hoffs), color = Color.White)
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Row() {
                    Icon(
                        painter = painterResource(id = R.drawable.location_24),
                        contentDescription = stringResource(id = R.string.location_description),
                        tint = Color.White
                    )
                    Text(stringResource(id = R.string.youre_in_paris), color = Color.White)
                }
                Text(stringResource(id = R.string.my_trips))
            }
        }
    }
}