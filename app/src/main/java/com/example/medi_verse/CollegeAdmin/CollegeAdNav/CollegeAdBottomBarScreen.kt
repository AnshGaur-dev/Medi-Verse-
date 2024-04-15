package com.example.medi_verse.CollegeAdmin.CollegeAdNav

import com.example.medi_verse.R

sealed class CollegeAdBottomBarScreen(
    val route:String,
    val title:String,
    val drawableId: Int
) {
    object Home : CollegeAdBottomBarScreen(
        route = "home",
        title = "Home",
        drawableId = R.drawable.home
    )

    object Announcements : CollegeAdBottomBarScreen(
        route = "announcements",
        title = "Announcements",
        drawableId = R.drawable.annoucements
    )
}