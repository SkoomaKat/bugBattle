package org.foxgames.util;

import org.foxgames.enums.Choice;

public class ChoiceConverter {
    /**
     * Converts String input to the Choice enum equivalent.
     * @return The choice equivalent of the given string (capitalized). If no choices align with the given string then returns Choice.UNDEFINED
     */
    public static Choice getChoice(String choice) {
        try {
            return Choice.valueOf(choice.toUpperCase());
        } catch (IllegalArgumentException illegalArgumentException) {
            return Choice.INVALID;
        }
    }
}
