package com.amr.fitnesstracker.repository

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.amr.fitnesstracker.model.DailyFitnessModel
import com.amr.fitnesstracker.model.WeeklyFitnessModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

interface FitnessRepository {
    fun getDailyFitnessData(context: Context): MutableLiveData<DailyFitnessModel>
    fun getWeeklyFitnessData(context: Context): MutableLiveData<WeeklyFitnessModel>
    fun getGoogleAccount(context: Context): GoogleSignInAccount
}