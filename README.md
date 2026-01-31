# Funproximaster

a NogyangSpigot Slimefun Plugin Powered by <a href="https://github.com/kangarko/Foundation"><img width="150" height="30" alt="스크린샷 2026-01-31 222234" src="https://github.com/user-attachments/assets/295e6a12-03cb-450c-acac-cc3924076681" /></a>

> [!CAUTION]
> 해당 플러그인은 1.21.11 이후 버전, 즉 연도 기반 체계가 적용된 버전에서는 작동이 되지 않도록 의도되었습니다.\
> (플러그인이 적용된 상태로 최신 버전 클라이언트 접속도 허용하시고 싶으시면 ViaVersion 플러그인을 적용하시기 바랍니다.)\
> 자세한 내용은 https://netgames.approximasterstudios2004.ddnsgeek.com/v26andabove.html 을 확인하십시오.

> [!CAUTION] 
> This Plugin is Intended to Disable themselves On the version higher than 1.21.11. Please Use ViaVersion/Backwards/Rewind Plugin to Allow 26.1 and above joining your server whilst using this plugin.
> for more info: please check https://netgames.approximasterstudios2004.ddnsgeek.com/v26andabove.html .

# Slimefun4 Addon
This is an example Repository for a generic Slimefun4 Addon.
In the top left is a button "Use this template", click this to create your own Addon for Slimefun4 using this basic template.

## How to create your own addon.
This is a template repository that you can use to create your own Slimefun4 Addon.<br>
We have also written an extensive step-by-step tutorial which you can find here:<br>
https://github.com/Slimefun/Slimefun4/wiki/Developer-Guide

## Changing some important things
Navigate to `src/main/java` and rename the package and the .java File to your liking.<br>
Suggestion: "me.yourname.yourproject" (all lower case) and "ProjectName.java"<br>
Example: "me.thebusybiscuit.cooladdon" and "CoolAddon.java"

Navigate to `src/main/resources/plugin.yml` and change the "author" and "main" attributes.
You may also want to change the description to something meaningful.

Navigate to `pom.xml` and change the group id to "me.%Your name%" and change the artifact id to the name of your Project.

After that you are good to go, you can now start developing your own Addon for Slimefun4.
