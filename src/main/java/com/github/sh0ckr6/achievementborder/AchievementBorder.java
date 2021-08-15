package com.github.sh0ckr6.achievementborder;

import com.github.sh0ckr6.achievementborder.listeners.BorderControl;
import com.github.sh0ckr6.achievementborder.listeners.MobControl;
import com.github.sh0ckr6.achievementborder.listeners.WorldSetup;
import org.bukkit.advancement.Advancement;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class AchievementBorder extends JavaPlugin {
  
  public List<Advancement> advancements = new ArrayList<>();
  
  /**
   * Plugin setup
   *
   * @author sh0ckR6
   * @since 1.0
   */
  @Override
  public void onEnable() {
    // Plugin startup logic
    new BorderControl(this);
    new WorldSetup(this);
    new MobControl(this);
  }
  
  /**
   * Plugin tear-down
   *
   * @author sh0ckR6
   * @since 1.0
   */
  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
