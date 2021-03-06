
package simple.api;

import simple.resource.cs.Cs;


/**
 * A String
 * 
 */
public class FooClient {

    private String _baseUrl;
    public final Cs cs;

    public FooClient(String baseUrl) {
        _baseUrl = baseUrl;
        cs = new Cs(getBaseUri());
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static FooClient create(String baseUrl) {
        return new FooClient(baseUrl);
    }

}
