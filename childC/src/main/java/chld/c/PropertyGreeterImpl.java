package chld.c;

import child.a.Greeter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyGreeterImpl implements Greeter {
    String target = "____";

    public PropertyGreeterImpl(String resource) throws IOException {
        Properties props = new Properties();
        InputStream is = InputStream.class.getResourceAsStream(resource);
        if (is != null) {
            props.load(is);
            target=props.getProperty("target");
            is.close();
        }
    }

    @Override
    public String getHello() {
        return getHello(target);
    }
}
