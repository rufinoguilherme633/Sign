package br.senai.sp.jandira.tripapp.gui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.tripapp.R
import br.senai.sp.jandira.tripapp.model.Category
import br.senai.sp.jandira.tripapp.model.Trip
import br.senai.sp.jandira.tripapp.repository.CategoryRepository
import br.senai.sp.jandira.tripapp.repository.TripRepository
import br.senai.sp.jandira.tripapp.ui.theme.TripAppTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
intent.extras
        Log.i( "ds2m", "id")

        setContent {
            TripAppTheme {
                Column() {
                    LoginScreen(
                        CategoryRepository.getCategories(), // quem chamar tem que passar uma lista de categorias e de viajens
                        TripRepository.getTrips())
                }
            }
        }
    }
}

//@Preview(showSystemUi = true)
@Composable
fun LoginScreen(categories: List<Category> , trips: List<Trip>) {
//    Surface(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Column() {
//            Card(
//                modifier = Modifier.height(197.dp),
//                elevation = 4.dp,
//                shape = RoundedCornerShape(size = 12.dp),
//                backgroundColor = Color.Magenta
//            ) {
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 12.dp, end = 12.dp),
//                    horizontalAlignment = Alignment.End
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.susanna_profile),
//
//                        contentDescription = stringResource(id = R.string.susanna_description),
//                        modifier = Modifier
//                            .size(62.dp)
//                            .clip(shape = CircleShape)
//                            .border(2.dp, Color.White, shape = CircleShape)
//                    )
//                    Text(
//                        text = stringResource(id = R.string.susanna_hoffs),
//                        modifier = Modifier.padding(top = 6.dp),
//                        color = Color.White
//                    )
//                }
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(start = 16.dp),
//                    verticalArrangement = Arrangement.Bottom
//                ) {
//                    Row() {
//                        Icon(
//                            painter = painterResource(id = R.drawable.location_24),
//                            contentDescription = stringResource(id = R.string.location_description),
//                            tint = Color.White
//                        )
//                        Text(stringResource(id = R.string.youre_in_paris), color = Color.White)
//                    }
//                    Text(
//                        text = stringResource(id = R.string.my_trips),
//                        modifier = Modifier.padding(start = 26.dp, bottom = 10.dp),
//                        color = Color.White,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                    )
//                }
//            }
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 16.dp),
//            ) {
//                Text(
//                    text = stringResource(id = R.string.categories),
//                )
//                LazyRow() {}
//                OutlinedTextField(
//                    modifier = Modifier.width(320.dp),
//                    value = "",
//                    onValueChange = {},
//                    label = {
//                        Text(
//                            stringResource(R.string.search_your_destiny)
//                        )
//                    },
//                    leadingIcon = {
//                        Icon(
//                            painter = painterResource(id = R.drawable.search_24),
//                            contentDescription = stringResource(R.string.search_your_destiny_description),
////
//                        )
//                    },
//                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
//                    shape = RoundedCornerShape(20.dp)
//                )
//                Text(text = "Past Trips")
//                LazyColumn() {}
//            }
//        }
//
//    }

    Column(modifier = Modifier.fillMaxSize()) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        shape = RectangleShape // retira os cantos arredondados
            ) {
            Image(painter = painterResource(id = R.drawable.paris),
                contentDescription = "Logo",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
                )
        }
        Text(
            text = stringResource(id =  R.string.categories),
            color = Color(56,54,54),
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
        )
        LazyRow() {
items(categories) {//a cadaiteracao me devolve uma categoria
    Card(
        modifier = Modifier
            .size(width = 109.dp, height = 100.dp)
            .padding(vertical = 8.dp, horizontal = 3.dp),
        backgroundColor = Color(206,6,240),

    ) {
Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
    ) {
    Image(painter = it.categoryIcon, contentDescription =it.categoryName )

    //Text(text = "${it.id} - ${it.categoryName}") //it ->
    Text(
        text = "${it.categoryName}",
        fontSize = 14.sp,
        color = Color.White

    ) //it ->
}
    }
}
        }

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            placeholder = {
                Text(text = stringResource(id = R.string.search_your_destiny))

            },
            trailingIcon = { // faz o icone ir para o final , e quando escrever ele nao vai desaparecer
                IconButton( //icone botao , metodo on click ja embutido
                    onClick = { }
                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription ="" )
                }
            }

            )
        Text(text = stringResource(id = R.string.past_trips))
LazyColumn() {
    items(trips) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            backgroundColor = Color.Cyan
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
    Image(painter = painterResource(id = R.drawable.no_photography_24), contentDescription ="" )

                Text(text = "${it.location}, ${it.startDate.year}")
                Text(text = "${it.description}")
                Text(
                    text = "${it.startDate} - ${it.endDate}",
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth()
                )

            }
            
        }
    }
}


        
    }
}

