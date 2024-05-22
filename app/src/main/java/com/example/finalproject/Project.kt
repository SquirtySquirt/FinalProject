package com.example.finalproject

data class Project(val name: String, val date: String, val info: String, var attending: Boolean, var index: Int, val link: String) {
val attend: String
    get() = if(attending) "Attending" else "Not Attending"

}