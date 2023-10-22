package edu.curtin.myplugins.pluginA;

import edu.curtin.myapp.*;

public class PluginA implements AppPlugin{
    @Override
    public void startPlugin(AppPluginAPI api) {
        System.out.printf("%s %n", "This is a plugin doing this!!");
        System.out.printf("%s %n", api.getInfo());

    }
}
