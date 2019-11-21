package com.art.homework

interface SuggestionController<T> {
    fun search(search:String) : List <T>
    fun showAll()
    fun recent(): List<String>

}