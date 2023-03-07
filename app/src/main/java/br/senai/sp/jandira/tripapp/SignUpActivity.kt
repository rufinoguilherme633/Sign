package br.senai.sp.jandira.tripapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.tripapp.ui.theme.TripAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripAppTheme {

                Column() {
                    SignUpScreen()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 18.dp, end = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Column(
                modifier = Modifier.padding(bottom = 32.dp)
            ) {
                Text(
                    stringResource(id = R.string.sign_up),
                    color = colorResource(id = R.color.primary_color),
                    fontSize = 32.sp,
                )
                Text(
                    stringResource(id = R.string.create_account),
                    color = colorResource(id = R.color.secondary_color),
                    fontSize = 14.sp,
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(440.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                OutlinedTextField(
                    modifier = Modifier.width(320.dp),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            stringResource(id = R.string.username)
                        )
                    },
                    trailingIcon = { androidx.core.R.drawable.notification_bg },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    shape = RoundedCornerShape(20.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.width(320.dp),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            stringResource(id = R.string.phone)
                        )
                    },
                    trailingIcon = { androidx.core.R.drawable.notification_bg },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    shape = RoundedCornerShape(20.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.width(320.dp),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            stringResource(id = R.string.email)
                        )
                    },
                    leadingIcon = {  },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    shape = RoundedCornerShape(20.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.width(320.dp),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            stringResource(id = R.string.password)
                        )
                    },
                    trailingIcon = { androidx.core.R.drawable.notification_bg },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    shape = RoundedCornerShape(20.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Checkbox(checked = false, onCheckedChange = {})
                    Text(stringResource(id = R.string.over_18), fontSize = 14.sp)
                }
                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(320.dp)
                            .height(48.dp),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(
                            stringResource(id = R.string.sign_in),
                            color = Color.White,
                            fontSize = 16.sp,
                            //capitalizacao
                        )
                    }
                    Row(
                        modifier = Modifier.padding(top = 28.dp)
                    ) {
                        Text(
                            stringResource(
                                id = R.string.already_have_account
                            ),
                            color = colorResource(id = R.color.secondary_color),
                            fontSize = 12.sp,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            stringResource(
                                id = R.string.sign_in
                            ),
                            color = colorResource(id = R.color.primary_color),
                            fontSize = 12.sp,

                        )
                    }
                }
            }
        }
    }
}