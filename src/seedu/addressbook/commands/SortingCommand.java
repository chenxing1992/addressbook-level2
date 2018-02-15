package seedu.addressbook.commands;

import java.util.List;

import seedu.addressbook.data.person.ReadOnlyPerson;

public class SortingCommand extends Command {


    public static final String WORD_TO_SORT = "sorting";

    public static final String MESSAGE = WORD_TO_SORT
            + ":  The Address book will display person's list in alphabetical order\n"

            + "Example: " + WORD_TO_SORT;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.sort().getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
