package com.art.homework

class TagSuggestionController:SuggestionController<Tag> {
    override fun search(serchingfor:String) :List<Tag> {
        val find = tagList.filter{ it.tag ==serchingfor}
        recentTag.addAll(find)
        return find
    }

    override fun showAll(serching:String){
        val find = tagList.filter{ it.tag.contains(serching,true)}
        println(find.map { it.tag })
    }

    override fun recent() = recentTag.map{ it.tag }
}