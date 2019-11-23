package com.art.homework

interface SuggestionController<T> {
    fun search(find:String) : List <T>
    fun showAll(search:String)
    fun recent(): List<String>

}