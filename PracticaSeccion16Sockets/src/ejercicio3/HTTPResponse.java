package ejercicio3;

import java.io.Serializable;
import java.util.Map;

public class HTTPResponse implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5329643621376607639L;
	private String body;
    private Map<String, String> headers;
    private int httpStatus;

    public HTTPResponse(String body, Map<String, String> headers, int httpStatus) {
        this.body = body;
        this.headers = headers;
        this.httpStatus = httpStatus;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
