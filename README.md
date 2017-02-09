# FlooringCalculator
School Thing

	public static void main(String[] args) {
			RoomDimensions roomDim = new RoomDimensions(0,0);
			RoomFlooring roomFloor = new RoomFlooring(roomDim);
			Scanner scan = new Scanner(System.in);

			String anotherRoom = "yes";
			String changePrice = "no";
			String priceValueSet = "8";
			boolean valSet = true;

			System.out.println("Welcome to the Flooring Calculator!");
			System.out.println();

			while (!"NO".equals(anotherRoom) && !"No".equals(anotherRoom) && !"no".equals(anotherRoom) && !"N".equals(anotherRoom) && !"n".equals(anotherRoom)) {
				System.out.print("The current Price/Foot is set at ");
				System.out.println(roomFloor.cost());

				System.out.println("Would you like to change that value? (Yes/No)");
				changePrice = scan.next();
				System.out.println();

				if (!"NO".equals(changePrice) && !"No".equals(changePrice) && !"no".equals(changePrice) && !"N".equals(changePrice) && !"n".equals(changePrice)) {
					do {
						System.out.println("What would you like to change the value to?");
						priceValueSet = scan.next();
						System.out.println();

						try {
							roomFloor.modCost(priceValueSet);
							System.out.println("Price is set.");
							valSet = true;
						}
						catch (NumberFormatException nfe) {
							System.out.println("That was not a number!");
							valSet = false;
						}
						finally {
							System.out.println();
						}
					} while (valSet=false);
				}

				do {
					try {
						System.out.println("What is the length?");
						String length = scan.next();
						System.out.println();

						System.out.println("What is the width?");
						String width = scan.next();
						System.out.println();

						roomDim.modArea(Float.valueOf(length), Float.valueOf(width));

						System.out.print("The Area stored is: ");
						System.out.println(String.valueOf(roomDim.area()));

						System.out.print("The price calculated is: ");
						System.out.println(String.valueOf(roomFloor.totalCost()));
						System.out.println();
						valSet = true;
					}
					catch (NumberFormatException nfe) {
						System.out.println("One of those was not a number!");
						valSet = false;
					}
				} while (valSet == false);

				System.out.println("Would you like to calculate another? (Yes/No)");
				anotherRoom = scan.next();
				System.out.println();		
			}
			
			scan.close();
		}
