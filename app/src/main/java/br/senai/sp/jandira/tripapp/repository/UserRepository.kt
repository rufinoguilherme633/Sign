package br.senai.sp.jandira.tripapp.repository

import android.content.Context
import br.senai.sp.jandira.tripapp.dao.TripDb
import br.senai.sp.jandira.tripapp.model.User

class UserRepository(context: Context) {

    //variavel que representa nosso banco de dados
    private val db = TripDb.getDataBase(context)

    //responsável por inserir um novo usuario no banco
    fun save(user: User): Long {
        return db.userDao().save(user)
    }

    fun delete(user: User) {
        db.userDao().delete(user)
    }

    fun findUserByEmail(email: String): User {
        return db.userDao().findUserByEmail(email)
    }

    fun authenticate(email: String, password: String): User {
        return db.userDao().authenticate(email, password)
    }
}