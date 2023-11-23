package com.example.quitzapp

data class Question(

    val id: Int,
    val questions: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    var correctAnswer: Int
)

object Constants {
    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTION: String="total_question"
    const val CORRECT_ANSWER:String="correct_answer"
    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Who is this Cricketer?",
            R.drawable.dhoni_image,
            "MS Dhoni",
            "Chris Gayle",
            "Rohit Sharma",
            "Virender Sehwag",
            1
        )

        val que2 = Question(
            2,
            "When was he born?",
            R.drawable.sharma,
            "05 April 1985",
            "30 April 1987",
            "14 August 1987",
            "07 July 1985",
            2
        )

        val que3 = Question(
            3,
            "Who is this Cricketer?",
            R.drawable.pant,
            "A B de Villiers",
            "Surya Kumar Yadav",
            "Ishan Kishan",
            "Rishabh Pant",
            4
        )

        val que4 = Question(
            4,
            "What is not his nickname?",
            R.drawable.kohli,
            "Run Machine",
            "King Kohli",
            "Panoti",
            "Chiku",
            3
        )

        val que5 = Question(
            5,
            "Which cricket format does he not play for India?",
            R.drawable.pandya,
            "T20",
            "ODI",
            "Test",
            "T10",
            3
        )

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)

        return questionList
    }
}
