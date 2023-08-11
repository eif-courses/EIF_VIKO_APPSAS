package eif.viko.lt.appsas.eifas.feature_timetable.presentation.util

sealed class Screen(val route: String) {
    object TimetableScreen: Screen("timetable_screen")
}