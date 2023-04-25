package br.senai.sp.jandira.tripapp.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.tripapp.R
import br.senai.sp.jandira.tripapp.model.Category

class CategoryRepository {

    companion object {
        @Composable
        fun getCategories(): List<Category> {
            return listOf(
                Category(
                    id = 1,
                    categoryName = "Montain",
                    categoryIcon = painterResource(id = R.drawable.mountains),
                ),

                Category(
                    id = 2,
                    categoryName = "snow",
                    categoryIcon = painterResource(id = R.drawable.snowflake),
                ),
                Category(
                    id = 3,
                    categoryName = "ski",
                    categoryIcon = painterResource(id = R.drawable.ski),
                ),
            )

        }
    }

}