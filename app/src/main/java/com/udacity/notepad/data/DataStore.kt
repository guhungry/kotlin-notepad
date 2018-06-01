package com.udacity.notepad.data

import android.content.Context
import org.jetbrains.anko.doAsync

object DataStore {
    @JvmStatic
    lateinit var notes: NoteDatabase
        private set

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(fn: () -> Unit) {
        doAsync { fn() }
    }
}
