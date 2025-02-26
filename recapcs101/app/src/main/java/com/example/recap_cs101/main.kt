package com.example.recap_cs101

class RedditPost(private val title: String) {
    var voteBalance: Int = 0;

    fun upvote() {
        println(this)
        voteBalance++;
    }

    override fun toString(): String {
        return "RedditPost(title='$title', voteBalance=$voteBalance)"
    }
}

fun main() {
    // Behavior vs state

    // Objects
//    val grinerPost = RedditPost("haha huskede i dengang...");
//    println(grinerPost.voteBalance)
//    grinerPost.upvote()
//    println(grinerPost.voteBalance)
//
//    val fodboldPost = RedditPost("Fodbold er bare mega fedt");
//    fodboldPost.upvote()


    // Trailing lambda
//    greeting("benjamin") { name ->
//        println("hej $name")
//        2
//    }
//
//    greeting("peter") {
//        println("👋")
//        2
//    }

    // Nullability
    val name: String? = null;

    if(name == null) {
        println("name is null")
    } else {
        println("name is defined")
    }

    // Debugging


    greeting {string ->
        println("Greeting from here")
        true
    }

}


fun greeting(greetingFromParameter: (String) -> Boolean) {
    greetingFromParameter("asdsd")
}

