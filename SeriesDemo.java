class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		ByThrees ob3 = new ByThrees();
		//последовательность через 2
		for(int i = 0; i<5; i++)
			System.out.println("Next val in sequence " + ob.getNext());
		System.out.println("last previous value: " + ob.getPrevious());

		System.out.println("\nReset to start val");
		ob.reset();
		for(int i = 0; i<5; i++)
			System.out.println("Next val in sequence " + ob.getNext());
		System.out.println("last previous value: " + ob.getPrevious());

                System.out.println("\nSet new start val");
		ob.setStart(100);
		for(int i = 0; i<5; i++)
                        System.out.println("Next val in sequence " + ob.getNext());
		System.out.println("last previous value: " + ob.getPrevious());
		
		//последовательность через 3
		System.out.println();
		System.out.println("\nNew sequence");

		for(int i = 0; i<5; i++)
                        System.out.println("Next val in sequence " + ob3.getNext());
                //System.out.println("last previous value: " + ob3.getPrevious());

                System.out.println("\nReset to start val");
                ob3.reset();
                for(int i = 0; i<5; i++)
                        System.out.println("Next val in sequence " + ob3.getNext());
                //System.out.println("last previous value: " + ob3.getPrevious());

                System.out.println("\nSet new start val");
                ob3.setStart(100);
                for(int i = 0; i<5; i++)
                        System.out.println("Next val in sequence " + ob3.getNext());
                //System.out.println("last previous value: " + ob3.getPrevious());
		Series obInt;

		for(int i = 0; i<5; i++) {
			obInt = ob;
                        System.out.println("Next val in ByTwos sequence " + obInt.getNext());
			obInt = ob3;
			System.out.println("Next val in ByThrees sequence " + obInt.getNext());
		}
	}
}
