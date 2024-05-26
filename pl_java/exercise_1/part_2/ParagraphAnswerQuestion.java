package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

public class ParagraphAnswerQuestion extends Question{
    // attributes
 
    private String paragraphAnswer;
   

    // constructor
    public ParagraphAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.PARAGRAPH_ANSWER);
        setQuestionText(questionText);
    }

    // Getter
  

    public String getParagraphAnswer() {
        return paragraphAnswer;
    }

   

    // Setter

   
    public void setParagraphAnswer(String paragraphAnswer){
        this.paragraphAnswer=paragraphAnswer;
    }
   
}
