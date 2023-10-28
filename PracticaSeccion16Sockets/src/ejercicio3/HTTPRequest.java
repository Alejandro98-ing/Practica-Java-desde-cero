package ejercicio3;

import java.io.Serializable;
import java.util.Map;

public class HTTPRequest implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3510422481728061301L;
	private String body;
    private Map<String, String> headers;

    public HTTPRequest(String body, Map<String, String> headers) {
        this.body = body;
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}

