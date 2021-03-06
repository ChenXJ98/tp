package quickcache.logic.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quickcache.commons.core.Messages;
import quickcache.logic.commands.AddMultipleChoiceQuestionCommand;
import quickcache.logic.commands.AddOpenEndedQuestionCommand;
import quickcache.logic.commands.ClearCommand;
import quickcache.logic.commands.ClearStatsCommand;
import quickcache.logic.commands.Command;
import quickcache.logic.commands.DeleteCommand;
import quickcache.logic.commands.EditCommand;
import quickcache.logic.commands.ExitCommand;
import quickcache.logic.commands.ExportCommand;
import quickcache.logic.commands.FindCommand;
import quickcache.logic.commands.HelpCommand;
import quickcache.logic.commands.ImportCommand;
import quickcache.logic.commands.ListCommand;
import quickcache.logic.commands.OpenCommand;
import quickcache.logic.commands.StatsCommand;
import quickcache.logic.commands.TestCommand;
import quickcache.logic.parser.exceptions.ParseException;

/**
 * Parses user input.
 */
public class QuickCacheParser {

    /**
     * Used for initial separation of command word and args.
     */
    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("(?<commandWord>\\S+)(?<arguments>.*)");

    /**
     * Parses user input into command for execution.
     *
     * @param userInput full user input string
     * @return the command based on the user input
     * @throws ParseException if the user input does not conform the expected format
     */
    public Command parseCommand(String userInput) throws ParseException {
        final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
        if (!matcher.matches()) {
            throw new ParseException(String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE));
        }

        final String commandWord = matcher.group("commandWord");
        final String arguments = matcher.group("arguments");
        switch (commandWord) {

        case AddOpenEndedQuestionCommand.COMMAND_WORD:
            return new AddOpenEndedQuestionCommandParser().parse(arguments);

        case AddMultipleChoiceQuestionCommand.COMMAND_WORD:
            return new AddMultipleChoiceQuestionCommandParser().parse(arguments);

        case EditCommand.COMMAND_WORD:
            return new EditCommandParser().parse(arguments);

        case DeleteCommand.COMMAND_WORD:
            return new DeleteCommandParser().parse(arguments);

        case ClearCommand.COMMAND_WORD:
            return new ClearCommand();

        case FindCommand.COMMAND_WORD:
            return new FindCommandParser().parse(arguments);

        case ListCommand.COMMAND_WORD:
            return new ListCommand();

        case OpenCommand.COMMAND_WORD:
            return new OpenCommandParser().parse(arguments);

        case ExitCommand.COMMAND_WORD:
            return new ExitCommand();

        case HelpCommand.COMMAND_WORD:
            return new HelpCommand();

        case TestCommand.COMMAND_WORD:
            return new TestCommandParser().parse(arguments);

        case StatsCommand.COMMAND_WORD:
            return new StatsCommandParser().parse(arguments);

        case ExportCommand.COMMAND_WORD:
            return new ExportCommandParser().parse(arguments);

        case ImportCommand.COMMAND_WORD:
            return new ImportCommandParser().parse(arguments);

        case ClearStatsCommand.COMMAND_WORD:
            return new ClearStatsCommandParser().parse(arguments);

        default:
            throw new ParseException(Messages.MESSAGE_UNKNOWN_COMMAND);
        }
    }

}
