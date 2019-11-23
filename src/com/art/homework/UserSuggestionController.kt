package com.art.homework

class UserSuggestionController:SuggestionController<User> {

    override fun search(serchingfor:String) :List<User> {
        val find = userList.filter{ it.nickname.startsWith(serchingfor)}
        recentUser.addAll(find)
        return find
    }

    override fun showAll(serching:String){
        val find = userList.filter{ it.name.contains(serching,true)}
        println(find.map { it.nickname })
    }

    override fun recent() = recentUser.map{ it.nickname }



}