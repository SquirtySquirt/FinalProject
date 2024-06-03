package com.example.finalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProjectViewModel: ViewModel() {
    lateinit var _attend: MutableLiveData<Boolean>







    val projects = listOf(
      Project("South Abington Elementary Read Across America Night", "3/8/24", "South Abington Elementary school is hosting their annual Read Across America Night, Friday March 8th from 5–8pm.  There are three shifts that are available for this event.  The first shift from 5–6 is for set up, 6–7:30 is when the event starts volunteers are expected to hand out food, run games, and stock books, the final shift is 7:30–8pm is clean up.  Please contact Aimee Miller (aimeemillerptagmail.com) for questions or if you have to take your name of the sign up sheet.  You are more than welcome to sign up for multiple shifts.", true, 0, "https://docs.google.com/document/d/1LIyj3YEangilr2ZeTN8RJTv7hW54Z3vyUJYaxEX9fns/edit"  ),
       Project("Church of The Epiphany St. Patrick’s Fun Day","3/16/24", "Volunteers are expected to help with arts and crafts, apply temporary tattoos, photo booth for kids, manage snacks and drinks, manage games", false, 1, "https://docs.google.com/document/d/1ecRC7mtJGp1jg8GJcJ-kPAHJGQF_YezeNuVWZ4Zxoag/edit"),
        Project("AH Bunny Breakfast","3/16/24", "This year's Bunny Breakfast is on Saturday, March 16th from 10 am-12 pm. Our school is looking for volunteers to please come and help set up and work the breakfast. Volunteers are asked to come at 8:30 am to help set up and to wear pink. If you have the time, please consider signing up to keep this event going! ", false, 2, "https://docs.google.com/document/d/1XhDAbPZ1LSn_eLEhuwgpedH0_qhSmJU0y3PL3eGAwYQ/edit"),
        Project("Comm Bunny Breakfast","3/22/24-3/23/24", "Hi Interact! The Comm will be holding their own Bunny Breakfast on Saturday, March 23, from 9 am-12:30 pm. At least 10 volunteers are needed the day before, Friday, March 22nd from 6pm-7:30pm to help set up. The Comm is asking for 25 volunteers to help on Saturday. The event is trolls themed so volunteers are asked to dress in bright colors. If you have the time, please sign up!!", false, 3, "https://docs.google.com/document/d/1AybF7zs6E_fvJqnunZJAfvAq1K6KatGTHWdRoIhS0L0/edit"),
        Project("Parfait Day Fruit Cutting","3/21/24", "Hey Interact to help prepare for Parfait Day, we need A LOT of volunteers to help cut fruit for the parfaits.  We will begin cutting fruit during 9th mod in the cafeteria kitchen.  The fruit cutting will most likely continue after school please stay for as long as you can.  However if you have to leave after 9th mod no worries, or if you won't be here during 9th mod you can come after school to help.  There is no limit on volunteers, please sign up and tell your friends to sign up, the more people the faster it will go!", false, 4, "https://classroom.google.com/w/NjEyOTk2OTM1OTI2/t/all"),
        Project("Parfait Day Set up/serving/clean up","3/22/24", "We need volunteers to help set up for parfait day during 3rd mod, and serve parfaits during 4,5,6,7 mods (we also need three students to help pass out parfaits to those with lab, in outside the library near the english bathrooms), and clean up during 9th mod. (Cleanup will be as needed period 9) ", false, 5, "https://docs.google.com/document/d/1x1Sy7N6nfAXv7IBPbBdw3un9Cq4j0_f8iyZIijDHnu8/edit"),
        Project("Poetry in the Park","4/19/24", "Hi Interact! South Abington Elementary is looking for 5-6 volunteers max to assist with their “Poetry in the Park” event on April 19th from 6-7:30. This event will be in the South Abington Park pavilion. For students interested in English or poetry, this is a good opportunity to meet the guest speaker, Dawn Leas. She owns a writing consulting business and has years of experience in writing.", false, 6, "https://docs.google.com/document/d/1VfcjhNOpZLqOVM22Rrh74FmLPN006VsTh0_-8gsw248/edit"),
        Project("AH Junior High Track Invitational","4/27/24", "The invite is on Saturday April 27, and is a major fundraiser for the track and field and xc teams. There are three shifts from 7:30 am to 5:00 pm. They are looking for volunteers for set-up, clean-up, concessions, shirt sales, and general help with events. Please see the attached sign-up", false, 7, "https://docs.google.com/document/d/1ot3j39bLsCBr-7-raP-iPH3t-rMyV376DLHkjO3mD3M/edit"),
        Project("Abington Hill Cemetery Clean-Up","5/4/24", "We are looking for volunteers to help cleanup the Abington Hills Cemetery this Saturday! We will be picking up sticks, twigs, and branches from the lawn area and taking them to the woods. We also will be resetting any flags that have fallen over. If you can, please bring work gloves, rakes, wheelbarrows, tarps or bags to carry branches.", false, 8, "https://docs.google.com/document/d/1NP4IuvtWAiYG4TdpM-0jBZZH1eJoxuZJBiMgcKBnqNY/edit"),

   )
    fun setAttendingStatusForProject(index: Int) {
        projects[index].attending = true

    }
//    fun getAttendingStatusForProject(index: Int) {
//        return projects[index].attending
//
//    }
    fun removeAttendingStatusForProject(index: Int) {
        projects[index].attending = false

    }

}