class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		for(int i = 0; i<5; i++)
			System.out.println("Next val in sequence " + ob.getNext());
		System.out.println("\nReset to start val");
		ob.reset();
		for(int i = 0; i<5; i++)
			System.out.println("Next val in sequence " + ob.getNext());
                System.out.println("\nSet new start val");
		ob.setStart(100);
		for(int i = 0; i<5; i++)
                        System.out.println("Next val in sequence " + ob.getNext());

	}
}
