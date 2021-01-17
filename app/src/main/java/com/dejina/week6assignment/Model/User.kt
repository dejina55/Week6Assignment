package com.dejina.week6assignment.Model

class User {

    fun Login(username: String, password: String): Boolean {
        return username.toLowerCase().equals("softwarica") &&
                password.toLowerCase().equals("coventry");
    }
}