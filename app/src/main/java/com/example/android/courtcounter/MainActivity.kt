/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.courtcounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
class MainActivity : AppCompatActivity() {

    // Tracks the score for Team A
    internal var scoreTeamA = 0

    // Tracks the score for Team B
    internal var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }
}
