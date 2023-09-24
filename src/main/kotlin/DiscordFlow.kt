import org.bukkit.plugin.java.JavaPlugin

class DiscordFlow : JavaPlugin()
{
    override fun onEnable()
    {
        logger.info("DiscordFlow enabled!")
    }

    override fun onDisable()
    {
        logger.info("DiscordFlow disabled!")
    }
}