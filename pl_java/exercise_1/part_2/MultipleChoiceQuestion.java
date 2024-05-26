package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

import java.util.List;

public class MultipleChoiceQuestion extends Question {

    // Attribute


    private String multipleChoiceQuestion;
    private List<String> multipleChoiceOption;
  

    // constructor

    public MultipleChoiceQuestion(String questionText, List<String> choiceOption) {
        setQuestionText(questionText);
        setQuestionType(QuestionType.MULTIPLE_CHOICE);
        SetMultipleChoiceOption(choiceOption);
    }

    // getter

  

    public String getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }

    public List<String> getMultipleChoiceOption() {
        return multipleChoiceOption;
    }


    // setter

 

    public void setMultipleChoiceQuestion(String multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion;
    }

    public void SetMultipleChoiceOption(List<String> multipleChoiceOption) {
        this.multipleChoiceOption = multipleChoiceOption;
    }

  

}
