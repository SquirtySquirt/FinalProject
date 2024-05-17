package com.example.finalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProjectViewModel: ViewModel() {

    private var _index = MutableLiveData(0)
    val index: LiveData<Int>
        get() = _index


    val projects = listOf(
      Project("South Abington Elementary Read Across America Night", "3/8/24", "South Abington Elementary school is hosting their annual Read Across America Night, Friday March 8th from 5–8pm.  There are three shifts that are available for this event.  The first shift from 5–6 is for set up, 6–7:30 is when the event starts volunteers are expected to hand out food, run games, and stock books, the final shift is 7:30–8pm is clean up.  Please contact Aimee Miller (aimeemillerptagmail.com) for questions or if you have to take your name of the sign up sheet.  You are more than welcome to sign up for multiple shifts.", false),
       Project("Church of The Epiphany St. Patrick’s Fun Day","3/16/24", "Volunteers are expected to help with arts and crafts, apply temporary tattoos, photo booth for kids, manage snacks and drinks, manage games", false),

   )
    fun setAttendingStatusForProject(cheated: Boolean) {
        projects[index.value ?: 0].attending = true
    }
//    fun setIndex(index: LiveData<Int>){
//        var currentIndex = index.value ?: 0
//        _index = projects.num
//    }
}