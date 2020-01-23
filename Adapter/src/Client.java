

		public class Client {
		     public static void main(String[] args) {
		         Dengen d;

		         d = new AcAdapter();
		         int denatsu = d.kyuuden();
		         System. out .println( denatsu + "V で給電されています" );
		     }
		}

		interface Dengen { // Target
		     public int kyuuden();
		 }


		class JapaneseConsent {  // Adaptee
		    public int power() {
		         return 100;
		    }
		   Kyuuden()
		}

		}







