//package use_cases.categories.create_category;
//import entities.Category;
//import entities.CategoryCollection;
//
///**
// * -- Application Business Layer --
// * The use case Interactor that is responsible for creating a new category.
// */
//public class CreateCategory implements CreateCategoryInputBound {
//    private final CreateCategoryOutputBoundary outputBound;
//    private final CategoryCollection categories;
//    private CreateCategoryDsGateway dsGateway;
//
//    /**
//     * Constructor
//     * @param outputBound - the output boundary
//     * @param dsGateway - the database gateway interface
//     * @param categories    - the category collection of a specific user
//     */
//    public CreateCategory(CreateCategoryOutputBoundary outputBound, CreateCategoryDsGateway dsGateway, CategoryCollection categories) {
//        this.outputBound = outputBound;
//        this.categories = categories;
//        this.dsGateway = dsGateway;
//    }
//
//    /**
//     * Creates a new category.
//     * @param inputData - the name of the category that is to be created
//     * @return output data upon Category creation
//     */
//    @Override
//    public CreateCategoryOutputData create(CreateCategoryInputData inputData) {
//        if (inputData.getName().isBlank()) {
//            String error = "Error: Please enter the name of the category.";
//            return outputBound.prepareFailView(error);
//        } else if(this.categories.contains(inputData.getName(), false)){
//            String error ="Error: This category name already exists. Please enter a new category name.";
//            return outputBound.prepareFailView(error);
//        }
//        // no need to check for colour input cause UI will display drop down menu (no user error unless they're hackers)
//
//        Category category = new Category(inputData.getName(), inputData.getColour());
//        categories.addItem(category);
//        CreateCategoryOutputData outputData = new CreateCategoryOutputData(category);
//        return outputBound.prepareSuccessView(outputData);
//    }
//
//    /**
//     * outputBound getter
//     * @return the outputBound object
//     */
//    public CreateCategoryOutputBoundary getOutputBound() {
//        return this.outputBound;
//    }
//
//    /**
//     * collection getter
//     * @return the category collection of the user logged in
//     */
//    public CategoryCollection getCollection() {
//        return this.categories;
//    }
//}
