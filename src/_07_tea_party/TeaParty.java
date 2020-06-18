package _07_tea_party;
public class TeaParty {
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	if (isWoman && isKnighted) {
        		return "Hello Lady " + name;
        		}
        	if (isKnighted) {
        	return "Hello Sir " +name; 
		}
        if (isWoman) {
			return "Hello Ms. " + name;
		}	
      
        else {
			return "Hello Mr. " + name;
		}
        }


}



