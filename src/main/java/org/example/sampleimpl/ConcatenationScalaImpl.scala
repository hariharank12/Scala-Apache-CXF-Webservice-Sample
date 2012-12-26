/**
 *
 */
package org.example.sample

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
class ConcatenationScalaImpl extends Concatenation {
  
	/* (non-Javadoc)
	 * @see org.example.sample.Concatenation#stringConcatenation(java.lang.String, java.lang.String)
	 */
	@WebResult(name = "s", targetNamespace = "")
	@RequestWrapper(localName = "stringConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenation")
	@ResponseWrapper(localName = "stringConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenationResponse")
	@WebMethod(action = "http://www.example.org/sample/stringConcatenation")
	override def stringConcatenation(
			@WebParam(name = "s1", targetNamespace = "") s1: String,
			@WebParam(name = "s2", targetNamespace = "") s2: String): String = {
		val s:String = s1 + s2
		s
	}

	/* (non-Javadoc)
	 * @see org.example.sample.Concatenation#numberConcatenation(int, int)
	 */
	@WebResult(name = "i", targetNamespace = "")
	@RequestWrapper(localName = "numberConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenation")
	@ResponseWrapper(localName = "numberConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenationResponse")
	@WebMethod(action = "http://www.example.org/sample/numberConcatenation")
	//public int numberConcatenation(
	override def numberConcatenation(
			@WebParam(name = "i1", targetNamespace = "") i1: Int,
			@WebParam(name = "i2", targetNamespace = "") i2: Int): Int = {
		println("I am number concatenation from scala");
		val i: Int = i1 + i2 
		i
	}
  

}