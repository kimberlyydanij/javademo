package java019_inner.part04_OuterAnonymous;

public class OuterAnonymous {
	private int x;
	
	InnerAnonymous ta = new InnerAnonymous() {
		
		@Override
		void prn() {
			System.out.println("prn");
			
		}
	};
	
	public void dispaly() {
		ta.prn();
		
		new InnerAnonymous() {
			void prn(); {
			System.out.println("prn2");
		}
	}.prn();
} // end display()
} // end calss
