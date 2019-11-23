package com.art.homework

fun main() {
    val userSuggestionController: SuggestionController<User> = UserSuggestionController()
    val tagSuggestionController: SuggestionController<Tag> = TagSuggestionController()

    println("Please enter username or hashtags or Something else to exit program\nNote: hashtags should start with # and username with @")
    while (true) {
        val startSymbol = readLine()!!
        if (startSymbol.startsWith("@")) {
            when (startSymbol.length) {
                1 -> {
                    val recentUsers = userSuggestionController.recent()
                    println("searched users: $recentUsers")
                }
                else -> {
                    userSuggestionController.showAll(startSymbol.substring(1,startSymbol.length))
                    println("Type username that you interested in")
                    val username = readLine()!!
                    val searchedUsers = userSuggestionController.search(username)
                    println("searched users: $searchedUsers")
                }
            }
        } else if (startSymbol.startsWith("#")) {
            when (startSymbol.length) {
                1 -> {
                    val recentTags = tagSuggestionController.recent()
                    println("searched tags: $recentTags")
                }
                else -> {
                    tagSuggestionController.showAll(startSymbol.substring(1,startSymbol.length))
                    println("Type hashtag that you interested in")
                    val tag = readLine()!!
                    val searchedTags = tagSuggestionController.search(tag)
                    println("searched tags: $searchedTags")
                }
            }
        }
        else break
    }
}
