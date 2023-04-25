package br.senai.sp.jandira.tripapp.repository

import br.senai.sp.jandira.tripapp.model.Trip
import java.time.LocalDate

class TripRepository {
    companion object {
        fun getTrips(): List<Trip> {
            return listOf(
                Trip(
                    id = 1,
                    location = "Jandira",
                    description = "Cidade Muito Bonita, com muitas opçoes de passeio",
                    startDate = LocalDate.of(2023,4,21),
                    endDate = LocalDate.of(2023,4,23),
                ),
                Trip(
                    id = 2,
                    location = "São Roque",
                    description = "Cidade Muito Bonita, visitei a vinicula Goés",
                    startDate = LocalDate.of(2023,4,21),
                    endDate = LocalDate.of(2023,4,23),
                ),
                Trip(
                    id = 3,
                    location = "Rio de Janeiro",
                    description = "Cidade Muito Bonita, com muitas opçoes de passeio,Cristo Redentor",
                    startDate = LocalDate.of(2023,4,21),
                    endDate = LocalDate.of(2023,4,23),
                )
            )
        }
    }
}