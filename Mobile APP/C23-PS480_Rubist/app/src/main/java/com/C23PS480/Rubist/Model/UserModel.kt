package com.C23PS480.Rubist.Model

data class UserModel(
    val uid: String,
    //val name: String,
    val isLogin: Boolean,
    val token: String = ""
)
