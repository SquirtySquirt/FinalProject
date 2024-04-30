package com.example.finalproject

import androidx.lifecycle.ViewModel

class ProjectViewModel: ViewModel() {
    val projects = listOf(
      Project(R.string.nameOne, R.string.dateOne, R.string.infoOne, false),
       Project(R.string.nameTwo, R.string.dateTwo, R.string.infoTwo, false),

   )
}