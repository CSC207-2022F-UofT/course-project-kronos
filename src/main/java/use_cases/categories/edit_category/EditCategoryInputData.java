package use_cases.categories.edit_category;

/**
 * -- Application Business Layer --
 *  This class is a container for the input data related to modification of category, it is created by the controller
 *  and sent to the interactor/use case
 */
public class EditCategoryInputData {
    private final Integer ID;
    private final String inputName;
    private final String inputColour;
    private final Boolean inputState;

    /**
     * Constructor for a EditCategoryInputData object.
     * @param ID- the category to be edited
     * @param inputName - the name of the category after editing is done
     * @param inputColour - the colour of the category after editing is done
     * @param inputState - the visibility state of the category after editing is done
     */

    public EditCategoryInputData(Integer ID, String inputName, String inputColour, Boolean inputState) {
        this.ID = ID;
        this.inputName = inputName;
        this.inputColour = inputColour;
        this.inputState = inputState;
    }

    /**
     * @return the ID of the category that's being edited
     */
    public Integer getId() { return this.ID; }
    /**
     * @return the name of the category that will be edited.
     */
    public String getName() { return this.inputName; }
    /**
     * @return the colour of the category that will be edited.
     */
    public String getColour() {
        return this.inputColour;
    }
    /**
     * @return the visibility state of the category that will be edited.
     */
    public Boolean getVisibility() {
        return this.inputState;
    }

}
