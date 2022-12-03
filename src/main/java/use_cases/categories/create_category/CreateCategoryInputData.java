package use_cases.categories.create_category;

/**
 * -- Application Business Layer --
 *  This class is a container for the input data related to creation of a category, it is created by the controller and
 *  sent to the interactor/use case
 */
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

    /**
     * @return the name of the category that will be created.
     */
    public String getName() {
        return this.inputName;
    }
    /**
     * @return the id of the category that will be created.
     */
    public String getColour() {
        return this.inputColour;
    }

}
