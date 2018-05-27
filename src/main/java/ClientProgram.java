
/**
 * @author vamsh
 * 
 *         Adapter P is a structural DP since it eases the design following
 *         programming to interfaces principle thus achieving loose coupling
 *
 *
 *		   2 main uses, 1. to just delegate to method with appropriate adaptee method
 *		   2. to make adaptee's o/p appropriately so that we meet client's needs
 *
 *         use case - traditionally our client program is happy with Xml o/p but
 *         man this time they insisted for json/csv so I had to design an
 *         adapter class to make clients happy.
 *         
 *         Different people use it differently
 *          one way is 
 *          https://www.youtube.com/watch?v=qG286LQM6BU&index=13&list=PLF206E906175C7E07
 *          or https://www.youtube.com/watch?v=Y7DYhe6efQY
 *          second way is 
 *          https://www.journaldev.com/1487/adapter-design-pattern-java
 *          or 
 *          https://www.youtube.com/watch?v=BMfc_oPwp3U
 *         
 *
 */
public class ClientProgram {

	public static void main(String[] args) {

		IClientHandle handle = new AdapterForSomeClass();

		// sometimes client can pass any other non-some class object in place of some
		// class this makes our adapter generic, in this case we are using default xml
		// generator we have
		// IClientHandle handle = new AdapterForSomeClass(nonSomeClassOject);

		
		// pass Json or Csv
		String result = handle.AppropriateFormatGenerator("Json");
		System.out.println(result);
		
		handle.JustDelegatingMethod();

	}

}
