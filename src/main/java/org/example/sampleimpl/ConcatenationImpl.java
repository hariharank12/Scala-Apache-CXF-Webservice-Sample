/**
 * 
 */
package org.example.sampleimpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.example.sample.Concatenation;

/**
 * @author hkumar3
 *
 */
@WebService(endpointInterface = "org.example.sample.Concatenation")
public class ConcatenationImpl implements Concatenation {

	/* (non-Javadoc)
	 * @see org.example.sample.Concatenation#stringConcatenation(java.lang.String, java.lang.String)
	 */
	@WebResult(name = "s", targetNamespace = "")
	@RequestWrapper(localName = "stringConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenation")
	@ResponseWrapper(localName = "stringConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenationResponse")
	@WebMethod(action = "http://www.example.org/sample/stringConcatenation")
	public String stringConcatenation(
			@WebParam(name = "s1", targetNamespace = "") String s1,
			@WebParam(name = "s2", targetNamespace = "") String s2) {
		String s = s1 + s2;
		return s;
	}

	/* (non-Javadoc)
	 * @see org.example.sample.Concatenation#numberConcatenation(int, int)
	 */
	@WebResult(name = "i", targetNamespace = "")
	@RequestWrapper(localName = "numberConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenation")
	@ResponseWrapper(localName = "numberConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenationResponse")
	@WebMethod(action = "http://www.example.org/sample/numberConcatenation")
	public int numberConcatenation(
			@WebParam(name = "i1", targetNamespace = "") int i1,
			@WebParam(name = "i2", targetNamespace = "") int i2) {
		int i = i1 + i2; 
		return i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
