/**
 * A response message from a RMI Server to a client to return the result from a RMIRequest.
 * If isThrowable is true, the request resulted in an error.
 * Author: Vansi Vallabhaneni
 */

package rmi;

public class RMIResponse implements RMIMessage {
	private static final long serialVersionUID = 8578409383104557400L;
	public Object response;
	public boolean isError;
	public RemoteObjectReference ror;
	
	/**
	 * Constructor for RMIResponse.
	 * @param ror
	 * @param response
	 * @param isThrowable
	 */
	public RMIResponse(RemoteObjectReference ror, Object response, boolean isError) {
		this.ror = ror;
		this.response = response;
		this.isError = isError;
	}
}
