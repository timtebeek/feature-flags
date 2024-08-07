# Feature flags
Feature flags are a powerful technique, allowing developers to modify system behavior without changing code.
They are used to hide, enable or disable certain features during runtime.
This can be useful for developers to test new features, perform A/B testing, etc.

## Feature flag life cycle with OpenRewrite recipes
This repository shows how you can use OpenRewrite recipes to find insertion points for feature flags in your codebase.
From there you can insert the conditional logic often associated with feature flags.
Next you can find any feature flags, or specific feature flags, throughout your code base.
Finally, you can remove feature flags that are no longer needed.

## How to run the recipes

1. Clone this repository.
2. Open IntelliJ IDEA Ultimate 2024.2+, with built-in support for OpenRewrite.
3. Open `src/main/java/io/moderne/books/BooksController.java`.
4. Open `./rewrite.yml`.
   a. There are four recipes in separate YAML documents.
   b. Note the run icons in the sidebar.
5. Run the first recipe: `FindInsertionPoints`.
   a. See the `/*~~>*/` appear in `BooksController.java`.
6. Remove the original `search(String query)` and uncomment the alternative.
   a. Notice the call to OpenFeature Client to check if the feature is enabled.
7. Run the second recipe: `FindAnyFeatureFlags`.
   a. See the search marker appear before `client.getBooleanValue(...)`.
   b. Remove the search marker.
8. Run the third recipe: `FindSpecificFeatureFlags`.
   a. See the search marker appear before `client.getBooleanValue(...)`.
9. Run the final fourth recipe: `RemoveFeatureFlags`.
   a. See the `client.getBooleanValue(...)` call disappear.
   b. Notice how just the code path from the `if` block is retained.

## Conclusion
Using these recipes you can easily find insertion points for feature flags, find feature flags in use, and remove feature flags.
While the example uses OpenFeature, similar recipes are availabled for other SDKs as well, as well as custom feature flag implementations.

Learn more at https://github.com/openrewrite/rewrite-feature-flags &  
https://www.moderne.ai/blog/streamline-feature-flag-management-automate-removal-with-openrewrite-moderne
