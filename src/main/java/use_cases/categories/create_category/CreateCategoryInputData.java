package use_cases.categories.create_category;

public class CreateCategoryInputData {
    // data structure class

    private final String inputName;
    private final String inputColour;

    /**
     * Constructor for a CreateCategoryInputData object.
     * @param inputName - the name of the category
     * @param inputColour - the colour of the category
     */

    public CreateCategoryInputData(String inputName, String inputColour) {
        this.inputName = inputName;
        this.inputColour = inputColour;
    }

    // getters
    public String getName() {
        return this.inputName;
    }

    public String getColour() {
        return this.inputColour;
    }

}
