package com.aleangelozi.espressotestkotlin

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentationTest {

    @Rule @JvmField
    val activityScenarioRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(
        MainActivity::class.java)

    @Test
    fun validateEditText() {
        typing()
        onView(withId(R.id.etInput)).check(matches(withText("Hello")))
    }

    @Test
    fun validateTextView() {
        typing()
        onView(withId(R.id.textView)).check(matches(withText("Hello")))
    }

    private fun typing() {
        onView(withId(R.id.etInput)).perform(typeText("Hello"))
    }
}