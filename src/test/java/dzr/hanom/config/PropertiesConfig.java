package dzr.hanom.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import static org.aeonbits.owner.Config.*;


public class PropertiesConfig {

    private static Class<? extends PropertiesInterface> getPropertySource() {
        String env = System.getProperty("env");
        if (env == null || env.equals("null")) {
            return PropInterfaceTest.class;
        } else if (env.equals("test")) {
            return PropInterfaceTest.class;
        } else {
            throw new RuntimeException("Invalid value for system property 'env'! Expected one of:[null, 'test']");
        }
    }
    public static final PropertiesInterface PROP = ConfigFactory.create(getPropertySource(), System.getProperties());

    @LoadPolicy(LoadType.MERGE)
    @Sources({"system:properties", "classpath:test.properties"})
    interface PropInterfaceTest extends PropertiesInterface {
    }

    public interface PropertiesInterface extends Config {
        @DefaultValue("chrome")
        @Key("webBrowserName")
        String getBrowserName();

        @Key("webBrowserVersion")
        String getBrowserVersion();

        @Key("webBaseUrl")
        String getBaseUrl();

        @Key("apiBaseUrl")
        String getApiBaseUrl();

        @Key("webBrowserSize")
        String getBrowserSize();

        @Key("pageLoadStrategy")
        @DefaultValue("normal")
        String getPageLoadStrategy();

        @Key("webIsRemote")
        Boolean isRemote();

        @Key("webRemoteUrl")
        String getRemoteUrl();

        @DefaultValue("false")
        @Key("webIsHeadless")
        Boolean isHeadless();


        @Key("buildName")
        String getBuildName();
    }
}
