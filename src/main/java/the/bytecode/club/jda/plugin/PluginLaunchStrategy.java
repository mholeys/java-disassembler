package the.bytecode.club.jda.plugin;

import the.bytecode.club.jda.api.Plugin;

import java.io.File;

/**
 * @author Bibl (don't ban me pls)
 * @created 1 Jun 2015
 */
public interface PluginLaunchStrategy
{

    Plugin run(File file) throws Throwable;
}