package me.mykindos.betterpvp.core.logging.formatters.clans;

import me.mykindos.betterpvp.core.framework.annotations.WithReflection;
import me.mykindos.betterpvp.core.logging.LogContext;
import me.mykindos.betterpvp.core.logging.formatters.ILogFormatter;
import me.mykindos.betterpvp.core.utilities.UtilMessage;
import net.kyori.adventure.text.Component;

import java.util.HashMap;

@WithReflection
public class LeaveClanLogFormatter implements ILogFormatter {

    @Override
    public String getAction() {
        return "CLAN_LEAVE";
    }

    @Override
    public Component formatLog(HashMap<String, String> context) {
        return UtilMessage.deserialize("<yellow>%s</yellow> left clan <yellow>%s</yellow>",
                context.get(LogContext.CLIENT_NAME), context.get(LogContext.CLAN_NAME));
    }
}
