package br.senai.sp.jandira.tripapp.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.tripapp.model.User

@Database(entities = [User::class], version = 3)
abstract class TripDb : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        private lateinit var instanceDb: TripDb

        fun getDataBase(context: Context): TripDb {
            if (!::instanceDb.isInitialized) {
                instanceDb = Room
                    .databaseBuilder(
                        context,
                        TripDb::class.java,
                        "db_trip"
                    ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
            }
            return instanceDb
        }
    }
}