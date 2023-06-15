package dzr.hanom.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
        "file:~/${env}.properties",
        "file:./${env}.properties"
})
public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();
    @Key("browserVersion")
    String browserVersion();
    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();
    @Key("baseUrl")
    @DefaultValue("https://cloudmaster.ru/")
    String baseUrl();
    @Key("isRemote")
    @DefaultValue("true")
    boolean isRemote();
    @Key("remoteUrl")
    String remoteUrl();
}
